package day02_MyfirstProgram.src.day19_CustomMethods_Return;

import java.util.Scanner;

public class Homework_08_Davetiye {
    public static void main(String[] args) {
        davetiye();

    }

    public static void davetiye() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen ilk kelimeyi giriniz: ");
        String kelime1 = scan.next();
        System.out.print("Lütfen ikinci kelimeyi giriniz: ");
        String kelime2 = scan.next();
        if (kelime2.equals(kelime1)) {
            System.out.println("Aynı kelimeleri girdiniz. Lütfen farklı kelimeler giriniz.");
            davetiye();
        } else {
            System.out.println("***** " + kelime1 + " & " + kelime2 + " *****");
        }

    }
}
