import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        try {
            // 1️⃣ Read and parse the JSON file
            ObjectMapper mapper = new ObjectMapper();
            DataJson data = mapper.readValue(new File("data.json"), DataJson.class);

            // 2️⃣ Convert CardJson → Card and build a cardMap
            Map<String, Card> cardMap = new HashMap<>();
            for (CardJson cj : data.getCards()) {
                Card card = JsonToJavaConverter.convertCard(cj);
                cardMap.put(card.getId(), card);
            }

            // 3️⃣ Convert StoreJson → Store
            Map<String, Store> storeMap = new HashMap<>();
            for (StoreJson sj : data.getStores()) {
                Store store = JsonToJavaConverter.convertStore(sj);
                storeMap.put(store.getId(), store);
            }

            // 4️⃣ Convert WalletJson → Wallet
            Map<String, Wallet> walletMap = new HashMap<>();
            for (WalletJson wj : data.getWallets()) {
                Wallet wallet = JsonToJavaConverter.convertWallet(wj, cardMap);
                walletMap.put(wallet.getId(), wallet);
            }

            // 5️⃣ Example: rank cards for a store and wallet
            String storeId = "chipotle";      // choose a store
            String walletId = "wallet_2";     // choose a wallet

            Store store = storeMap.get(storeId);
            Wallet wallet = walletMap.get(walletId);

            if (store == null || wallet == null) {
                System.out.println("Store or wallet not found.");
                return;
            }

            // Use existing Ranking class to get ranked cards
            List<Card> rankedCards = Ranking.getRankedCards(wallet, store, store.getRestrictedNetworks());

            // 6️⃣ Print the results
            System.out.println("Ranking for store: " + store.getName());
            System.out.println("Wallet: " + wallet.getName());
            for (int i = 0; i < rankedCards.size(); i++) {
                Card c = rankedCards.get(i);
                double rate = c.getRewardForCategory(store.getCategory());
                System.out.printf("%d. %s - %.1f%%\n", i + 1, c.getName(), rate);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}