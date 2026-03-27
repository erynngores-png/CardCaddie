import java.util.List;

public class WalletJson {
    private String id;
    private String name;
    private List<String> cards;  // just card IDs from JSON

    // Getters & setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public List<String> getCards() { return cards; }
    public void setCards(List<String> cards) { this.cards = cards; }
}