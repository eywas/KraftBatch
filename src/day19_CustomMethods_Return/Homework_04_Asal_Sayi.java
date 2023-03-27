package day02_MyfirstProgram.src.day19_CustomMethods_Return;

import java.util.Scanner;

public class Homework_04_Asal_Sayi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scan.nextInt();

        if(asal(sayi)) {
            System.out.println("Girilen sayı asal bir sayıdır.");
        }
        else {
            System.out.println("Girilen sayı asal bir sayı değildir.");
        }
    }

    public static boolean asal(int sayi) {
        int sayac = 0;
        for(int i = 2; i < sayi; i++)
        {
            if(sayi % i == 0) {
                sayac++;
            }
        }
        if(sayac == 0) {
            return true;
        }
        else {
            return false;
        }
    }

}
