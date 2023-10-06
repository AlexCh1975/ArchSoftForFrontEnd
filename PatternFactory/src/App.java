import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Factory.GemGenerator;
import Factory.GoldGenerator;
import Factory.ItemGenerator;
import Factory.SilverGenerator;

public class App {

    public static void main(String[] args) throws Exception {
        // ItemGenerator fabric1 = new GoldGenerator();
        // fabric1.openReward();

        List<ItemGenerator> listItemGenerator = new ArrayList<>();

        // listItemGenerator.add(new GoldGenerator());
        for (int i = 0; i < 10; i++) {
            listItemGenerator.add(new GoldGenerator());
        }
        for (int i = 0; i < 20; i++) {
            listItemGenerator.add(new SilverGenerator());
        }
        for (int i = 0; i < 5; i++) {
            listItemGenerator.add(new GemGenerator());
        }

        Random ran = new Random();

        for (int i = 0; i < 10; i++){
            int index = ran.nextInt(listItemGenerator.size());
            listItemGenerator.get(index).openReward();
        }
    }
}
