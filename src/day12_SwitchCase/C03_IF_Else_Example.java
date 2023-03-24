package day02_MyfirstProgram.src.day12_SwitchCase;

import java.util.Scanner;

public class C03_IF_Else_Example {
    public static void main(String[] args) {


        //+,-,*,/
        // 4 işlem yapacak şekilde bir hesap makinesi yapın
        // kullanıcıdan 2 sayı alın
        //yapmak istediği işlemi seçsin +,-,,/
        //hatalı işlem girişlerinde kullanıcıya uyarı verin
        //ekrana sonuç döndüren programı yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Sayı 1: ");
        double sayi1 = scan.nextInt();
        System.out.println("Sayı 2: ");
        double sayi2 = scan.nextInt();
        System.out.println("Lütfen işlem seçiniz (+,-,*,/): ");
        String islem= scan.next();

        if (islem.equals("+")) {
            System.out.println(sayi1+sayi2);
        } else if (islem.equals("-")) {
            System.out.println(sayi1-sayi2);
        } else if (islem.equals("*")) {
            System.out.println(sayi1*sayi2);
        } else if (islem.equals("/")) {
            System.out.println(sayi1/sayi2);
        } else {
            System.err.println("Hatalı giriş yaptınız!");
        }
    }
}

