import java.util.List;

public class StoreData {

    public static final List<Store> STORES = List.of(
            //represents a new store - costco
            //accepts visa
            new Store(
                    "costco",
                    "Costco",
                    "groceries",
                    List.of("Amex", "Mastercard", "Discover"),
                    "Only accepts Visa"
            ),
            //represents a new store - walmart
            //accepts all cards
            new Store(
                    "walmart",
                    "Walmart",
                    "groceries",
                    List.of(),
                    null
            ),
            //represents a new store - whole foods
            //accepts all cards
            new Store(
                    "whole_foods",
                    "Whole Foods",
                    "groceries",
                    List.of(),
                    null
            ),
            //represents a new store - aldi
            //does not accept amex
            new Store(
                    "aldi",
                    "ALDI",
                    "groceries",
                    List.of("Amex"),
                    "Does not accept Amex"
            ),
            //represents a new store - chipotle
            new Store(
                    "chipotle",
                    "Chipotle",
                    "dining",
                    List.of(),
                    null
            ),
            //represents a new store - starbucks
            new Store(
                    "starbucks",
                    "Starbucks",
                    "dining",
                    List.of(),
                    null
            ),
            //represents a new store - mcdonald's
            new Store(
                    "mcdonalds",
                    "McDonald's",
                    "dining",
                    List.of(),
                    null
            ),
            //represents a new store - shell gas stations
            new Store(
                    "shell",
                    "Shell",
                    "gas",
                    List.of(),
                    null
            ),
            //represents a new store - chevron gas stations
            new Store(
                    "chevron",
                    "Chevron",
                    "gas",
                    List.of(),
                    null
            ),
            //represents a new store - southwest airlines
            new Store(
                    "southwest",
                    "Southwest Airlines",
                    "travel",
                    List.of(),
                    null
            ),
            //represents a new store - marriott hotels
            new Store(
                    "marriott",
                    "Marriott",
                    "travel",
                    List.of(),
                    null
            )
    );

}