import java.util.List;
import java.util.Map;

public class CardData {

    public static final List<Card> CARDS = List.of(

            //represents a new card - chase sapphire preferred
            new Card(
                    "chase_sapphire_preferred",
                    "Chase Sapphire Preferred",
                    "Chase",
                    "Visa",
                    95,
                    //list of spending categories and how many points they earn for chase sapphire preferred
                    Map.of(
                            "travel", 5.0,
                            "dining", 3.0,
                            "groceries", 1.0,
                            "gas", 1.0,
                            "default", 1.0
                    )
            ),

            //represents a new card - american express gold
            new Card(
                    "amex_gold",
                    "American Express Gold Card",
                    "American Express",
                    "Amex",
                    250,
                    //list of spending categories and how many points they earn for american express gold
                    Map.of(
                            "dining", 4.0,
                            "groceries", 4.0,
                            "travel", 3.0,
                            "gas", 1.0,
                            "default", 1.0
                    )
            ),


            //represents a new card - costco anywhere visa
            new Card(
                    "citi_costco",
                    "Costco Anywhere Visa",
                    "Citi",
                    "Visa",
                    0,
                    //list of spending categories and how many points they earn for costco anywhere visa
                    Map.of(
                            "gas", 4.0,
                            "travel", 3.0,
                            "dining", 3.0,
                            "groceries", 2.0,
                            "default", 1.0
                    )
            ),

            //represents a new card - capital one savorone
            new Card(
                    "capital_one_savor",
                    "Capital One SavorOne",
                    "Capital One",
                    "Mastercard",
                    0,
                    //list of spending categories and how many points they earn for capital one savorone
                    Map.of(
                            "dining", 3.0,
                            "groceries", 3.0,
                            "travel", 1.0,
                            "gas", 1.0,
                            "default", 1.0
                    )
            ),

            //represents a new card - american express blue cash preferred
            new Card(
                    "amex_blue_cash_preferred",
                    "Blue Cash Preferred",
                    "American Express",
                    "Amex",
                    95,
                    //list of spending categories and how many points they earn for american express blue cash preferred
                    Map.of(
                            "groceries", 6.0,
                            "gas", 3.0,
                            "dining", 1.0,
                            "travel", 1.0,
                            "default", 1.0
                    )
            ),

            //represents a new card - chase freedom unlimited
            new Card(
                    "chase_freedom_unlimited",
                    "Chase Freedom Unlimited",
                    "Chase",
                    "Visa",
                    0,
                    //list of spending categories and how many points they earn for chase freedom unlimited
                    Map.of(
                            "travel", 5.0,
                            "dining", 3.0,
                            "groceries", 1.0,
                            "gas", 1.0,
                            "default", 1.5
                    )
            ),

            //represents a new card - citi double cash
            new Card(
                    "citi_double_cash",
                    "Citi Double Cash",
                    "Citi",
                    "Mastercard",
                    0,
                    //list of spending categories and how many points they earn for citi double cash
                    Map.of(
                            "dining", 2.0,
                            "groceries", 2.0,
                            "gas", 2.0,
                            "travel", 2.0,
                            "default", 2.0
                    )
            ),

            //represents a new card - wells fargo autograph
            new Card(
                    "wells_fargo_autograph",
                    "Wells Fargo Autograph",
                    "Wells Fargo",
                    "Visa",
                    0,
                    //list of spending categories and how many points they earn for wells fargo autograph
                    Map.of(
                            "dining", 3.0,
                            "travel", 3.0,
                            "gas", 3.0,
                            "groceries", 1.0,
                            "default", 1.0
                    )
            )
    );
}