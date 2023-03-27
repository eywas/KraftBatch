package day02_MyfirstProgram.src.day19_CustomMethods_Return;

import java.util.Scanner;

public class Homework_01_Basamak_Bul {
    public static void main(String[] args) {
        System.out.println(basamakBul());
    }
    /**
     * Kullanıcıdan alınan sayının kaç basamaklı olduğunu bulan metod
     *
     * @return
     */
    public static int basamakBul() {
        Scanner scan = new Scanner(System.in);
        int sayac = 0;

        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();

        while (sayi > 0) {
            sayi /= 10;
            sayac++;
        }
        return sayac;
    }
}
