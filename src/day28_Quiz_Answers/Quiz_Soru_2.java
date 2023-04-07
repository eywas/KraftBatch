package day02_MyfirstProgram.src.day28_Quiz_Answers;

public class Quiz_Soru_2 {
    public static void main(String[] args) {
        vucutKitleEndeksiHesapla(68,170);
    }
    public static void vucutKitleEndeksiHesapla(int kilo, int boy){
         double vki=(kilo*10000 / (boy *boy));

         if (vki>30){
         System.out.println("obez");
        } else if (vki>25) {
            System.out.println("kilolu");
        }else if (vki>20) {
            System.out.println("normal");
        }else{
            System.out.println("zayıf");
        }
    }
}

