package day02_MyfirstProgram.src.day24_StringClass_Cont.Tasks;

public class Task_02 {

    public static void main(String[] args) {
        String isim="Hayrettin";
        String soyisim="Yolcu";

        System.out.println(isimSoyisim(isim, soyisim));
    }
    /**
     * 2 İsminizi ve soyadınız hangisi kısa ise diğerine onun boyuna kısaltın
     *   yani fazla karakterleri atın Ve isminizle soy adınızı birleştirin
     * @param isim
     * @param soyisim
     * @return
     */
    public static String isimSoyisim(String isim, String soyisim){

        if (isim.length()>soyisim.length()){
            String esitle= isim.substring(0,soyisim.length());
            String result= esitle.concat(" "+soyisim);
            return result;
        }else {
            String esitle= soyisim.substring(0,isim.length());
            String result= isim.concat(" "+esitle);
            return result;
        }
    }



}
