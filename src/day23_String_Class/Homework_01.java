package day02_MyfirstProgram.src.day23_String_Class;

import java.util.Scanner;

public class Homework_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Mesajınızı giriniz: ");
        String mesaj= scan.next();
        System.out.println("Mesajınız " + mesaj.length()+" karakterden oluşmaktadır.");

        System.out.println("------------------------------------------");

        System.out.println("Mesajınızın son indexi "+mesaj.charAt(mesaj.length() - 1));

        System.out.println("------------------------------------------");
        System.out.println(mesaj.charAt(mesaj.length() - 8));
        System.out.println(mesaj.charAt(mesaj.length() - 7));
        System.out.println(mesaj.charAt(mesaj.length() - 6));
        System.out.println(mesaj.charAt(mesaj.length() - 5));
        System.out.println(mesaj.charAt(mesaj.length() - 4));
        System.out.println(mesaj.charAt(mesaj.length() - 3));
        System.out.println(mesaj.charAt(mesaj.length() - 2));
        System.out.println(mesaj.charAt(mesaj.length() - 1));


    }
}
