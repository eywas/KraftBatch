package day02_MyfirstProgram.src.day10_UnaryLogicalOperAndReview;

public class Task_04 {
    public static void main(String[] args) {
        int i=2;
        boolean ln;
       // boolean ln2;

        ln=--i==i || i>1;
        System.out.println("ln = " + ln);

        ln=i++==i || i<1;


        System.out.println("ln = " + ln);


    }
}
