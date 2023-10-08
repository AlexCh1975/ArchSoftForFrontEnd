package Classes;

import java.awt.Color;

import Enumerators.TypeOfBode;
import Enumerators.TypeOfFuel;
import Enumerators.TypeOfGearBox;

public abstract class Car {
    private String make;
    private String model;
    private Color color; 
    private TypeOfBode typeOfBody;
    private int numOfWheels;
    private TypeOfGearBox typeOfGearBox;
    private TypeOfFuel typeOfFuel;
    private float engineCapacity;
    
    public Car(String make, String model, Color color, TypeOfBode typeOfBody, int numOfWheels,
            TypeOfGearBox typeOfGearBox, TypeOfFuel typeOfFuel, float engineCapacity) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.typeOfBody = typeOfBody;
        this.numOfWheels = numOfWheels;
        this.typeOfGearBox = typeOfGearBox;
        this.typeOfFuel = typeOfFuel;
        this.engineCapacity = engineCapacity;
    }


    public void movement(){

    }

    public void maintenance(){

    }

    public boolean turnLight(){
        return true;
    }

    public boolean turnWhappers(){
        return true;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Color getColor() {
        return color;
    }

    public TypeOfBode getTypeOfBody() {
        return typeOfBody;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public TypeOfGearBox getTypeOfGearBox() {
        return typeOfGearBox;
    }

    public TypeOfFuel getTypeOfFuel() {
        return typeOfFuel;
    }

    public float getEngineCapacity() {
        return engineCapacity;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setTypeOfBody(TypeOfBode typeOfBody) {
        this.typeOfBody = typeOfBody;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public void setTypeOfGearBox(TypeOfGearBox typeOfGearBox) {
        this.typeOfGearBox = typeOfGearBox;
    }

    public void setTypeOfFuel(TypeOfFuel typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }

    public void setEngineCapacity(float enginCapacity) {
        this.engineCapacity = enginCapacity;
    }
}
