package day02_MyfirstProgram.src.day07_Aritmetic_Operators;

public class Aritmetic_Operators_3 {
    public static void main(String[] args) {
       //4500 dakika kaç saattir
       /* int dk=4500;
        int saat=4500/60;
        System.out.println("saat = " + saat);

        //4321 dakika saat dk ve saniye cinsine çevrildikten sonra saniyeyi ekrana yazdırın
        System.out.println(4321%60);

        */
        // 31502 saniye kaç saat kaç dakika kaç saniyedir? (1 saat 60 dakika 1 dakika 60 sn)

    int toplamSaniye=31502;
    //1 saat 60-60 saniye
    int saat=toplamSaniye/3600;
    //int dakika=(toplamSaniye-saat*3600)/60;
    int dakika=toplamSaniye%3600/60;
    int saniye=toplamSaniye%60;

        System.out.println(saat+" saat " + dakika+" dakika "+saniye+ " saniye");


        //son bir saati tekrar izle


    }
}
