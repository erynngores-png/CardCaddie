import java.util.ArrayList;
import java.util.List;

public class Ranking {

    public static Card getBestCard(Wallet wallet, Store store, List<String> restrictedNetworks) {

        Card bestCard = null;
        double bestReward = -1;

        for (Card card : wallet.getCards()) {

            if (!Eligibility.isEligible(card, store, restrictedNetworks)) {
                continue;
            }

            double reward = card.getRewardForCategory(store.getCategory());

            if (reward > bestReward) {
                bestReward = reward;
                bestCard = card;
            }
        }

        return bestCard;
    }

    public static List<Card> getRankedCards(Wallet wallet, Store store, List<String> restrictedNetworks) {

        List<Card> eligibleCards = new ArrayList<>();
        List<Card> rankedCards = new ArrayList<>();

        for (Card card : wallet.getCards()) {
            if (Eligibility.isEligible(card, store, restrictedNetworks)) {
                eligibleCards.add(card);
            }
        }

        while (!eligibleCards.isEmpty()) {

            Card bestCard = null;
            double bestReward = -1;

            for (Card card : eligibleCards) {
                double reward = card.getRewardForCategory(store.getCategory());

                if (reward > bestReward) {
                    bestReward = reward;
                    bestCard = card;
                }
            }

            rankedCards.add(bestCard);
            eligibleCards.remove(bestCard);
        }

        return rankedCards;
    }
}
