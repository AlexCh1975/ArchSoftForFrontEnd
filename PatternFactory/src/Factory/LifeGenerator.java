package Factory;

import Interfaces.iGameItem;
import Product.Life;

public class LifeGenerator extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new Life();
    }
    
}
