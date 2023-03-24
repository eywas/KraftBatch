package day02_MyfirstProgram.src.day08_ScannerAndOperators;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        // 1. adım Scanner objesi oluşturalım
        Scanner scan = new Scanner(System.in);

        //2. adım Kullanıcıyı bilgilendir. Ne istediğinizi söyleyin
        System.out.println("Lütfen ismöinizi giriniz");

        // 3. adım girilen bilgiyi içine koyabileceğimiz bir variable oluşturalım
        // oluşturduğumuz değişkenin içerisine scan objesi ile uygun methodu çağırarak veriyi alın

        String  name = scan.nextLine();


        System.out.println("Girilen isim : "+ name);


    }
}
