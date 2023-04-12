package day02_MyfirstProgram.src.day31_Arrays_1;

public class C02_Array_01 {
    public static void main(String[] args) {
       // String x="Harun";


        String[]y= new String[6];// Kapasiteyi ilk başta belirlemeliyiz.
        int z[]=new int[5]; // Eğer tanımlamada sınırı aşarsak yani z[5]=107; yaparsak hata verir
       z[0]=105;
       z[1]=89;
       z[2]=63;
       z[3]=56;
       z[4]=107;
       // System.out.println(z[0]);// Atama yapılmazsa [I@4dd8dc3 adresi yazdırır.
        System.out.println("-----------------------------------------------------------------------");
        String isim[]=new String[3];
        isim[0]="Ali";
        isim[1]="Veli";
        isim[2]="Selami";
        System.out.println(isim[1]); // Veli yazar.
        String str2[]={"Ali","Veli"}; //Süslü parantez ile
        // str2[0]="Ali";  str2[1]="Veli"; atamaları arka planda otomatik olarak yapılır.

        System.out.println("-----------------------------------------------------------------------");

int [] sayi={5,6}; // bu şekilde yaparsak bir alt satırda yapamıyoruz alt satıra sayi={5,6}; yazamıyoruz.
int toplam=sayi[0]+sayi[1];
        System.out.println(toplam);


    }

}
