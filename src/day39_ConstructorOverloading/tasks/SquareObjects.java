package day02_MyfirstProgram.src.day39_ConstructorOverloading.tasks;


public class SquareObjects {
    public static void main(String[] args) {
        Square square1=new Square(5);
        System.out.println("square1.calculatePerimeter() = " + square1.calculatePerimeter());
        square1.sideLength=6;
        System.out.println(square1);

    }
}
