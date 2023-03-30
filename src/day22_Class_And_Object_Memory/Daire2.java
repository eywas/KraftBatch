package day02_MyfirstProgram.src.day22_Class_And_Object_Memory;

public class Daire2 {

    double r;
    double pi=Math.PI;
    public double alanHesapla(){
        return Math.pow(r,2)*Math.PI;
    }
    public static double alanHesapla2(int yaricap){
        return yaricap*yaricap*Math.PI;
    }
}
