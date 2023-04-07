package day02_MyfirstProgram.src.day25_Summary;

public class String_Example {


    public static void main(String[] args) {
        String kelime="Merhaba  ";
        String kelime2="Dünya";
        String kelime3="r";
        String kelime4="ErMan";
        String kelime5="merhaba  ";
        String kelime6="Mer";
        System.out.println(uzunluk(kelime)); //kelime.length()
        System.out.println("--------------------");
        System.out.println(harfleriKucult(kelime)); //kelime.toLowerCase()
        System.out.println("--------------------");
        System.out.println(harfleriBuyut(kelime)); //kelime.toUpperCase()
        System.out.println("--------------------");
        System.out.println(karakterGetir(kelime, 4)); //kelime.charAt()
        System.out.println("--------------------");
        System.out.println(birlestir(kelime, kelime2)); //kelime.concat()
        System.out.println("--------------------");
        System.out.println(iceriyormu(kelime, kelime3)); //kelime.contains(kelime3)
        System.out.println("--------------------");
        System.out.println(bosluklariSil(kelime)); //kelime.trim()
        System.out.println("--------------------");
        System.out.println(kelimeDegistir(kelime, "Mer", "Har")); //kelime.replace()
        System.out.println("--------------------");
        System.out.println(kelimeDegistirIlk(kelime2, "ü", "e")); //kelime2.replaceFirst()
        System.out.println("--------------------");
        System.out.println(ilkIndexNoGetir(kelime, "a")); //kelime.indexOf()
        System.out.println("--------------------");
        if (ikinciKelimedeVarMi(kelime,kelime4)>=0){
            System.out.println("İçinde var ve 2. kelimenin "+ikinciKelimedeVarMi(kelime,kelime4)+" indeksinde yer alıyor.");

        }else{
            System.out.println("2. kelimenin içerisinde yer almıyor.");
        }
        System.out.println("--------------------");
        System.out.println(sonIndexNoGetir(kelime, "a")); //kelime.lastIndexOf()
        System.out.println("--------------------");
        System.out.println(esitMi(kelime, kelime5)); //kelime.equals()
        System.out.println("--------------------");
        System.out.println(esitMi(kelime, kelime5)); //kelime.equalsIgnoreCase()
        System.out.println("--------------------");
        System.out.println(bosMu(kelime)); //kelime.isEmpty()
        System.out.println("--------------------");
        System.out.println(basliyorMu(kelime,kelime6));
        System.out.println("--------------------");
        System.out.println(indekstenItibarenYaz(kelime,1));


    }
    //length()
    //Girilen String bir ifadenin uzunluğunu döndüren methodu yazınız
    public static int uzunluk(String str){
        return str.length();
    }
    //toLowerCase()
    public static String harfleriKucult(String str){
        return str.toLowerCase();
    }
    //toUpperCase()
    public static String harfleriBuyut(String str){
        return str.toUpperCase();
    }
    //charAt()
    public static char karakterGetir(String str,int index){
        return str.charAt(index);
    }
    //concat()
    public static String birlestir(String a, String b){
        return a.concat(b);
    }
    //contains()
    public static boolean iceriyormu(String str, String kontrolEdilecekKelime){
        return str.contains(kontrolEdilecekKelime);
    }
    public static boolean iceriyormu2(String str, String kontrolEdilecekKelime){
        if (str.indexOf(kontrolEdilecekKelime)<0){
            return false;
        }return true;
    }
    //trim() Stringin başındaki ve sonundaki boşlukları siler
    public static String bosluklariSil(String str){
        return str.trim();
    }
    //replace() benim verdiğim değer ile değiştir
    public static String kelimeDegistir(String str, String eskiKelime, String yeniKelime){
        return str.replace(eskiKelime,yeniKelime);
    }
    //replaceFirst() ilk gördüğü yeri değiştirir
    public static String kelimeDegistirIlk(String str, String eskiKelime, String yeniKelime){
        return str.replaceFirst(eskiKelime,yeniKelime);
    }
    //indexOf()
    public static int ilkIndexNoGetir(String str, String kelime){
        return str.indexOf(kelime);
    }
    public static int ilkIndexNoGetir(String str, char kelime) {
        return str.indexOf(kelime);
    }
    public static int ikinciKelimedeVarMi(String str1, String str2){
      return str2.indexOf(str1.trim().charAt(0));
    }
    //lastIndexOf()
    public static int sonIndexNoGetir(String str, String kelime){
        return str.indexOf(kelime);
    }
    public static int sonIndexNoGetir(String str, char kelime) {
        return str.indexOf(kelime);
    }
    //equals
    public static boolean esitMi(String a, String b){
        return a.equals(b);
    }
    //equalsIgnoreCase
    public static boolean esitMiBuyukKucukIhmalEt(String a, String b){
        return a.equals(b);
    }
    //isEmpty()
    public static boolean bosMu(String str){
        return str.isEmpty();
    }
    //startsWith
    public static boolean basliyorMu(String kelime, String kontrolEdilecekKelime){
        return kelime.startsWith(kontrolEdilecekKelime);
    }
    //substring
    public static String indekstenItibarenYaz(String str, int index){
        return str.substring(index);
    }
    public static String indekstenItibarenYaz(String str, int startindex, int endindex){
        return str.substring(startindex,endindex);
    }




}
