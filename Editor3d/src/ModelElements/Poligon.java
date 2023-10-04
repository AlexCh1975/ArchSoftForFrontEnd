package ModelElements;

import java.util.List;
import java.util.ArrayList;

import Stuff.Point3D;

public class Poligon {
    public List<Point3D> points = new ArrayList<Point3D>();

    public Poligon(Point3D point) {
        points.add(point);
    } 
}
