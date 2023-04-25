package day02_MyfirstProgram.src.day40_Encapsulation;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
       if (age<0||age>150){
           System.err.println("Invalid Age = "+age);
           System.exit(0);// bu şekilde hatalı girişte çıkış yap diyoruz direkt classtan çıkar
                                // return yazarsak sadece metoddan çıkar
       }
        this.age = age;
    }

}
