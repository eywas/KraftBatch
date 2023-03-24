package day02_MyfirstProgram.src.day15_If_Else_SWitch_Loops_Summary;

public class C01_If_Else {
    public static void main(String[] args) {
       //kullanıcının girdiğisayı çift mi tek mi?
        int x=10;

        if (x%2==0){
            System.out.println("Çift");
        }else{
            System.out.println("Tek");

        }

        System.out.println("-------------------------------------");

        //kulaanıcının girdiği sayı pozitif/negatif veya 0 a eşitse yazdırsın

        int y=0;
        if (y>0){
            System.out.println("Pozitif");
        } else if (y<0) {
            System.out.println("Negatif");

        }else{
            System.out.println("Sıfır");
        }

        System.out.println("-------------------------------------");


    }
}
