import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class JsonLoader {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            // Read the JSON file into DataJson
            DataJson data = mapper.readValue(new File("data.json"), DataJson.class);

            // Access data
            System.out.println("Number of cards: " + data.getCards().size());
            System.out.println("Number of categories: " + data.getCategories().size());
            System.out.println("Number of wallets: " + data.getWallets().size());
            System.out.println("Number of stores: " + data.getStores().size());
            System.out.println("Number of examples: " + data.getExamples().size());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
