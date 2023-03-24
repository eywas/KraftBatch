package day02_MyfirstProgram.src.day07_Aritmetic_Operators;

import java.util.Scanner;

//import işlemi hazır classları dışarıdan almamızı sağlar. başkası tarafından yazılan kodları kendi kodumuza eklememizi sağlar.

public class ScannerExample {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);// bu kalıp ifadedir. dışarıdan veri alabilmemizi sağlar. konsola manuel giriş yapılabiliyor.
        System.out.print("Kimya: ");
        double kimya=scan.nextDouble();
        System.out.print("Fizik: ");
        double fizik=scan.nextDouble();
        System.out.print("Matematik: ");
        double matematik=scan.nextDouble();
        double ortalama=(kimya+fizik+matematik)/3;
        System.out.print("Ortalama: "+ortalama);

    }
}
