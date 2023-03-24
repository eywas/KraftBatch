package day02_MyfirstProgram.src.day20_CustomMethods_Overloading;

public class MaxNumber {
    public static void main(String[] args) {

        System.out.println(max(20,30));
    }

    public static int max(int x, int y){
        if (x>y)
            return x;
        return y;

}
}
