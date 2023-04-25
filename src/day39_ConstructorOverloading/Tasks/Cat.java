package day02_MyfirstProgram.src.day39_ConstructorOverloading.Tasks;

public class Cat {
    public String name;
    public String eyeColor;
    public char breed;
    public boolean isFat;
    public boolean isPet;


    public Cat(String name, String eyeColor, char breed, boolean isFat, boolean isPet){
        this.name=name;
        this.eyeColor=eyeColor;
        this.breed=breed;
        this.isFat=isFat;
        this.isPet=isPet;

    }
    public String sleep(){

        return name+" uyuyor.";
    }
    public String food(){
        if (isFat){
            return name+" rejimde.";
        }
        return name+" mama yiyor.";
}
    public String run(){

        return name+" koşuyor.";
    }

}
