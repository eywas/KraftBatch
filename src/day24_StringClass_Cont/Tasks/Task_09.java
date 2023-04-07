package day02_MyfirstProgram.src.day24_StringClass_Cont.Tasks;

public class Task_09 {
    public static void main(String[] args) {
       cocukBayrami("Sevinçliyiz hepimiz. Bugün 23 Nisan.");

    }

    /**
     * cümle içinde sev köküne sahip bir kelime var ise "what a lovely person" mesajı döndüren metod
     * @param sev
     */
    public static void cocukBayrami(String sev){
        if (sev.contains("sev")||sev.contains("Sev")){
            System.out.println("what a lovely person");
        }

    }
}
