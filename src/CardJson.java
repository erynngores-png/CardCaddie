import java.util.Map;

public class CardJson {
    private String id;
    private String name;
    private String issuer;
    private String network;
    private int annual_fee;  // match JSON naming
    private Map<String, Double> rewards;

    // Getters & setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getIssuer() { return issuer; }
    public void setIssuer(String issuer) { this.issuer = issuer; }

    public String getNetwork() { return network; }
    public void setNetwork(String network) { this.network = network; }

    public int getAnnual_fee() { return annual_fee; }
    public void setAnnual_fee(int annual_fee) { this.annual_fee = annual_fee; }

    public Map<String, Double> getRewards() { return rewards; }
    public void setRewards(Map<String, Double> rewards) { this.rewards = rewards; }
}