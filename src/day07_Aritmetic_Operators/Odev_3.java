package day02_MyfirstProgram.src.day07_Aritmetic_Operators;

import java.util.Scanner;

public class Odev_3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Sıra Sayısı: ");
        int siraSayisi= scan.nextInt();
        System.out.print("Sıra Koltuk Sayısı: " );
        int siraKoltukSayisi=scan.nextInt();
        System.out.print("Katılımcı Sayısı: " );
        int katilimciSayisi=scan.nextInt();

        int kapasite=siraSayisi*siraKoltukSayisi;
        int bosKoltuk=kapasite-katilimciSayisi;
        int oturulanSira=katilimciSayisi/siraKoltukSayisi+1;
        int bosSira=siraSayisi-oturulanSira;
        int oturulanSiradakiBosKoltukSayisi=siraKoltukSayisi-(katilimciSayisi%siraKoltukSayisi);

        System.out.println("Kapasite = " + kapasite);
        System.out.println("Boş Koltuk = " + bosKoltuk);
        System.out.println("Boş Sıra = " + bosSira);
        System.out.println("Oturulan Sıra = " + oturulanSira);
        System.out.println("Oturulan Sıradaki Boş Koltuk Sayısı = " + oturulanSiradakiBosKoltukSayisi);
    }
}
