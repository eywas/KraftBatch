package day02_MyfirstProgram.src.day11_ControlFlowStatements_IF;

import java.util.Scanner;

public class HomeWork_Cozum_2 {
    //Bir program yazın
    // 3 tane numara kabul etsin ve büyük olanı versin.(homework)
    // 2 veya 3 farklı yol ile çözmeye çalışın
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen üç sayı giriniz");
        System.out.println("Sayı 1: ");
        int sayi1 = scan.nextInt();
        System.out.println("Sayı 2: ");
        int sayi2 = scan.nextInt();
        System.out.println("Sayı 3: ");
        int sayi3 = scan.nextInt();

        System.out.println("En büyük sayı "+Math.max(sayi1,Math.max(sayi2,sayi3)));

    }
}