package ModelElements;

import Stuff.Angle3D;
import Stuff.Point3D;

public class Camera {
    public Point3D location;
    public Angle3D angle;

    // Поворот камеры на угл angle
    public void rotate(Angle3D angle){
        this.angle = angle;
    }

    // Перемещение камеры в лакацию loation
    public void move(Point3D location){
        this.location = location;
    }
}
