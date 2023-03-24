package day02_MyfirstProgram.src.day20_CustomMethods_Overloading;

public class C03_MethodOverloading {
    public static void main(String[] args) {
        int sum = sum(10,20);
        System.out.println("sum = " + sum);

        int sum2 = sum(10,20,30);
        System.out.println("sum2 = " + sum2);

        int sum3 = sum(10,20,30,40);
        System.out.println("sum3 = " + sum3);
    }

    public static int sum(int num1,int num2){
        return num1+num2;
    }
    public static int sum(int num1,int num2,int num3){
        return num1+num2+num3;
    }

    public static int sum(int num1,int num2,int num3,int num4){
        return num1+num2+num3+num4;
    }

}

/*
Task2:
        1. create a method that can find the sum of two numbers

        2. create a method that can find the sum of three numbers

        3. create a method that can find the sum of four numbers
                      */

