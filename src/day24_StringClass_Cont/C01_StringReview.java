package day02_MyfirstProgram.src.day24_StringClass_Cont;

import java.util.Scanner;

public class C01_StringReview {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("İsminizi giriniz: ");
        String isim = scan.nextLine();


        //Yavuz Selim
        //ismin son harfini al
        //length(), charAt()
        int uzunluk=isim.length();
        char sonHarf=isim.charAt(uzunluk-1);//Toplam karakter sayısından 1 çıkarıp son indeksi buluyoruz.
        System.out.println(sonHarf);

        //equals()
        System.out.println(isim==" Yavuz Selim "); //false
        System.out.println(isim.equals(" Yavuz Selim ")); //true
        System.out.println(isim.equalsIgnoreCase(" yavuz SeliM "));// Burada büyük küçük harf ayrımı yapılmıyor


        //toUpperCase  toLowerCase
        System.out.println(isim.toLowerCase());
        System.out.println(isim.toUpperCase());
        System.out.println(isim);

        //trim()
        System.out.println(isim.trim());
        System.out.println(isim);


        //indexOf()
        System.out.println(isim.indexOf("S"));
        System.out.println(isim.indexOf("Selim"));
        System.out.println(isim.indexOf(" "));
        System.out.println(isim.lastIndexOf(" "));
        int ilkIndeks= isim.indexOf(" ");
        int lastIndeks=isim.lastIndexOf(" ");
        if (ilkIndeks==lastIndeks){
            System.out.println("Stringde uniquetir.");
        }else {
            System.out.println("Unique değildir.");
        }

        //replace
        System.out.println(isim.replace(" ", ""));
        System.out.println(isim.replace("vuz", "ğız"));
        String message= "Merhaba";
        System.out.println(message);
        System.out.println(message.replace("a", "e"));
        System.out.println(message.replaceFirst("a", "e"));



    }
}
