package day02_MyfirstProgram.src.day10_UnaryLogicalOperAndReview;

public class Task_02 {
    public static void main(String[] args) {
        int age = 20;
        String health = "healthy";

        boolean toBeSoldier = age>=20&&health=="healthy";
        System.out.println("toBeSoldier = " + toBeSoldier);

        toBeSoldier = age >= 22 && health == "healthy" || age >= 19 && health == "poorly";


        System.out.println("toBeSoldier = " + toBeSoldier);


    }
}
