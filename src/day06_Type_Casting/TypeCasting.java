package day02_MyfirstProgram.src.day06_Type_Casting;

public class TypeCasting {
    public static void main(String[] args) {
        //byte, short, int, float,double, long
        //char
        //boolean

        byte b=5;
        short s=129;
        b= (byte) s;
        System.out.println(b);

        int i=10;
        double d=20;
        d=i;
        //i 4 byte ve d 8 byte
                i=(int)d; //bu işlemde veri kaybı olursa kabul ettik anlamına geliyor

        float f=2.5f;
        i=(int)f;
        System.out.println(i);

        String pencil =(null);
        System.out.println(pencil);
    }
}
