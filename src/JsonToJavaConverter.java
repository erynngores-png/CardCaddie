import java.util.HashMap;
import java.util.Map;

public class JsonToJavaConverter {

    public static Card convertCard(CardJson cardJson) {
        // Convert rewards map to Double values
        Map<String, Double> rewards = new HashMap<>();
        cardJson.getRewards().forEach((k, v) -> rewards.put(k, v.doubleValue()));

        return new Card(
                cardJson.getId(),
                cardJson.getName(),
                cardJson.getIssuer(),
                cardJson.getNetwork(),
                cardJson.getAnnual_fee(),
                rewards
        );
    }

    public static Category convertCategory(CategoryJson categoryJson) {
        return new Category(
                categoryJson.getId(),
                categoryJson.getName(),
                categoryJson.getAliases()
        );
    }

    public static Store convertStore(StoreJson storeJson) {
        return new Store(
                storeJson.getId(),
                storeJson.getName(),
                storeJson.getCategory(),
                storeJson.getRestricted_networks(),
                storeJson.getNotes()
        );
    }

    public static Wallet convertWallet(WalletJson walletJson, Map<String, Card> cardMap) {
        Wallet wallet = new Wallet(walletJson.getId(), walletJson.getName());

        // Add Card objects by looking them up in the cardMap
        for (String cardId : walletJson.getCards()) {
            Card card = cardMap.get(cardId);
            if (card != null) {
                wallet.addCard(card);
            }
        }

        return wallet;
    }


    // Convert all CardJson objects into Card objects and map them by ID
    Map<String, Card> cardMap = new HashMap<>();
    for (CardJson cj : data.getCards()) {   // 'data' is your DataJson object
        Card card = JsonToJavaConverter.convertCard(cj);
        cardMap.put(card.getId(), card);
    }

    // Now you can convert wallets
    for (WalletJson wj : data.getWallets()) {
        Wallet wallet = JsonToJavaConverter.convertWallet(wj, cardMap);
        // store or use 'wallet' in your ranking system
    }
}
