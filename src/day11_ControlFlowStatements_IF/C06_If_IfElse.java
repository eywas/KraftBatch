package day02_MyfirstProgram.src.day11_ControlFlowStatements_IF;

public class C06_If_IfElse {
    public static void main(String[] args) {

        // A ve B 2 adet integer sayıyı karşılaştırın
        // A büyüktür B den
        // B büyüktür A dan
        // A ve B eşittir

        int a=10;
        int b=20;
        if(a>b){
            System.out.println("A büyüktür B den");
        } else if (a==b) {
            System.out.println("A ve B eşittir");

        } else {
            System.out.println("B büyüktür A dan");
        }



    }
}
