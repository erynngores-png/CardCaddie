import java.util.List;

public class Eligibility {

    public static boolean isEligible(Card card, Store store, List<String> restrictedNetworks) {

        if (restrictedNetworks == null || restrictedNetworks.isEmpty()) {
            return true;
        }

        return !restrictedNetworks.contains(card.getNetwork());
    }
}
