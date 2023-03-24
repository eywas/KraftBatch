package day02_MyfirstProgram.src.day08_ScannerAndOperators;

import java.util.Scanner;

public class C07_ScannerTask2 {
    public static void main(String[] args) {
        //      Kullanicidan ismini, soyismini ve yasini alip, asagidaki formatta yazdirin.
        //        Isminiz : Himmet
        //        Soyisminiz : Abi
        //        Yasiniz : 38
        //      Dogum Yeriniz: Kayseri
        //        Kaydiniz basariyla tamamlanmistir.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");

        String isim = scanner.nextLine();

        System.out.println("Lütfen soyisminizi giriniz");
        String soyisim = scanner.nextLine();

        System.out.println("Lütfen yaşınızı giriniz");
        int yas = scanner.nextInt();

        System.out.println("Doğum yerinizi giriniz");
        scanner.nextLine(); // Bu satırı yazmazsak java doğum yerini yazdırmadan atlıyor . integer değerden sonra
                            //bu satırı yazdırmak için yani nextLine değer girmek için bu boş scanner.nextLine() satırını yazmalıyız
        String dogumYeri = scanner.nextLine();

        System.out.println("İsminiz : "+isim);
        System.out.println("Soyisminiz : "+soyisim);
        System.out.println("Yaşınız : "+yas);
        System.out.println("Doğum Yeriniz : "+dogumYeri);
        System.out.println("Kaydiniz basariyla tamamlanmistir.");


        //Kullanıcı istediğimiz veri türünde değer girişi yapmazsa dkoumuzda hata oluşur, execution oluşur.
        //Hatalı inputlara karşı dbirler alacağımızı daha sonra göreceğiz.

        System.out.println("İsminiz : "+isim+
                        "\nSoyisminiz : "+soyisim+
                "\nYaşınız : "+yas+
                "\nDoğum Yeriniz : "+dogumYeri+
                "\nKaydiniz basariyla tamamlanmistir.");















    }}

