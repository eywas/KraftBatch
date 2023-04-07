package day02_MyfirstProgram.src.day30_Review;

public class C06_Hastane {
    public static void main(String[] args) {
        Doctor hekim1=new Doctor();  //instance değişkenler ancak obje oluşturularak erişilebilir.
        System.out.println(hekim1.cinsiyet);
        System.out.println(hekim1.isim);
        System.out.println(hekim1.yas);
        System.out.println(hekim1.uzmanMi);
        System.out.println("------------------------------");
        hekim1.isim="Kaan";
        hekim1.soyIsim="Sarp";
        hekim1.uzmanMi=true;
        hekim1.yas=32;
        System.out.println(hekim1.isim);
        System.out.println(hekim1.yas);
        System.out.println(hekim1.uzmanMi);

        System.out.println(Doctor.fakulte); //static değişkene class ismi ile erişilebilir.


        System.out.println(hekim1);  // class ın referans adresini yazar.

        Doctor hekim2=new Doctor();
        hekim2.isim="Buket";

    }
}
