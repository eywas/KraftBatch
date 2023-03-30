package day02_MyfirstProgram.src.day21_Class_And_Object;

import java.util.Scanner;

public class C04_Method_Last_Question {
    public static void main(String[] args) {
        System.out.println(sayiAl());
    }
    public static int sayiAl(){
        Scanner scan =new Scanner(System.in);
        System.out.println("1. Sayı: ");
        int sayi1= scan.nextInt();
        System.out.println("2. Sayı: ");
        int sayi2= scan.nextInt();

        return sayilariTopla(sayi1,ucunKati(sayi2));
    }

    private static int sayilariTopla(int x, int y) {
        return (x+y);
    }

    private static int ucunKati(int sayi2) {
        if (sayi2%3==0){
            return sayi2;
        }
        return sayi2-sayi2%3;
    }
}
/*Konsoldan
        kullanıcıdan 2 sayı almanızı sağlayan bir
        metodu çağırı n İkinci sayı 3 ün katı olan bir sayı değilse,
        başka bir metodtan geçirin ve 3 katı olacak ş ekilde size
        döndürsün Sonra bu sayıları kabul eden başka bir
        metotla da sayıları toplayın

 */