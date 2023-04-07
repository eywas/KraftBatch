package day02_MyfirstProgram.src.day23_String_Class;

import java.util.Scanner;

public class Homework_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Mesajınızı giriniz: ");
        String mesaj= scan.nextLine();
        System.out.println("Mesajınız " + mesaj.length()+" karakterden oluşmaktadır.");

        System.out.println("------------------------------------------");

        System.out.println("Mesajınızın son indexi "+mesaj.charAt(mesaj.length() - 1));

        System.out.println("------------------------------------------");
        for (int i = 0; i < mesaj.length(); i++) {
            System.out.println(mesaj.charAt(i));

        }


    }
}
