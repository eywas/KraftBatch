package day02_MyfirstProgram.src.day14_NestedWhileDoWhile;

public class C04_NestedForLoop {
    public static void main(String[] args) {
       /*111111
111111
111111
111111
111111
111111

        */
        for (int i=1; i<=6; i++){
            for (int j=1 ; j<=6 ; j++) {
                System.out.print(1);// i yazdırsak 111 222 333 diye yazar
                                    // j yazdırsak 123 123 123 diye yazar
            }
            System.out.println();

        }

        System.out.println("--------------------------------------------");
        /*
         *
         **
         ***
         ****
         *****
         ******

         */

        for (int i=1; i<=6; i++){
            for (int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------");
        /*
         ******
         *****
         ****
         ***
         **
         *
         */

        for (int i=1; i<=6; i++){
            for (int j=6; i<=j;j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
