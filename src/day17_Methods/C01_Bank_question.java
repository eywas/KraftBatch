package day02_MyfirstProgram.src.day17_Methods;

import java.util.Scanner;

public class C01_Bank_question {
    public static void main(String[] args) {
        //Banka menüsü oluşturun 1 para ekle 2 hesabımı gör 3 para çek 4 çıkış (money=2000)
        //   while işleme devam etmek için 1 e bir üst menü için 2 ye kart iade için 3 e basın
        double money=2000;
        Scanner scan = new Scanner(System.in);
        outerLoop: while (true){
            System.out.println("1:Para ekle 2: Para çek 3:Bakiye 4: Çıkış");
            System.out.println("Yapmak istediğiniz işlemi seçiniz: ");
            int tercih = scan.nextInt();
            switch (tercih){
                case 1:
                    while (true){
                        System.out.println("Eklemek istediğiniz tutarı giriniz: ");
                        double para = scan.nextDouble();
                        money +=para;
                        System.out.println("Bir üst menü için 1 e basınız. İşleme devam etmek için 2 ye basınız.");
                        int tercih2 = scan.nextInt();
                        if (tercih2==1){
                            break; // burada continue outerLoop yazarsak aynı şey olur
                        } else if (tercih2==2) {
                            continue ;

                        }else{
                            System.out.println("Hatalı işlem yapıldığı için kart iade");
                            break outerLoop;
                        }
                    }
                    break;







                case 2:
                    while (true){
                        System.out.println("Çekmek istediğiniz tutarı giriniz: ");
                        double para = scan.nextDouble();
                       if (para>money){
                           System.out.println("Hesabınızda yeterli bakiye yoktur");
                           continue outerLoop;
                       }
                       money-=para;
                        System.out.println("Bir üst menü için 1 e basınız. İşleme devam etmek için 2 ye basınız.");
                        int tercih2 = scan.nextInt();
                        if (tercih2==1){
                            break; // burada continue outerLoop yazarsak aynı şey olur
                        } else if (tercih2==2) {
                            continue ;

                        }else{
                            System.out.println("Hatalı işlem yapıldığı için kart iade");
                            break outerLoop;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Bakiyeniz : "+money);
                    break;
                case 4:
            break outerLoop;
                default:
                    System.out.println("Hatalı işlem tekrar deneyin");}

                    }
                    }
        }


