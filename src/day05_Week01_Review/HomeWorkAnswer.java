package day02_MyfirstProgram.src.day05_Week01_Review;

public class HomeWorkAnswer {
    public static void main(String[] args) {
        /*60 soruluk bir sınavda 4 yanlış 1 doğruyu götürmektedir.
Tüm sorulara cevap veren bir öğrencinin 51,25 neti
olduğuna göre ,öğrenci kaç soruya yanlış yanıt vermiştir?

         */
        double soruSayisi=60;
        double net=51.25;
        double yanlisSoru=(soruSayisi-net)/1.25;
        System.out.println("yanlisSoru = " + yanlisSoru);



    }
}
