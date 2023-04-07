package day02_MyfirstProgram.src.day30_Review;

public class C01_DigitsLettersSpecialChars {
    public static void main(String[] args) {
      char ch='A'; // ASCII kodlarında A=65
      int num='Z';
      int num2='a';
seperateCharacters("ABCDExyz1234567890) (*&^%$#@!");

    }
    public static void seperateCharacters(String str){
        String letters ="";
        String digits ="";
        String specialChars ="";

        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i); //str nin her bir karakterini kontrole sokmuş oluyoruz
            if (ch>='A' && ch<='Z'){ // bu ifade ch nin A dan Z ye kadar olup olmadığını kontrol eder
                letters+=ch;
            } else if (ch>='a' && ch<='z') {
                letters+=ch;
            }else if (ch>='0' && ch<='9') {
                digits+=ch;
            }else{
                if (ch!=' '){
                    specialChars+=ch;
                }
            }
        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);
    }


}

/*Create a method that takes a String and returns 3 different String of Letters, digits and special chars
  of that string. space is not considered as a special char "ABCDExyz1234567890) (*&^%$#@!"*/
