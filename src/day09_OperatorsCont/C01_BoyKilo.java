package day02_MyfirstProgram.src.day09_OperatorsCont;

import java.util.Scanner;

public class C01_BoyKilo {
    public static void main(String[] args) {
        //Kullanıcıdan boy(ondalıklı) ve kilosunu(ondalıklı) bilgisini alarak ekrana tek satırda yazdırınız.

        Scanner input = new Scanner(System.in);
        System.out.println("Boyunuzu giriniz : ");
        double boy = input.nextDouble();
        System.out.println("Kilonuzu giriniz : ");
        double kilo = input.nextDouble();

        System.out.println("Lütfen isminizi giriniz : ");
        String isim = input.next();

         input.nextLine(); //
        System.out.println("Soyisminizi giriniz : ");
        String soyisim = input.nextLine();

        System.out.println(isim+" "+soyisim+ " boyunuz : "+boy+" m kilonuz : "+kilo+" kg");

        //Scanner.next() İlk boşluğa kadar olan değerleri alır
        //Scanner.nextLine() İlk enter a kadar olan değerleri alır
    }
}
