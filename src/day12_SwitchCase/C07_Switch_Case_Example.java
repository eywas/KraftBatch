package day02_MyfirstProgram.src.day12_SwitchCase;

import java.util.Scanner;

public class C07_Switch_Case_Example {
    public static void main(String[] args) {
        //+,-,*,/
        // 4 işlem yapacak şekilde bir hesap makinesi yapın
        // kullanıcıdan 2 sayı alın
        //yapmak istediği işlemi seçsin +,-,,/
        //hatalı işlem girişlerinde kullanıcıya uyarı verin
        //ekrana sonuç döndüren programı yazınız.

      /*  Scanner scan = new Scanner(System.in);
        System.out.println("Sayı 1: ");
        double sayi1 = scan.nextInt();
        System.out.println("Sayı 2: ");
        double sayi2 = scan.nextInt();
        System.out.println("Lütfen işlem seçiniz (+,-,*,/): ");
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

       */


        // haftanın gününü kullanıcıdan alın ve ekrana yazdırın
        int weekDay=5;
        switch (weekDay){
            case 1:
                System.out.println("Pazartesi");
                break;
                case 2:
                System.out.println("Salı");
                break;case 3:
                System.out.println("Çarşamba");
                break;case 4:
                System.out.println("Perşembe");
                break;case 5:
                System.out.println("Cuma");
                break;case 6:
                System.out.println("Cumartesi");
                break;case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Hatalı giriş 1 ile 7 dahil arasında bir sayı giriniz.");





        }
    }
}
