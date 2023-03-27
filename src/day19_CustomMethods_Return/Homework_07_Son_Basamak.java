package day02_MyfirstProgram.src.day19_CustomMethods_Return;

import java.util.Scanner;

public class Homework_07_Son_Basamak {
    public static void main(String[] args) {
        sonBasamak();
    }

    public static boolean sonBasamak() {
        boolean sonBasamak;
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen birinci sayıyı giriniz: ");
        int num1 = scan.nextInt();
        System.out.print("Lütfen ikinci sayıyı giriniz: ");
        int num2 = scan.nextInt();
        if (num1 % 10 == num2 % 10) {
            sonBasamak = true;
            System.out.println("Girilen sayıların son basamakları aynıdır.");
        } else {
            sonBasamak = false;
            System.out.println("Girilen sayıların son basamakları farklıdır.");
        }
        return sonBasamak;
    }
}
