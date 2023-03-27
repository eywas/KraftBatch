package day02_MyfirstProgram.src.day19_CustomMethods_Return;

import java.util.Scanner;

public class Homework_06_Ebob {
    public static void main(String[] args) {
        System.out.println(ebob());
    }

    public static int ebob() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen birinci sayıyı giriniz: ");
        int num1 = scan.nextInt();
        System.out.print("Lütfen ikinci sayıyı giriniz: ");
        int num2 = scan.nextInt();
        int ebob = 0;
        for (int k = 1; (k <= num1 || k <= num2) ; k++){
            if (num1 % k == 0 && num2 % k == 0) {
                ebob=k;
            }

        }return ebob;

    }
}
