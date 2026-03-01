public class Store {
    private String id;
    private String name;
    private String category;
    private String notes;

    public Store(String id, String name, String category, String notes) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.notes = notes;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public String getNotes() { return notes; }
}
