package day02_MyfirstProgram.src.day19_CustomMethods_Return;

public class Homework_05_Fibonacci {
    public static void main(String[] args) {
        fibonacci();
    }
    public static void fibonacci(){
        int n1=0,n2=1,n3,i,sira=10;
        System.out.print(n1+" "+n2);

        for(i=2;i<sira;++i){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
