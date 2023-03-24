package day02_MyfirstProgram.src.day09_OperatorsCont;

import java.util.Scanner;

public class PhoneNumber {
    public static void main(String[] args) {
        /*
      1. create a class named Phone Number and declare the following variables:
      countryCode, areaCode, localNumber
      Ask user to enter each values.
      Use scanner class and get them one by one
      use string concatenation to display the phone number as
              ex:
                          countryCode = 90
                          areaCode = 532
                          localNumber = 1234500

                      output:
                              Your phone number is +(90)532-1234500

         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Country Code : ");
        int countryCode= scan.nextInt();

        System.out.println("Area Code : ");
        int areaCode= scan.nextInt();

        System.out.println("Local Number : ");
        int localNumber= scan.nextInt();

        System.out.println("Country Code = "+countryCode);
        System.out.println("Area Code = "+areaCode);
        System.out.println("Local Number = "+localNumber);




    }
}
