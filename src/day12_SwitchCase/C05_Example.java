package day02_MyfirstProgram.src.day12_SwitchCase;

import java.util.Scanner;

public class C05_Example {
    public static void main(String[] args) {
        //Öğrencinin ortalamasını alın
        //Ortalama 50 altında ise zayıf
        //50 dahil 70 arası orta
        //70 dahil 85 arası iyi
        //85 ve üzeri pekiyi ekrana yazdırsın
        //85 ve üzeri alanları 95 ve üzeri mi diye kontrol etsin üzerindeyse onur belgesi yazdırsın
        Scanner scan = new Scanner(System.in);
        System.out.println("Ortalama: ");
        double ort= scan.nextDouble();
        if (ort<50){
            System.out.println("Zayıf");
        }else if(ort<70){
            System.out.println("Orta");

        }else if(ort<85){
            System.out.println("İyi");

        }else{
            System.out.println("Pekiyi");
            if (ort>=95){
                System.out.println("Başarı belgesi almaya hak kazandınız");
            }
        }

    }

}
