package day02_MyfirstProgram.src.day28_Quiz_Answers;

public class Quiz_Soru_4 {
    public static void main(String[] args) {
        System.out.println(faktoriyelHesapla(5));
    }
    public static int faktoriyelHesapla(int num){
        int faktoriyel=1;
        for (int i=1;i<=num; i++){
            faktoriyel*=i;

        }
        return faktoriyel;
    }
}
