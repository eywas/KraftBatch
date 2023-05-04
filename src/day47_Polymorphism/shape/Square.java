package day02_MyfirstProgram.src.day47_Polymorphism.shape;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        super("Square");
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side<0){
            System.err.println("Invalid side "+side);
        }
        this.side = side;
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return 4*side;
    }
    public String toString() {
        return "Square{" +
                "side=" + side +
                "} " + super.toString();
    }
}
