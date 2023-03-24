package day02_MyfirstProgram.src.day14_NestedWhileDoWhile;

import java.util.Scanner;

public class C07_ParolayiTahminEt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String parola="şafak";
        String tahmin="";
        int hak=3;

        System.out.println("Parolayı tahmin ediniz (Toplam 3 hakkınız var) : ");
        while (1<=hak){   //(0<hak) yazınca da aynı sonuç oluyor
            tahmin= scan.nextLine();
            if (tahmin.equals(parola)){
                System.out.println("Tebrikler. Parolayı bildiniz.");
                break;
            }else {
                System.out.println("Parola yanlış. Kalan tahmin hakkınız: "+(--hak));
            }
        }


            }
}
