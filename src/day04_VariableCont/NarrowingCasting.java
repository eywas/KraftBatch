package day02_MyfirstProgram.src.day04_VariableCont;

public class NarrowingCasting {
    public static void main(String[] args) {

        double rate = 3.9;

        int num;

        num = (int)rate;        //burada rate nin önüne parantez içinde int yazıp dönüşümü manuel yaptık

        System.out.println(num);
    }
}
