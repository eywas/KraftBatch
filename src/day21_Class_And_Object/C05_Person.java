package day02_MyfirstProgram.src.day21_Class_And_Object;

public class C05_Person {
    //isim, cinsiyet, yaş --> fields
    // uyu()  ,  oyna()

    String isim;
    String cinsiyet;
    int yas;
    String tcNo;


    public void uyu(){
        System.out.println(isim+" uyuyor");
    }

    public void oyunOyna(){
        System.out.println(isim+" oyun oynuyor");
    }

    public void tumBilgileriGetir(){
        System.out.println("isim: "+isim);
        System.out.println("yaş: "+yas);
        System.out.println("cinsiyet: "+cinsiyet);
        System.out.println("Kimlik numarası: "+tcNo);
    }
}
