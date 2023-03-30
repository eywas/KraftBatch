package day02_MyfirstProgram.src.day22_Class_And_Object_Memory;

public class Main {
    public static void main(String[] args) {
        Daire2 benimDairem=new Daire2();
        benimDairem.r=2;
        System.out.println(benimDairem.alanHesapla());
        Daire2 seninDairen=new Daire2();
        seninDairen.r=5;
        System.out.println(seninDairen.alanHesapla());
    }
}
