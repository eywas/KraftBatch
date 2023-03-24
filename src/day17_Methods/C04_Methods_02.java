package day02_MyfirstProgram.src.day17_Methods;

import java.util.Scanner;

public class C04_Methods_02 {
    public static void main(String[] args) {
        int sayi=5;
        aritmetikOrtalama();
        buyukSayi();
        kiloOkkaCevir();
        kupHesapla(sayi);
        kareHesapla(sayi);
        isimYaz("Harun");
        max(5,10);
        ortalama(5,10);
    }

    public static void aritmetikOrtalama() {
        double x = 3, y = 5, z = 10;
        double result = (x + y + z) / 3;
        System.out.println("Ortalama: " + result);
    }

    public static void buyukSayi() {
        int a = 10, b = 7;
        int max;
        if (a < b) {
            max = b;
        } else {
            max = a;
        }

        System.out.println("Büyük sayı: " + max);
    }
    public static void kiloOkkaCevir() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kilogram: ");
        double k = scan.nextDouble();
        double o = k / 1.282;
        System.out.println(k+" kilogram "+o+" okkadır.");
    }

    public static void kupHesapla(int x){
        int result=x*x*x;
        System.out.println("Sonuç: "+result);
    }


    public static void kareHesapla(int x){
        int result=x*x;
        System.out.println("Sonuç: "+result);
    }

    public static void isimYaz(String name){
        System.out.println("İsminiz: "+name+" dur.");
    }
    public static void max(int x, int y) {

        int max;
        if (x < y) {
            max = y;
        } else {
            max = x;
        }

        System.out.println("Büyük sayı: " + max);
    }
    public static void ortalama(double x, double y){
        double ort=(x+y)/2;
        System.out.println("Ortalama: "+ort);

    }


}
