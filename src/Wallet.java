import java.util.ArrayList;
import java.util.List;

//represents a wallet that has a unique id, a name, and can store multiple cards
public class Wallet {
    private String id;
    private String name;
    private List<Card> cards;

    //setters
    public Wallet(String id, String name) {
        this.id = id;
        this.name = name;
        this.cards = new ArrayList<>(); // Start with empty list
    }

    //add a card to the wallet
    public void addCard(Card card) {
        if (!cards.contains(card)) {
            cards.add(card);
        }
    }

    //remove a card from the wallet
    public void removeCard(Card card) {
        cards.remove(card);
    }

    //getters
    public String getId() { return id; }
    public String getName() { return name; }
    public List<Card> getCards() { return cards; }

    //check if wallet has a specific card
    public boolean hasCard(Card card) {
        return cards.contains(card);
    }
}