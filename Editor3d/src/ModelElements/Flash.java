package ModelElements;

import java.awt.Color;

import Stuff.Angle3D;
import Stuff.Point3D;

public class Flash {
    public Point3D location;
    public Angle3D angle;
    public Color color;
    public Float power;

    // Поворот освещения на угл angle
    public void rotate(Angle3D angle){
        this.angle = angle;
    }

    // Перемещение освещения в лакацию loation
    public void move(Point3D location){
        this.location = location;
    }
}


