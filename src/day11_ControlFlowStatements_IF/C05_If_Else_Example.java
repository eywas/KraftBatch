package day02_MyfirstProgram.src.day11_ControlFlowStatements_IF;

import java.util.Scanner;

public class C05_If_Else_Example {

    public static void main(String[] args) {
     //Hava sıcaklığı 20 derecenin altında ise hava soğuk 20 ve üzerinde ise hava sıcak yazsın

       /* double temp= 19.9;
        if(temp>=20) {
            System.out.println("Hava sıcak");
        }else {
            System.out.println("Hava soğuk");
        }

        */
        //kullanıcıdan bir tam sayı alın ekrana tek mi çift mi olduğunu yazdırın
        Scanner scan = new Scanner(System.in);
        System.out.println(" Lütfen bir sayı giriniz : ");
        int sayi = scan.nextInt();

        if(sayi%2==0){
            System.out.println("Çift");
        }else {
            System.out.println("Tek");
        }


    }
}
