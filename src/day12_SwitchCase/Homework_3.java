package day02_MyfirstProgram.src.day12_SwitchCase;

import java.util.Scanner;

public class Homework_3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Sayı 1: ");
        int sayi1 = scan.nextInt();
        System.out.print("Sayı 2: ");
        int sayi2 = scan.nextInt();
        System.out.print("Lütfen işlem seçiniz (+,-,*,/): ");
        String islem= scan.next();

        switch (islem){
            case "+":
                System.out.println(sayi1+sayi2);
                break;
            case"-":
                System.out.println(sayi1-sayi2);
                break;
            case"*":
                System.out.println(sayi1*sayi2);
                break;
            case"/":
                System.out.println(sayi1/sayi2);
                break;
            default:
                System.out.println("Hatalı giriş");

        }
    }
}
