package day02_MyfirstProgram.src.day11_ControlFlowStatements_IF;

import java.util.Scanner;

public class C03_IF_Example {
    // Ali'nin fizik notu 50
    // kimya notu 30
    //ortalaması 50 üzerinde ise geçti 50 ve altında ise hiçbir şey yazdırmasın

    public static void main(String[] args) {
       // double f=50;
      //  double k=55;
     //   double o=(f+k)/2;

       // boolean result= (o>50);  (bu ifadeyi  o>50 yerine de atama yaparak if in içine => result yazabiliriz


        // if(o>50){
        //            System.out.println("Geçti");
        //        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfenders notlarını giriniz");
        System.out.println("Fizik : ");
        double f = scan.nextDouble();
        System.out.println("Kimya : ");
        double k = scan.nextDouble();
        System.out.println("Geçme notu");
        double gecmeNotu=scan.nextDouble();
        double o=(f+k)/2;
        if(o>=gecmeNotu){
            System.out.println("Sınıfı geçtiniz tebrikler.");
        }



    }
}
