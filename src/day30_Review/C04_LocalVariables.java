package day02_MyfirstProgram.src.day30_Review;

public class C04_LocalVariables {
    /*
    1. Bir metod içerisinde oluşturulan bir değişkenin scope u (etki alanı) o metodun içidir.
    O değişkeni başka bir yerde kullanamaytız, çağıramayız. Bu tip değişkenlere LOCAL değişkenler denir.

    2. For, whilwe etc döngülerin de kendi scope ları vardır. Loop dışında kullanamayız

    3. Local değişkenler değer taanmadan oluşturulabilir. Ancak değer atamadan bu değişkenleri kullanamayız.
    */

    public static void main(String[] args) {
        String isim;
      //  System.out.println(isim);  // Local değişken initialize edilmeden kullanılamaz isim hata verir.

        int i;
        // i++; // initialize edilmeyen değişken kullanılamaz
        {
            int i2=5;
            System.out.println("i2 = " + i2); // burada yazdırır
        }
        // System.out.println("i2 = " + i2); // burada yazdırmaz out of scope
    }
}
