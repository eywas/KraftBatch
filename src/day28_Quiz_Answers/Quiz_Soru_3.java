package day02_MyfirstProgram.src.day28_Quiz_Answers;

import java.util.Scanner;

public class Quiz_Soru_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir kelime bir de harf giriniz");
        String str = scan.nextLine();
        String ch = scan.nextLine();
        System.out.println(str+" 'da "+frequency(str,ch)+" adet "+ch+" bulunmaktadır.");

    }
public static int frequency(String str,String ch){
    return str.length()-str.replace(ch, "").length();
}
}

