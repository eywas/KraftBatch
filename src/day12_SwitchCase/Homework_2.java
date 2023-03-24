package day02_MyfirstProgram.src.day12_SwitchCase;

import java.util.Scanner;

public class Homework_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen beden ölçünüzü giriniz: ");
        int beden = scan.nextInt();
        switch (beden) {
            case 38, 40, 42:
                System.out.println(beden + " numara bir small bedendir.");
                break;
            case 44, 46, 48:
                System.out.println(beden + " numara bir medium bedendir.");
                break;
            case 50, 52, 54:
                System.out.println(beden + " numara bir large bedendir.");
                break;
            default:
                System.out.println("Bedeniniz bulunamadı.");
        }
    }
}
