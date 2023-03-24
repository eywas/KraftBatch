package day02_MyfirstProgram.src.day16_Branching_Statements;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        //Banka menüsü oluşturun 1 para ekle 2 hesabımı gör 3 para çek 4 çıkış (money=2000)
        //   while işleme devam etmek için 1 e bir üst menü için 2 ye kart iade için 3 e basın

        Scanner scan = new Scanner(System.in);
        int bakiye = 2000;
        anaMenu:while (true){
        System.out.println("Lütfen işleminizi seçiniz:\n Para yatırmak için 1'i\n Hesabınızı görmek için 2'yi\n" +
                " Para çekmek için 3'ü\n Çıkış için 4'ü tuşlayınız:");
        int secim = scan.nextInt();
        if (secim == 1) {
            paraYatirma:
            while (true) {
                System.out.println("Yatırmak istediğiniz miktarı giriniz: ");
                int yatirilanMiktar = scan.nextInt();
                bakiye += yatirilanMiktar;
                System.out.println("Güncel bakiyeniz: " + bakiye);
                System.out.println("İşleme devam etmek için 1'i\nBir üst menüye dönmek için 2'yi\nKart iade için 3'ü tuşlayın:");
                int secim1 = scan.nextInt();
                if (secim1 == 1){
                    continue paraYatirma;
                } else if (secim1 == 2) {
                    continue anaMenu;
                }else if (secim1 == 3) {
                    System.out.println("Kartınız iade ediliyor.");
                    break anaMenu;
                }else {
                    System.out.println("Hatalı Giriş");
                    continue paraYatirma;
                }
            }
        } else if (secim == 2) {
            guncelBakiye:
            while (true) {
                System.out.println("Güncel bakiyeniz: " + bakiye);
                System.out.println("Bir üst menüye dönmek için 1'i\nKart iade için 2'yi tuşlayın:");
                int secim1 = scan.nextInt();
                if (secim1 == 1){
                    continue anaMenu;
                } else if (secim1 == 2) {
                    System.out.println("Kartınız iade ediliyor.");
                    break anaMenu;
                }else {
                    System.out.println("Hatalı Giriş");
                    continue guncelBakiye;
                }
            }
        } else if (secim == 3) {
            paraCekme:
            while (true) {
                System.out.println("Çekmek istediğiniz miktarı giriniz: ");
                int cekilenMiktar = scan.nextInt();
                bakiye -= cekilenMiktar;
                System.out.println("Güncel bakiyeniz: " + bakiye);
                System.out.println("İşleme devam etmek için 1'i\nBir üst menüye dönmek için 2'yi\nKart iade için 3'ü tuşlayın:");
                int secim1 = scan.nextInt();
                if (secim1 == 1){
                    continue paraCekme;
                } else if (secim1 == 2) {
                    continue anaMenu;
                }else if (secim1 == 3) {
                    System.out.println("Kartınız iade ediliyor.");
                    break anaMenu;
                }else {
                    System.out.println("Hatalı Giriş");
                    continue paraCekme;
                }
            }
        } else if (secim == 4) {
            System.out.println("Çıkış işleminiz gerçekleşmiştir.\nİyi günler dileriz.");
            break anaMenu;
        }else{
            System.out.println("Hatalı giriş. Lütfen tekrar deneyin.");
            System.out.println();
            continue anaMenu;
        }

    }
    }
}
