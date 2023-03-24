package day02_MyfirstProgram.src.day14_NestedWhileDoWhile;

public class Homework_For_01 {
    public static void main(String[] args) {
//        1
//        12
//        123
//        1234
//        12345
//        123456
          for (int i=1; i<=6; i++){
            for (int j=1; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------");


//        1
//        22
//        333
//        4444
//        55555
//        666666

          for (int i=1; i<=6; i++){
            for (int j=1; j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------");
        //1
        //2 3
        //4 5 6
        //7 8 9 10
        //11 12 13 14 15

        for (int i=0,k=1; i<5; i++){
            for (int j=0; j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }




    }
}
