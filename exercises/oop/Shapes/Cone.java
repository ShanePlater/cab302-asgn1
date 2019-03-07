package oop.Shapes;

import static java.lang.StrictMath.sqrt;

public class Cone implements Shape {

    private double radius;
    private double height;


    public Cone(double radius, double height) {
        this.radius = radius;
        this.height  = height;

    }

    public double volume(){
        double volume = (Math.PI * Math.pow(radius,2)) * (height / 3) ;
        return volume;
    }

    public double surfaceArea(){
        double SA = (Math.PI * radius) * (radius + (Math.sqrt((Math.pow(height, 2) + Math.pow(radius, 2)))));
        return SA;
    }
}