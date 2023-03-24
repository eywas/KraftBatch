package day02_MyfirstProgram.src.day13_ForLoops;

import java.util.Scanner;

public class Homework_02 {
    public static void main(String[] args) {
//       Kullanıcıdan bir kelime alın ve kaç defa yazdırmak istediğini sorun .
//       Kullanıcıdan aldığınız kelimeyi kullanıcının istediği kadar ekrana yazdırın.

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir kelime giriniz : ");
        String kelime= scan.nextLine();

        System.out.print("Kelimenizi kaç defa yazdırmak istersiniz : ");
        int yazdirmaSayisi= scan.nextInt();
        for (int i=1; i<=yazdirmaSayisi;i++){
           System.out.println(kelime);
           }

    }
    }

