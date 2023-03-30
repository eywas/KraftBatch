package day02_MyfirstProgram.src.day21_Class_And_Object;

public class C06_Car {

    String marka;
    int modelYil;
    int beygir;
    String saseNo;
    boolean isSUV;
    boolean isManual;

    public void hizlan(){
        System.out.println("Araç hızlanıyor");
    }
    public String beygirKarsilastir(){
        if(beygir>100){
            return "Güçlü araç";
        }
        return "Zayıf araç";
    }
}
