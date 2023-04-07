package day02_MyfirstProgram.src.day30_Review;

public class C05_ClassLevelVariables {
    /*  Bir class içerisinde tüm metodların içerisinde bir değişkene erişebilmek istiyorsam
    onu metodların dışında class içerisinde tanımlamam gerekir. Class Level

    1. Class içerisinde tanımlanan değişkenin scope u tüm class tır.
    2. Class level değişkenlere ilk değer atanmasa da olur.
    3. Değer atanmadan da bu değişkenler kullanılabilir.JAVA bunlara default değerler atar.
    4. static olarak tanımlanan değişkenler, diğer tüm class lardan Class ismi ile erişilebilir olur.
    5. Eğer metod da static ise içerisine static olmayan hiçbir şey almaz.

     */

    static int turkish_PI=3;
    static String turkishPizza;
    static boolean bl;
    static char ch;
    static int i;

    int i2;  // başka class larda kullanamayız
    boolean bl2;

    public static void main(String[] args) {
        System.out.println("turkish_PI = " + turkish_PI);
        System.out.println("turkishPizza = " + turkishPizza);
        System.out.println("bl = " + bl);
        System.out.println("ch = " + ch);
        System.out.println("i = " + i);
      //  System.out.println("i2 = " + i2);  //i2 hata verir, instance olduğu için önce obje oluşturmalıyız

    }
}
