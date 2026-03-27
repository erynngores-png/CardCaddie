import java.util.List;

public class Eligibility {

    //used to determine whether a card can be used at different stores
    public static boolean isEligible(Card card, Store store, List<String> restrictedNetworks) {

        if (restrictedNetworks == null || restrictedNetworks.isEmpty()) {
            return true;
        }

        return !restrictedNetworks.contains(card.getNetwork());
    }
}
