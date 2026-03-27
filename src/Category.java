import java.util.List;

//represents a spending category used to classify transactions
//a category can have multiple aliases to match different merchant descriptions of the same thing
public class Category {
    private String id;
    private String name;
    private List<String> aliases;

   //setters
    public Category(String id, String name, List<String> aliases) {
        this.id = id;
        this.name = name;
        this.aliases = aliases;
    }

    //getters
    public String getId() { return id; }
    public String getName() { return name; }
    public List<String> getAliases() { return aliases; }
}