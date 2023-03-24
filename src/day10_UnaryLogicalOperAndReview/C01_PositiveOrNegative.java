package day02_MyfirstProgram.src.day10_UnaryLogicalOperAndReview;

import java.util.Scanner;

public class C01_PositiveOrNegative {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz : ");
        int number = scan.nextInt();// buraya sayıyıyazdı

        boolean isPositive = number > 0; //burada büyük mü dedi ve sonuca göre true ya da false yazdı
        boolean isNegative = number < 0; //burada küçük mü dedi ve sonuca göre true ya da false yazdı
        boolean isZero = number == 0;    //burada eşit mi dedi ve sonuca göre true ya da false yazdı

        System.out.println(number+" is positive number : "+isPositive);
        System.out.println(number+" is negative number : "+isNegative);
        System.out.println(number+" is zero : "+isZero);

    }
}

/*
1. Create a class called C01_PositiveAndNegative, and  write a program that can identify if the user entered number is
    positive, or negative or zero.

            Ex:
                number = 200

 */