package day02_MyfirstProgram.src.day09_OperatorsCont;

import java.util.Scanner;

public class C02_BedenKitleIndeksi {
    public static void main(String[] args) {
        /*
        Kullanıcıdan aldığınız boy ve kilo değerlerine göre kullanıcının beden kitle indeksini bulun.
        Beden Kitle İndeksi (bki): Kilo / (Boy(m) * Boy(m))

        */
        Scanner scan = new Scanner(System.in);

        System.out.print("Kilonuzu Giriniz (or:80) : ");
        int kilo = scan.nextInt();
        System.out.print("Boyunuzu giriniz (or:1,80) : ");
        double boy = scan.nextDouble();

        double bki= kilo/(boy*boy);

        System.out.println("Kilonuz : "+kilo);
        System.out.println("Boyunuz : "+boy);
        System.out.println("Beden Kitle İndeksiniz : "+bki);


    }
}
