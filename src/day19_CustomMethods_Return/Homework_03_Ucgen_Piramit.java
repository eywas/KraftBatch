package day02_MyfirstProgram.src.day19_CustomMethods_Return;

public class Homework_03_Ucgen_Piramit {
    public static void main(String[] args) {
        ucgenPiramit(5);
    }
    public static void ucgenPiramit(int num) {

        for (int i = num; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = (num+1) - i; k > 0; k--) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
