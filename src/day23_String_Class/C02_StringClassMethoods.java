package day02_MyfirstProgram.src.day23_String_Class;

public class C02_StringClassMethoods {
    public static void main(String[] args) {
        //length
        String programmingLanguage = "java";  //String pool içerisinde bir obje oluşturdu
        System.out.println("programmingLanguage = " + programmingLanguage.length());
        System.out.println("-------------------------------------------------------");

        programmingLanguage = "python";  //String immutable (değiştirilemez) , java yı işaret ediyordu.
                                         //String pool içerisinde yeni bir obje oluşturdu ve o objenin içine python yazdı
        System.out.println("programmingLanguage.length() = " + programmingLanguage.length());
        System.out.println("-------------------------------------------------------");



        //toUpperCase(), toLowerCase()
        System.out.println("programmingLanguage.toUpperCase() = " + programmingLanguage.toUpperCase());
        System.out.println("programmingLanguage = " + programmingLanguage);

        programmingLanguage = programmingLanguage.toUpperCase();
        System.out.println("programmingLanguage = " + programmingLanguage);

        System.out.println("programmingLanguage.toLowerCase() = " + programmingLanguage.toLowerCase());
        System.out.println("programmingLanguage = " + programmingLanguage);
        System.out.println("-------------------------------------------------------");


        //charAt()  //programmingLanguage=PYTHON
        System.out.println("programmingLanguage.charAt(0) = " + programmingLanguage.charAt(0));
        System.out.println("programmingLanguage.charAt(5) = " + programmingLanguage.charAt(5));
        System.out.println("programmingLanguage.length() = " + programmingLanguage.length());
        System.out.println("programmingLanguage.charAt(programmingLanguage.length()-1) = "
                + programmingLanguage.charAt(programmingLanguage.length() - 1));
        System.out.println("programmingLanguage.charAt(2) = " + programmingLanguage.charAt(2));//T yazar
        System.out.println("programmingLanguage.charAt(programmingLanguage.length()-4) = "
                + programmingLanguage.charAt(programmingLanguage.length() - 4));
        // programmingLanguage.charAt(programmingLanguage.length()-7); // hata verir çünkü -1. karakter yok
        System.out.println("-------------------------------------------------------");

        //concat()
        System.out.println("programmingLanguage = " + programmingLanguage);
        System.out.println("programmingLanguage.concat(\" Programlama Dili Java'dan daha kolaydır.\") = "
                + programmingLanguage.concat(" Programlama Dili Java'dan daha kolaydır."));
        programmingLanguage=programmingLanguage.concat(" Programlama Dili Java'dan daha kolaydır.");
        System.out.println("-------------------------------------------------------");

        //contains()
        System.out.println(programmingLanguage);
        System.out.println("programmingLanguage.contains(\"Dili\") = " + programmingLanguage.contains("Dili"));
        System.out.println("programmingLanguage.contains(\"python\") = " + programmingLanguage.contains("python"));
        System.out.println("programmingLanguage.contains(\"P\") = " + programmingLanguage.contains("P"));
        System.out.println("programmingLanguage.contains(\"W\") = " + programmingLanguage.contains("W"));
        System.out.println("-------------------------------------------------------");

        //trim()
        String s="   Hello   World      ";
        System.out.println(s);
        System.out.println(s.trim());
        System.out.println(s);
        String trimedS= s.trim();
        System.out.println(trimedS);
        System.out.println("-------------------------------------------------------");

        //replace()

        System.out.println("s.replace(\"Hello\",\"Big Big\") = " + s.replace("Hello", "Big Big"));
        System.out.println("trimedS.replace(\"Hello\", \"Developer\") = " + trimedS.replace("Hello", "Developer"));
        System.out.println("trimedS.replace(\"Hel\", \"\") = " + trimedS.replace("Hel", ""));
        System.out.println("-------------------------------------------------------");

        //indexOf()
        System.out.println(trimedS);
        System.out.println("trimedS.indexOf(\"H\") = " + trimedS.indexOf("H"));
        System.out.println("trimedS.indexOf(\"Hell\") = " + trimedS.indexOf("Hell"));
        System.out.println("trimedS.indexOf(\"World\") = " + trimedS.indexOf("World"));


    }
}
