package day02_MyfirstProgram.src.day24_StringClass_Cont.Tasks;

public class Task_01 {
    public static void main(String[] args) {
            String isim="Hayrettin";

            System.out.println(ortadakiUcHarf(isim));
    }

    /**
     * İsminizin ortadaki 3 harfini veren bir method
     * @param isim
     * @return
     */
    public static String ortadakiUcHarf(String isim){
        return isim.substring(3,6);
    }
}
