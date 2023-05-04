package day02_MyfirstProgram.src.day39_ConstructorOverloading.tasks;

public class Square {
    public double sideLength;


    public Square(double sideLength){
        this.sideLength=sideLength;


    }

    public double calculateArea(){
        return sideLength*sideLength;
    }

    public double calculatePerimeter(){
        return 4*sideLength;
    }

    public String toString(){
        return "Square{"+
                "sideLength='"+sideLength+"'"+
                ", area='"+calculateArea()+"'"+
                ", perimeter='"+calculatePerimeter()+"'}";

    }

}
