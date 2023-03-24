package day02_MyfirstProgram.src.day04_VariableCont;

public class Circle {

    public static void main(String[] args){
        //declare variables
        //PI, radius, area, perimeter

        double radius = 1.0;
        double PI = 3.14;

        double area = PI*radius*radius;  //alanı hesaplayıp area içine yazar
        double perimeter = 2*PI*radius;

        System.out.println("PI =" + PI);
        System.out.println("radius = " + radius);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);


    }
}



