package day02_MyfirstProgram.src.day47_Polymorphism.shape;

public class Sphere extends Shape implements Volume {

    public Sphere() {
        super("Sphere");
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public double volume() {
        return 0;
    }
}
