package day02_MyfirstProgram.src.day17_Methods;

import java.util.Random;
import java.util.Scanner;

public class C02_Tahmin_Oyunu {
    public static void main(String[] args) {
        // Bilgisayarın tuttuğu 0-50 arası sayıyı 5 hamlede bulma
        // Tuttuğu sayıdan düşük hamle yaparsak yukarı
        // Tuttuğu sayıdan büyük hamle yaparsak aşağı

        Random random=new Random();
        int sayi= random.nextInt(50);
        //System.out.println(sayi);   // Bu bölüm bilgisayarın tuttuğu sayıyı görüp ona göre kodu doğru yazmak için
                                        // başlangıçta açılıp sonrasında yoruma alındı

        Scanner scan = new Scanner(System.in);

        int i=1;
        while (i<=5){
            System.out.println(i+". Tahmin: ");
            int tahmin= scan.nextInt();
            if (tahmin>sayi && i!=5){
                System.out.println("Aşağı");
            } else if (tahmin<sayi&& i!=5) {
                System.out.println("Yukarı");

            }else if (tahmin==sayi){
                System.out.println("Tebrikler");
                break;
            }
            i++;
            if (i==6){
                System.out.println("Malesef bilemedin. Tuttuğum sayı: "+sayi);
            }


        }
    }
}
