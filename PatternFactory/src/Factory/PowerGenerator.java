package Factory;

import Interfaces.iGameItem;
import Product.Power;

public class PowerGenerator extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new Power();
    }
    
}
