package Classes;

import java.awt.Color;

import Enumerators.TypeOfBode;
import Enumerators.TypeOfFuel;
import Enumerators.TypeOfGearBox;
import Interfaces.iCarWippingCar;
import Interfaces.iFuelStation;

public class PickUp extends Car implements iFuelStation, iCarWippingCar{
    private float loadCapasity;

    public PickUp(String make, String model, Color color, int numOfWheels,
            TypeOfGearBox typeOfGearBox, TypeOfFuel typeOfFuel, float engineCapacity, float loadCapasity) {
        super(make, model, color, TypeOfBode.PICKUP, numOfWheels, typeOfGearBox, typeOfFuel, engineCapacity);

        this.loadCapasity = loadCapasity;
    }

    @Override
    public void fuel() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fuel'");
    }

    @Override
    public void wipWindShild() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'wipWindShild'");
    }

    @Override
    public void wipHeadLights() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'wipHeadLights'");
    }

    @Override
    public void wipMirrows() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'wipMirrows'");
    }
}
