package day02_MyfirstProgram.src.day24_StringClass_Cont;

public class HW_2_Y_Sayisi {
    public static void main(String[] args) {
        String str="javayı Seviyor muyum?";
        String str1=str.replace("y","");
        int result=str.length()-str1.length();
        System.out.println("javayı Seviyor muyum? ifadesindeki y harfinin sayısı: "+result);
    }

}
