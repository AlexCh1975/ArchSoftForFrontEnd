package Factory;

import Interfaces.iGameItem;
import Product.Shield;

public class ShildGenerator extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new Shield();
    }
    
}
