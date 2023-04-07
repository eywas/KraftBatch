package day02_MyfirstProgram.src.day19_CustomMethods_Return;

import java.util.Scanner;

public class Homework_02_Taban_Kuvvet {
    public static void main(String[] args) {
        System.out.println(tabanKuvvet(3,3));
    }

    /**
     * Kullanıcı dan 2 sayı alıp ilk sayıyı taban, ikinci sayıyı ise üs kabul eden mathPow metodu
     * @return
     */
    public static int tabanKuvvet(int taban, int kuvvet) {
       int result = 1;

        for (int i = 0; i < kuvvet; i++) {

            result *= taban;
        }
        if (taban == 0 && kuvvet == 0) {
            System.out.println("Tanımsız");
        } return result;
    }
}
