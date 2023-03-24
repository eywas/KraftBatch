package day02_MyfirstProgram.src.day15_If_Else_SWitch_Loops_Summary;

public class C08_Example {
    public static void main(String[] args) {
        for (int i = 100; i >0 ; i-=2) {
            System.out.print(i+" ");

        }

        System.out.println("-------------------------------------------");


        int i=100;
        while (i>0){
            System.out.print(i+" ");
            i-=2;
        }

        System.out.println("-------------------------------------------");


        for (int j = 0; j <=20 ; j+=3) {
            System.out.print((int)Math.pow(j,3)+" ");

        }
    }

}
