package day02_MyfirstProgram.src.day27_String_Lab_Cont;

import java.util.Scanner;

public class Soru_21 {
    public static void main(String[] args) {
        checkAndConcat();
    }

    //Soru 21) Kullanıcıdan 1 ila 4 harf olacak şekilde 2 kelime alın, 1. veya 2. kelimeyi girdiğinde
    // hatalı giriş yaparsa uyarı verin ve kullanıcıya düzeltme imkanı verin. Her kelime için
    // 3 kere hatalı giriş yaparsa programı sonlandırın. Kullanıcı doğru giriş yaparsa 2 kelimeyi
    // arada boşluk olacak şekilde sadece concat () metodu ile birleştirerek yazdırın.

    public static void checkAndConcat(){
        Scanner scan = new Scanner(System.in);
        int count=0;
        System.out.print("Kelime 1: ");
        String kelime1= scan.nextLine();
        System.out.print("Kelime 2: ");
        String kelime2=scan.nextLine();
        if (kelime1.length()>4||kelime2.length()>4||kelime1.length()!=kelime2.length()||kelime1.isEmpty()||kelime2.isEmpty()){
            for (int i = 1; i <=3; i++) {
                checkAndConcat();
                count+=i;

            }
        }else{
            kelime1.concat(" "+kelime2);
        }

    }
}
