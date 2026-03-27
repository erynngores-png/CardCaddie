import java.util.ArrayList;
import java.util.List;

//used to rank cards based on their rewards for a given store
//uses eligibility to filter out cards that cannot be used at a given store
public class Ranking {

    //returns the best card from a wallet form a given store
    public static Card getBestCard(Wallet wallet, Store store, List<String> restrictedNetworks) {

        Card bestCard = null;
        double bestReward = -1;

        for (Card card : wallet.getCards()) {

            //skip cards that aren't eligible at this store
            if (!Eligibility.isEligible(card, store, restrictedNetworks)) {
                continue;
            }

            //get the reward rate for this store's category
            double reward = card.getRewardForCategory(store.getCategory());

            //saves the best card
            if (reward > bestReward) {
                bestReward = reward;
                bestCard = card;
            }
        }

        return bestCard;
    }

    //returns a list of all eligible cards from a wallet, ranked from best to worst reward for a given store's category
    public static List<Card> getRankedCards(Wallet wallet, Store store, List<String> restrictedNetworks) {

        List<Card> eligibleCards = new ArrayList<>();
        List<Card> rankedCards = new ArrayList<>();

        //filters out cards that aren't eligible
        for (Card card : wallet.getCards()) {
            if (Eligibility.isEligible(card, store, restrictedNetworks)) {
                eligibleCards.add(card);
            }
        }

        //rank eligible cards
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

            //add the best card to the ranked list, and remove it from eligible cards
            rankedCards.add(bestCard);
            eligibleCards.remove(bestCard);
        }

        return rankedCards;
    }
}
