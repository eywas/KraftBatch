package day02_MyfirstProgram.src.day26_String_Lab;

public class UmitCalisma {
    public static void main(String[] args) {
        String kelime = "Edirne";
        System.out.println(harfSil2(kelime,'e'));
    }
    //Kullanıcıdan bir input alın ve girilen inputun ilk 3
    // harfini yazan , 3 kelimeden az ise inputu döndüren bir metot yazınız.
    //Merhaba Mer Ali Ali



    public static String ilkUcHarfGetir(String str){
        if(str.length()<3){
            return str;
        }
        return str.substring(0,3);
    }
    //Kullanıcıdan bir dize sözcük alın ve her
    // boşluğa % ibaresi ekleyin. Merhaba dünya Merhaba%dünya
    // "   merhaba dünya  "   %%%merhaba%dünya%%

    public static String boslukSilYuzdeEkle(String str){

        return str.replace(" ","%");
    }

    public static String ilkKelimeDegistir(String str, String eski, String yeni) {
        return str.replaceFirst(eski, yeni);
    }

    public static String trim(String str) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                start = i;
                break;
            }
        }
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {
                end = i;
                break;

            }

        }
        return str.substring(start, end + 1);


    }
    public static String adetKadarYazdir(String str,int adet){
        String result="";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < adet; j++) {
                result+=str.charAt(i);
            }


        }return result;
    }
    public static String subString(String str, int index){
        String result="";
        for (int i = index; i < str.length(); i++) {
            result+=str.charAt(i);

        }return result;
    }public static String subString(String str, int start,int end){
        String result="";
        for (int i = start; i < end; i++) {
            result+=str.charAt(i);

        }return result;
    }
    public static int karakterSay(String str,char ch){
        String x=ch+"";
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i,i+1).equalsIgnoreCase(x)){
                count++;
            }
        }return count;

    }
    public static String karakterSil(String str, String ch) {

            String result = str.replace(ch, "");
            return result;
    }
    public static String harfSil(String str, char target){
        String target2=target+"";  // char ı String yapmak için bunu kullandık
        return str.replace(target2,"");
    }
    public static String harfSil2(String str, char target){
        String result="";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)!=target){
                result+=str.charAt(i);
            }

        }return result;
    }
}
