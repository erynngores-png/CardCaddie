import java.util.List;

public class CategoryData {

    public static final List<Category> CATEGORIES = List.of(
            //represents the dining category
            new Category(
                    "dining",
                    "Dining",
                    List.of("restaurants", "food", "eating out")
            ),
            //represents the grocery category
            new Category(
                    "groceries",
                    "Groceries",
                    List.of("supermarket", "grocery store")
            ),
            //represents the gas category
            new Category(
                    "gas",
                    "Gas",
                    List.of("fuel", "gas station")
            ),
            //represents the travel category
            new Category(
                    "travel",
                    "Travel",
                    List.of("flights", "hotels", "airlines")
            )
    );
}