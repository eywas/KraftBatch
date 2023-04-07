package day02_MyfirstProgram.src.day25_Summary;

public class Methods {
    public static void main(String[] args) {
    int sayi1=5;
    int sayi2=10;
    //Toplamları max değerin 4 katı mı kontrol edin
        System.out.println(4 * max(sayi1, sayi2) == sum(sayi1, sayi2));






    }

    public static int max(int a, int b){
        if (a>b){
            return a;
        }return b;
    }

    public static int sum(int x, int y){
        return x+y;
    }

    public static String ucEkle(String str){
        return str+"3";
    }

}
