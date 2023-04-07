package day02_MyfirstProgram.src.day28_Quiz_Answers;

public class Ouiz_Soru_1 {
    public static void main(String[] args) {
        System.out.println(sayiTopla(5));
    }
    public static int sayiTopla(int sayi){
        int total=0;
        for (int i = 0; i <= sayi; i++) {
             total+=i;

        }return total;
    }

}

