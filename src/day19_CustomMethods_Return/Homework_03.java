package day02_MyfirstProgram.src.day19_CustomMethods_Return;

public class Homework_03 {
    public static void main(String[] args) {
        ucgenPiramit();

    }

    public static char ucgenPiramit() {
        char ch=' ';
        for (int i = 3; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");

            }
            for (int k = 4 - i; k > 0; k--) {
                System.out.print("* ");

            }
            System.out.println();

        } return ch;
    }
}
