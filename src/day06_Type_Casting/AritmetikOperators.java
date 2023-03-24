package day02_MyfirstProgram.src.day06_Type_Casting;

public class AritmetikOperators {
    public static void main(String[] args){

       // int x=14567345;
        //int y=9;
        //int z=x+y;
        //int z=x-y;
       // int z=x*y;
        //int z=x/y; //int değer olduğundan sonuç 2 çıkıyor
       // double z=x/y; //iki değer de int olduğundan sonuç 2.0 çıkar

       // double z=(double)x/y;// iki değerden birini double yaparsak sonuç 2.5 çıkar. Burada x i double olarak genişlettik

       /* int z=x%y; // bu işlem mod alma. 5 in 2 ye bölümünden kalanı verir.
                System.out.println(z);

        */
        int sayi=3+5/2*4%(12-9); /*burada işlem sırası önce parantez içi, sonra soldan sağa *,/,% hangisi önce gelirse
        peşinden + ve - hangisi önce gelirse */

        System.out.println(sayi);


    }

}
