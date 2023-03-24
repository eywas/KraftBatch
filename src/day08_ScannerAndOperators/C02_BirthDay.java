package day02_MyfirstProgram.src.day08_ScannerAndOperators;

public class C02_BirthDay {
    public static void main(String[] args) {

        //Create a class named BirthDay and create the following variable
        //             name, birthDay(int), birthMonth(String), birthYear(int)
        //
        //             use concatenation to display the birthday of the person


        String  name = "John";
        int bithDay = 23;
        String monthOfBirth = "April";
        int birthYear = 1990;

        //John was born on April/23/1990
        System.out.println(name+ " was born on "+ monthOfBirth+"/"+bithDay+"/"+birthYear);


        //John was born on "April\23\1990"
        System.out.println(name+ " was born on "+"\""+ monthOfBirth+"\\"+bithDay+"\\"+birthYear+"\"");



    }
}
