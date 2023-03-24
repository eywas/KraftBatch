package day02_MyfirstProgram.src.day09_OperatorsCont;

import java.util.Scanner;

public class C03_SayininRakamleriToplami {
    public static void main(String[] args) {
       //Kullanıcıdan 3 basamaklı bir sayı isteyin ve sayının rakamları toplamını yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 3 basamaklı pozitif bir sayı giriniz : ");

        int number = scan.nextInt();// diyelim 142 yazsın
        int lastDigit = number%10;
        int totalOfDigits = lastDigit;// 2

        number = number/10; // 14
        lastDigit = number%10; // 4
        totalOfDigits = totalOfDigits+lastDigit; //2+4=6

        number = number/10; //  14/10=1
        lastDigit= number%10; //1
        totalOfDigits = totalOfDigits+lastDigit; // 6+1=7

        System.out.println("Girilen sayının rakamları toplamı : " + totalOfDigits);



    }
}
