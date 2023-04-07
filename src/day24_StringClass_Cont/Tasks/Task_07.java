package day02_MyfirstProgram.src.day24_StringClass_Cont.Tasks;

public class Task_07 {
    public static void main(String[] args) {
        String str="Dün akşam eve giderken onları görmüştüm.";
        System.out.println(newString(str));
    }

    /**
     * Dün akşam eve giderken onları görmüştüm Cümlesindeki ü harfinin önünde ve arkasında
     * olan harflerden yeni bir string üreten method
     * @param str
     * @return
     */
    public static String newString(String str){
       str=str.replace(" akşam eve giderken onları gör","").replace("ü","").replace(".","");
        return str;
    }
}
