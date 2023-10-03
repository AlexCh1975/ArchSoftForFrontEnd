package ModelElements;

import java.awt.Color;

import Stuff.Angle3D;
import Stuff.Point3D;

public class Flash {
    public Point3D location;
    public Angle3D angle;
    public Color color;
    public Float power;

    public Flash(Point3D location, Angle3D angle, Color color, Float power) {
        this.location = location;
        this.angle = angle;
        this.color = color;
        this.power = power;
    }

    // Поворот освещения на угл angle
    public void rotate(Angle3D angle){
        this.angle = angle;
    }

    // Перемещение освещения в лакацию loation
    public void move(Point3D location){
        this.location = location;
    }
}


