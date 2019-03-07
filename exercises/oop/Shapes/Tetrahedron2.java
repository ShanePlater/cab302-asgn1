package oop.Shapes;

import static java.lang.StrictMath.sqrt;

public class Tetrahedron2 implements Shape {

    private double edge;


    public Tetrahedron2(double edge) {
        this.edge = edge;

    }

    public double volume(){
        double volume = Math.pow(edge, 3) / (6 * (sqrt(2)));
        return volume;
    }

    public double surfaceArea(){
        double SA = sqrt(3) * Math.pow(edge, 2);
        return SA;
    }
}