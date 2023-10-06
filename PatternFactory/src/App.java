import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Factory.GemGenerator;
import Factory.GoldGenerator;
import Factory.ItemGenerator;
import Factory.LifeGenerator;
import Factory.PowerGenerator;
import Factory.ScullGenerator;
import Factory.ShildGenerator;
import Factory.SilverGenerator;
import Factory.StarGenerator;

public class App {

    public static void main(String[] args) throws Exception {
        // ItemGenerator fabric1 = new GoldGenerator();
        // fabric1.openReward();

        List<ItemGenerator> listItemGenerator = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            listItemGenerator.add(new GoldGenerator());
        }
        for (int i = 0; i < 20; i++) {
            listItemGenerator.add(new SilverGenerator());
        }
        for (int i = 0; i < 5; i++) {
            listItemGenerator.add(new GemGenerator());
        }
        for (int i = 0; i < 1; i++) {
            listItemGenerator.add(new StarGenerator());
        }
        for (int i = 0; i < 1; i++) {
            listItemGenerator.add(new ScullGenerator());
        }
        for (int i = 0; i < 7; i++) {
            listItemGenerator.add(new LifeGenerator());
        }
        for (int i = 0; i < 7; i++) {
            listItemGenerator.add(new PowerGenerator());
        }
        for (int i = 0; i < 7; i++) {
            listItemGenerator.add(new ShildGenerator());
        }

        Random ran = new Random();

        for (int i = 0; i < 10; i++){
            int index = ran.nextInt(listItemGenerator.size());
            listItemGenerator.get(index).openReward();
        }
    }
}
