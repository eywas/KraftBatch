package day02_MyfirstProgram.src.day39_ConstructorOverloading.Tasks;

public class Pencil {
    String color;
    double length;
    boolean haveErasier;
    boolean uc;

    public Pencil(){
    }
    public Pencil(String color, double length, boolean haveErasier, boolean uc){

        this.color=color;
        this.length=length;
        this.haveErasier=haveErasier;
        this.uc=uc;

    }
    public String write(){
        if (uc){
            return "Yazabilirsin";
        }
        return "Yazamazsın";
    }
    public String delete(){
        if (haveErasier){
            return "Silebilirsin";
        }
        return "Silemezsin";

    }
}
