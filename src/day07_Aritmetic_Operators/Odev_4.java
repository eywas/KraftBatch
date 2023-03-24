package day02_MyfirstProgram.src.day07_Aritmetic_Operators;

import java.util.Scanner;

public class Odev_4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Saniye giriniz: ");
        int toplamSaniye=scan.nextInt();
        int saat=toplamSaniye/3600;
        int dakika=toplamSaniye%3600/60;
        int saniye=toplamSaniye%60;
        System.out.println(saat+" saat " + dakika+" dakika "+saniye+ " saniye");
            }
}
