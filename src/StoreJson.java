import java.util.List;

public class StoreJson {
    private String id;
    private String name;
    private String category;
    private List<String> restricted_networks; // matches JSON key
    private String notes;

    // Getters & setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public List<String> getRestricted_networks() { return restricted_networks; }
    public void setRestricted_networks(List<String> restricted_networks) { this.restricted_networks = restricted_networks; }

    public String getNotes() { return notes; }
    public void setNotes(String notes) { this.notes = notes; }
}