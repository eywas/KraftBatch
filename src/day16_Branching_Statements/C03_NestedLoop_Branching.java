package day02_MyfirstProgram.src.day16_Branching_Statements;

public class C03_NestedLoop_Branching {
    public static void main(String[] args) {
       outerLoop: for (int i = 0; i < 3; i++) {
            System.out.println("A");
           innerLoop: for (int j = 0; j < 5; j++) {
              System.out.println("B");
               harun: for (int k = 0; k <10 ; k++) {

                   if (k==0){
                       continue outerLoop;
                   }
                   System.out.println("C");
               }
            }

        }

        //Banka menüsü oluşturun 1 para ekle 2 hesabımı gör 3 para çek 4 çıkış (money=2000)
        //   while işleme devam etmek için 1 e basın bir üst menü için 2 basın kart iade 3
    }
}
