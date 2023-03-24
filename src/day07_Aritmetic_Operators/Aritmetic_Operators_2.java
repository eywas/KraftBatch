package day02_MyfirstProgram.src.day07_Aritmetic_Operators;

public class Aritmetic_Operators_2 {
    public static void main(String[] args) {
        /*int x=4;
        int y=10;
        double z= (double) x/y;//değişkenlerden en az birini double olarak tanımlamazsak sonuç doğru çıkmaz
        System.out.print(z);


        int dogumYil=1980;
        int yas=2023-dogumYil;
        System.out.print("yas : " + yas);


        double PI=Math.PI;
        System.out.println(Math.sqrt(49));
        double PI=3.14;
        double r=2;
        double alan=PI*r*r;
        double alan2=Math.PI*Math.pow(r,2);
        System.out.println("alan: "+alan);
        System.out.println("alan2: "+alan2);



        double f=300;
        double c=(f-32)/1.8;
        System.out.println(f+" fahrenheit "+c+" celciustur");*/



        //Ali fizik dersinden 92,
// kimya dersinden 55,
// matematik dersinden 89 almıştır.
//1.Ali’nin not ortalaması kaçtır?

       /* double f=92;
        double k=55;
        double m=89;
        double o=(f+k+m)/3;
        System.out.println("ortalama = " + o);
        boolean isPas=o>80; //Buradaki > ifadesi ortalama 80 den büyük mü anlamına geliyor
        System.out.println("Ali sınıfı geçti mi: "+isPas);
        //Ortalama sınıf geçme notu 80 üzeri olduğuna göre
        //Ali sınıfı geçti ise ekrana true geçmedi ise false yazdırın

        */

        /*Örnek
: Toplantı salonunda 15 adet sıra ve her sırada 12 adet koltuk
vardır. Toplantıya 113 katılmıştır.
1.Toplantı salonun toplam kapasitesi nedir?
2.Kaç adet boş koltuk vardır
3.Kaç adet sırada oturulmaktadır ?
4. Kaç sıra tamamen boş kalmıştır.
5.Oturulan sıralarda kaç adet boş koltuk vardır?*/

        int siraSayisi=15;
        int siraKoltukSayisi=12;
        int kisiSayisi=113;
        //1.Toplantı salonun toplam kapasitesi nedir?
        int kapasite=siraSayisi*siraKoltukSayisi;
        //2.Kaç adet boş koltuk vardır
        int bosKoltuk=kapasite-kisiSayisi;
        //3.Kaç adet sırada oturulmaktadır ?
        int oturulanSira=kisiSayisi/siraKoltukSayisi+1;
        //4. Kaç sıra tamamen boş kalmıştır.
        int bosSira=siraSayisi-oturulanSira;
        //5.Oturulan sıralarda kaç adet boş koltuk vardır?
        int oturulanSiradakiBosKoltukSayisi=siraKoltukSayisi-(kisiSayisi%siraKoltukSayisi);
        System.out.println("kapasite = " + kapasite);
        System.out.println("bosKoltuk = " + bosKoltuk);
        System.out.println("bosSira = " + bosSira);
        System.out.println("oturulanSira = " + oturulanSira);
        System.out.println("oturulanSiradakiBosKoltukSayisi = " + oturulanSiradakiBosKoltukSayisi);




    }
}
