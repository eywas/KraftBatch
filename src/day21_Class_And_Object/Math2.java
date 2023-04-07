package day02_MyfirstProgram.src.day21_Class_And_Object;

public class Math2 {
    public static int pow(int taban, int kuvvet) {
        int result = 1;

        for (int i = 0; i < kuvvet; i++) {

            result *= taban;
        }
        if (taban == 0 && kuvvet == 0) {
            System.out.println("Tanımsız");
        } return result;
    }
}
