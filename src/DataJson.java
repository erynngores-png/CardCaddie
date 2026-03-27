import java.util.List;

public class DataJson {
    private List<CardJson> cards;
    private List<CategoryJson> categories;
    private List<WalletJson> wallets;
    private List<StoreJson> stores;
    private List<ExampleJson> examples;

    // Getters & setters
    public List<CardJson> getCards() { return cards; }
    public void setCards(List<CardJson> cards) { this.cards = cards; }

    public List<CategoryJson> getCategories() { return categories; }
    public void setCategories(List<CategoryJson> categories) { this.categories = categories; }

    public List<WalletJson> getWallets() { return wallets; }
    public void setWallets(List<WalletJson> wallets) { this.wallets = wallets; }

    public List<StoreJson> getStores() { return stores; }
    public void setStores(List<StoreJson> stores) { this.stores = stores; }

    public List<ExampleJson> getExamples() { return examples; }
    public void setExamples(List<ExampleJson> examples) { this.examples = examples; }
}