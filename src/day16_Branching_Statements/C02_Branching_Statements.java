package day02_MyfirstProgram.src.day16_Branching_Statements;

import java.util.Scanner;
public class C02_Branching_Statements {
    public static void main(String[] args) {
        //break continue return
      /*  System.out.println("Program başladı.");
        ;
        for (int i = 0; i < 100; i++) {

            if (i%2==0){
                continue;

            }
            if (i>10){
                break;
            }
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Program sonlandı.");

        System.out.println("--------------------------------------------------");

       */

        //0 ve 20 dahil aradaki çift sayıların toplamını ekrana yazdıran programı yazınız.
        //

       /* Birinci çözüm:

       int toplam=0;
       for (int i = 0; i <=20 ; i+=2) {
                   toplam+=i;

        }
        System.out.println(toplam);



        // İkinci çözüm yolu:

         int toplam=0;
       for (int i = 0; i <=20 ; i++) {
              if (i%2==0){
                    toplam+=i;
                    }

        }
        System.out.println(toplam);


        // Üçüncü çözüm yolu:
        int toplam=0;
        for (int i = 0; i <=20 ; i++) {
            if (i%2==1){
                continue;
            }
            toplam+=i;
        }
        System.out.println(toplam);



        // 1 den 100 e kadar 5 in katlarını ekrana yazdırın programı continue kullanarak yazınız

        for (int i = 1; i <=100 ; i++) {
            if (!(i%5==0)){
                continue;
            }
            System.out.println(i+" ");
        }  */

/*
        for (int i = 0; i < 2; i++) {
            System.out.print("B");
            for (int j = 0; j < 100; j++) {
                if (j==2) {
                    break;
                }
                System.out.print("A");
            }

        }*/
// Şifre tanımlayın ve kullanıcıya ekrandan
//// 5 defa şifreyi girmesini isteyin. Her bulamadığında şifre doğru değildir tekrar deneyin ikazı çıksın.
//// Şifreyi bulursa «tebrikler şifre doğru» yazısı gösterildikten sonra programdan çıkış işlemi gerçekleşsin.

    /*  Scanner scan = new Scanner(System.in);
        String sifre = "Harun123";
        int i = 0;
        boolean flag=true;
        System.out.println("5 hakkınız var.");
        while (flag) {
            System.out.print(i + 1 + ".Tahmin: ");
            String tahmin = scan.next();
            if (tahmin.equals(sifre)) {
                System.out.println("Tebrikler");
                break;
            }
            i++;
            if (i == 5) {
                System.out.println("Hatalı giriş.Tahmin hakkınız doldu");
                flag=false;
                continue;
            }

            System.out.println("Hatalı giriş. Tekrar deneyin.");





        }*/
        //Nested loop kullanarak kullanıcıdan hangi işlemi yapmak
// istediğini sorun. 1-toplama 2-Çıkarma 3-çarpma 4-bölme 5-çıkış
// kullanıcının isteğine göre işlem yapın. Kullanıcının seçimine göre Girilen ekrandan
// 2 sayı alın ve işlemin sonucunu ekrana yazın çıkmak sonuç 0  devam etmek için 1 girmesini isteyin.

        // 1-toplama 2-çıkarma 3-çarpma 4-bölme 5-çıkış
        // çıkarma menüsüne hoş geldiniz
        // x:
        // y:
        // result;
        // menüden çıkmak için 0 işlemlere devam etmek için 1 giriniz


        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("1-toplama 2-çıkarma 3-çarpma 4-çıkış : ");
            int tercih = scan.nextInt();
            if (tercih == 1) {
                while (true) {
                    System.out.print("1. sayı: ");
                    int x = scan.nextInt();
                    System.out.print("2. sayı: ");
                    int y = scan.nextInt();
                    System.out.println("İşlem sonucu: " + (x + y));
                    System.out.print("Birüst menü için 0 işleme devam etmek için 1 basınız: ");
                    int tercih2 = scan.nextInt();
                    if (tercih2 == 0) {
                        break;
                    } else if (tercih2 == 1) {
                        continue;
                    } else {
                        System.out.println("Hatalı işlem nedeniyle işlemden çıkılmıştır");
                        break;

                    }
                }
            } else if (tercih == 2) {
                while (true) {
                    System.out.print("1. sayı: ");
                    int x = scan.nextInt();
                    System.out.print("2. sayı: ");
                    int y = scan.nextInt();
                    System.out.println("İşlem sonucu: " + (x - y));
                    System.out.print("Çıkış için 0 işleme devam etmek için 1 basınız: ");
                    int tercih2 = scan.nextInt();
                    if (tercih2 == 0) {
                        break;
                    } else if (tercih2 == 1) {
                        continue;
                    } else {
                        System.out.println("Hatalı işlem nedeniyle işlemden çıkılmıştır");
                        break;
                    }
                }
            } else if(tercih == 3) {
                while (true) {
                    System.out.print("1. sayı: ");
                    int x = scan.nextInt();
                    System.out.print("2. sayı: ");
                    int y = scan.nextInt();
                    System.out.println("İşlem sonucu: " + (x * y));
                    System.out.print("Çıkış için 0 işleme devam etmek için 1 basınız: ");
                    int tercih2 = scan.nextInt();
                    if (tercih2 == 0) {
                        break;
                    } else if (tercih2 == 1) {
                        continue;
                    } else {
                        System.out.println("Hatalı işlem nedeniyle işlemden çıkılmıştır");
                        break;

                    }
                }
            } else if (tercih == 4) {
               break;
                }else {
                System.out.println("Hatalı işlem tekrar deneyiniz.");
            }
        }
}}






