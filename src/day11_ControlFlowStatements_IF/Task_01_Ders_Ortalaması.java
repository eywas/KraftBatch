package day02_MyfirstProgram.src.day11_ControlFlowStatements_IF;

import java.util.Scanner;

public class Task_01_Ders_Ortalaması {
    public static void main(String[] args) {
        //fiizk, kimya ve matematik notlarını konsoldan alıp ortalama 80 ve üzerinde ise geçti yoksa kaldı yazsın

        Scanner scan=new Scanner(System.in);
        System.out.println("Fizik : ");
        double f = scan.nextDouble();
        System.out.println("Kimya : ");
        double k = scan.nextDouble();
        System.out.println("Matematik : ");
        double m = scan.nextDouble();
        double o=(f+k+m)/3;
        if(o>80){
            System.out.println("Geçtiniz");
        }else {
            System.out.println("Kaldınız");
        }

    }}
