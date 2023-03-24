package day02_MyfirstProgram.src.day14_NestedWhileDoWhile;

import java.util.Scanner;

public class C01_MinimumNumber {
    public static void main(String[] args) {
        //kullanıcıdan sayılar alıp en küçüğünü ekrana yazdırın
        /*
Write a program that asks the user to enter a number for 5 times.
return the minimum number
 */
        Scanner scan=new Scanner(System.in);
        int min = Integer.MAX_VALUE;

        for (int i=1 ; i<=5 ; i++){
            System.out.println("Enter a number : ");
            int num= scan.nextInt();
            if (num<min){
                min=num;
            }
        }
        System.out.println("min = "+min);
    }

}
