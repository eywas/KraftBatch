package day02_MyfirstProgram.src.day06_Type_Casting;

public class Example {

    public static void main(String[] args) {
        //Ali sınıfta 7-7 halı saha maçı planlamak ve
        // oynanan maçta hakem olmak istiyor,
        // sınıfta 18 kişi var ise kaç kişi oyun dışı kalacaktır.

       /* int toplamMevcut=18;
        int oyuncu=14;
        int hakem=1;
        int oyunDisi=toplamMevcut-oyuncu-hakem; // bu satır bir metot oluyor

        System.out.println(oyunDisi);*/

        //Ali oynanan maçta 1 hakem olacak şekilde
        // okulda  7-7 halı saha maçıları planlamak istiyor
        // okul mevcudu 188 ise kaç kişi dışarıda kalır.
        int toplamMevcut=188;
        int oyuncu=14;
        int hakem=1;
        int oyunDisi=toplamMevcut%(oyuncu+hakem); // bu satır bir metot oluyor

        System.out.println(oyunDisi);

    }

}
