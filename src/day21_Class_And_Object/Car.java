package day02_MyfirstProgram.src.day21_Class_And_Object;

public class Car {

    String marka;
    int modelYil;
    int beygir;
    String saseNo;
    boolean isSuv;
    boolean isManual;


    public void  hizlan(){
        System.out.println("Araç hızlanıyor");
    }
    public String begirKarsilastir(){
        if(beygir>100){
            return "Güçlü Araç";
        }
        return "Zayif araç";
    }




}
