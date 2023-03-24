package day02_MyfirstProgram.src.day10_UnaryLogicalOperAndReview;

public class Task_01 {
    public static void main(String[] args) {
        int a=5;
        int b=7;
        boolean bl;

        bl  = (a>b)&&(b==7);
        System.out.println("bl = " + bl);


        bl = a/b>0||(b>a);
        System.out.println("bl = " + bl);


        bl = a-b>0&&b>a;
        System.out.println("bl = " + bl);



    }
}
