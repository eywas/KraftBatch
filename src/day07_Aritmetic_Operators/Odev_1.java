package day02_MyfirstProgram.src.day07_Aritmetic_Operators;

import java.util.Scanner;

public class Odev_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double PI = 3.14;
        System.out.print("Yarıçap: ");
        double yaricap = scan.nextDouble();
        double alan = PI * yaricap * yaricap;
        System.out.println("Alan: " + alan);
        double cevre = PI * yaricap * 2;
        System.out.print("Çevre: " + cevre);


    }
}