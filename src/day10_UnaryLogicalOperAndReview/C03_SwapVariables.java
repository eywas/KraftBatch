package day02_MyfirstProgram.src.day10_UnaryLogicalOperAndReview;

import java.util.Scanner;

public class C03_SwapVariables {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" a sayısı için bir tam sayı giriniz : ");
        int a = scan.nextInt();

        System.out.println(" b sayısı için bir tam sayı giriniz : ");
        int b = scan.nextInt();

        System.out.println("a = " + a);//a=30
        System.out.println("b = " + b);//b=15


        int temp = a; //30

        a = b; //15
        b = temp; //30

        System.out.println("a : " + a);
        System.out.println("b : " + b);

    }
}
/*1. write a program that can swipe two variables' value by using a temporary variable

        Ex:
        if a= 10, b=15

        output:
        a = 15
        b = 10

 */