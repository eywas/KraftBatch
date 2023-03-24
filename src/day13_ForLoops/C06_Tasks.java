package day02_MyfirstProgram.src.day13_ForLoops;

public class C06_Tasks {
    public static void main(String[] args) {
        // 0 ile 100 arası tüm sayıları yazdırın
        for (int i = 0; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("--------------------------");
        // 15 ile 100 arası tüm sayıları yazdırın

        for (int i = 15; i <= 100; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("--------------------------");
        // 100 den 0 a kadar olan sayıları tersten yazdırın

        for (int i = 100; 0 <= i; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("--------------------------");

        // 0 ile 100 arasındaki çift sayıları yazdırın

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

        }
        System.out.println();
        System.out.println("--------------------------");

        // 0 ile 100 arasındaki tek sayıları yazdırın

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("--------------------------");

        // 0 ile 100 arasındaki sayıların toplamını yazdırın
        int sum=0;
        for (int i = 1; i <= 100; i++) {
           sum+=i;
        }
        System.out.println("Sum = " + sum);


        System.out.println();
        System.out.println("--------------------------");
        // 1 ile 20 arasındaki sayıların küplerini alıp çarpın
        for (int i=1; i<=20; i++){
            System.out.println(i+" "+i*i*i);
        }
        System.out.println();
        System.out.println("--------------------------");
        // 23 ile 50 derece arasındaki tüm Fahrenheit değerlerini yazdırın
        //(C=(F-32) / 1.8) F=1.8*C+32
        for (int i=23; i<=50; i++){
            System.out.println(i+"C " +(i*1.8+32)+ " F");
        }
        System.out.println();
        System.out.println("--------------------------");

        // a dan z Ye kadar bütün harfleri yazdırın

        for (char ch='a' ; ch<='z' ;ch++){
            System.out.println(ch+" ");
        }
        System.out.println();
        System.out.println("--------------------------");

        // a dan z Ye kadar bütün harfleri yazdırın

        for (char ch='A' ; ch<='Z' ;ch++){
            System.out.println(ch+" ");
        }
        System.out.println();
        System.out.println("--------------------------");
        //9 sayısının çarpım tablosunu yazdırın

        for (int i=1; i<=10; i++){
            System.out.println("9 X "+i+" = "+9*i);
        }
        System.out.println();
        System.out.println("--------------------------");


    }
}