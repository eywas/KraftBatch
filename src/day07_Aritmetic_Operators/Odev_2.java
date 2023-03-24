package day02_MyfirstProgram.src.day07_Aritmetic_Operators;

import java.util.Scanner;

public class Odev_2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Fahrenheit: ");
        double f=scan.nextDouble();
        double c= (f-32)*1.18;
        System.out.println("Celcius: "+c);
    }
}
