package Factory;

import Interfaces.iGameItem;
import Product.Scull;

public class ScullGenerator extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new Scull();
    }
    
}
