package day02_MyfirstProgram.src.day15_If_Else_SWitch_Loops_Summary;

import java.util.Scanner;

public class C04_Switch_Case_Example {
    public static void main(String[] args) {
        int x = 5;

        switch (x) {
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
            case 4:
                System.out.println("D");
                break;
            case 5:
                System.out.println("E");
                break;
            default:
                System.out.println("F");
        }


        System.out.println("---------------------------");

        Scanner scan=new Scanner(System.in);
        System.out.print("et menü, sebze menü, çocuk menü (1-2-3)");
        int tercih_1= scan.nextInt();

        switch (tercih_1){
            case 1:
                System.out.println("pirzola mı(1) tavuk mu(2)");
                int tercih_2= scan.nextInt();
                switch (tercih_2){
                    case 1:
                        System.out.println("pirzola 50TL");
                        break;
                    case 2:
                        System.out.println("tavuk 30TL");
                        break;
                    default:
                        System.out.println("hatalı giriş");

                }
                break;
            case 2:
                System.out.println("enginar mı(1) roka salatası mı(2)");
                int tercih_3= scan.nextInt();
                switch (tercih_3){
                    case 1:
                        System.out.println("enginar 10TL");
                        break;
                    case 2:
                        System.out.println("roka salatası 5TL");
                        break;
                    default:
                        System.out.println("hatalı giriş");

                }
                break;
            default:
                System.out.println("hatalı giriş");
        }




    }


}
