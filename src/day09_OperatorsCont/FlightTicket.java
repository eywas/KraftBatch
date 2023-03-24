package day02_MyfirstProgram.src.day09_OperatorsCont;

import java.util.Scanner;

public class FlightTicket {
    public static void main(String[] args) {
        /*
      create a class named FlightTicket, and declare the following
      variables:
              1. from
              2. to
              3. ticketPrice
          use concatenation to display the full info of the ticket

              ex:
                  From Ankara to Istanbul is 599TL
       */
        Scanner scan = new Scanner(System.in);
        System.out.print("From : ");
        String f = scan.nextLine();

        System.out.print("To : ");
        String t = scan.nextLine();


        int ticketPrice = 599;
        System.out.println("From "+f+" to "+t+" is "+ticketPrice+"TL");


    }
}
