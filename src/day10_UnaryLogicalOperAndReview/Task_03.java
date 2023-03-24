package day02_MyfirstProgram.src.day10_UnaryLogicalOperAndReview;

public class Task_03 {
    public static void main(String[] args) {
        boolean x= false, y=false, z=true;
        x=!y;
        z=!x&&x==z;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }
}
