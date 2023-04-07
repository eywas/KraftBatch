package day02_MyfirstProgram.src.day25_Summary;

public class Task {
    /*Bir
    method yazın dönüş tipi olsun kullanıcıdan 2 string istesin ve
    eğer stringlerin length i eşitse girdiğiniz kelimelerin karekter
    sayısı eşit mesajı döndürsün eğer aynı stringler gönderildiyse, bu
    kelimeler aynı mesajı döndürsün Kelimeler her anlamda farklı
    ise kullanıcıyı aynı sürece sokun
         */
    public static void main(String[] args) {
        System.out.println(task("ayşe", "ali"));
    }
    public static boolean task(String a,String b){
        if(a.equalsIgnoreCase(b)){
            System.out.println( "kelimeler aynı");
            return true;
        }
        if(a.length()==b.length()){
            System.out.println( "girdiğiniz kelimelerin karekter sayısı eşit");
            return true;
        }
        System.out.println( "kelimeler aynı değil ve  uzunlukları aynı değil");
        return false;

    }
    }

