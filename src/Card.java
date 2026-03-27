import java.util.Map;

//represents a credit card that has a unique id, a name, issuer, network, and annual fee
//the card contains a list of rewards based on spending category
public class Card {
    private String id;
    private String name;
    private String issuer;
    private String network;
    private int annualFee;
    private Map<String, Double> rewards;

    //creates a new card object with a name, issue, network, annual fee, and rewards
    public Card(String id,
                String name,
                String issuer,
                String network,
                int annualFee,
                Map<String, Double> rewards) {
       //setters
        this.id = id;
        this.name = name;
        this.issuer = issuer;
        this.network = network;
        this.annualFee = annualFee;
        this.rewards = rewards;
    }

    //getters
    public String getId() { return id; }
    public String getName() { return name; }
    public String getIssuer() { return issuer; }
    public String getNetwork() { return network; }
    public int getAnnualFee() { return annualFee; }
    public Map<String, Double> getRewards() { return rewards; }

    //getter
    public double getRewardForCategory(String category) {
        return rewards.getOrDefault(category, rewards.getOrDefault("default", 0.0));
    }
}