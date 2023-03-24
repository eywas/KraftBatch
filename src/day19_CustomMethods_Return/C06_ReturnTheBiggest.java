package day02_MyfirstProgram.src.day19_CustomMethods_Return;

public class C06_ReturnTheBiggest {
    public static void main(String[] args) {
        System.out.println("max(5,10) = " + max(5, 10));

        int maxNumber=max(10,20);
        System.out.println(maxNumber);

        int multiplication=maxNumber*3;
        System.out.println(multiplication);
    }
    public static int max(int a, int b){
        int result=0;
        if (a>b){
            result=a;
        }else {
            result=b;
        }
        return result;
    }
}
