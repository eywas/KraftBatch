package day02_MyfirstProgram.src.day31_Arrays_1;

public class C03_Array_02 {
    public static void main(String[] args) {
        int array[]=new int[5];
        array[0]=105;
        array[1]=89;
        array[2]=63;
        array[3]=56;
        array[4]=107;
        System.out.println("array.length = " + array.length);
        System.out.println("---------------------------------------------");
      for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("---------------------------------------------");

        for (int x:array) {  //Bunun anlamı her döngüde x e atama yapıyor
            // x= array[0] 1. döngü
            // x= array[1] 2. döngü
            // x= array[2] 3. döngü
            // x= array[3] 4. döngü
            // x= array[4] 5. döngü

        }


        for (int x:array){
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("---------------------------------------------");

        int ciftSayi =0; //array içindeki tüm çift sayılar
        for (int x:array){
           if (x%2==0){
               ciftSayi++;
           }
        }
        System.out.println("ciftSayi = " + ciftSayi);
        System.out.println("---------------------------------------------");

        int tekSayi =0;  //array içindeki tüm tek sayılar
        for (int x:array){
            if (x%2==1){
                tekSayi++;
            }
        }
        System.out.println("tekSayi = " + tekSayi);
        System.out.println("---------------------------------------------");
        int result=0;
        for (int i = 0; i <array.length ; i++) {
            result+=array[i];

        }
        System.out.println("for loop toplam = " + result);
        System.out.println("---------------------------------------------");
        result=0;
        for (int x:array){
            result+=x;
            System.out.println("for each loop toplam = " + result);
        }


    }
    public static String[] arrrayMethot(){
        String [] array={"harun","mehmet"};
        return array;
    }
    public static String arrrayMethot2(String[] arr){

        return arr[0];
    }


}
