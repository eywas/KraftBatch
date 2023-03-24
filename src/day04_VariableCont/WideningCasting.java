package day02_MyfirstProgram.src.day04_VariableCont;

public class WideningCasting {
    public static void main(String[] args) {

        //byte < short < int < long < float < double

        int sayi = 9;
        double kur = 18.9;

        kur = sayi; //int tipindeki 9 değerini double içine attım.
                    //bu dönüştürme tipine Widening Casting Implicit Casting denir.

        System.out.println("kur = " + kur);
    }
}
