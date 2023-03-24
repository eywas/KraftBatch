package day02_MyfirstProgram.src.day10_UnaryLogicalOperAndReview;

public class C05_LogicalOperators {
    public static void main(String[] args) {
        String  name = "Ayşe";
        int age = 34;
        String citizen= "Turkey";

        // 18+, Turkish
        boolean isEligibleVote = age>=18 && citizen == "Turkey"; // Stringlerin eşitliğini = operatörü ile


        System.out.println(name+" is eligible to vote : "+isEligibleVote);


        System.out.println("----------------------------------");

        String name2 = "Ümit";
        int findexScore = 800;
        int age2 = 43;
        int income = 40000;

        boolean isEligibleForLoan = findexScore>=1500     &&    age2>=18           && income>=30000;

        System.out.println(name2+ " is eligible for loan: "+isEligibleForLoan);


        System.out.println("----------------------------------");

        String name3 = "Hatice";
        int age3 = 21;
        char gender = 'F'; //Female Male

        boolean isEligable = age3 >= 18 && (gender =='M' || gender =='F');

        System.out.println(name3+ " is eligable to be selected as MP : "+isEligable);

        System.out.println("----------------------------------");

        String student = "Ali";
        double gpa = 2.5;
        int familyIncome = 15000;

        boolean isEligibleForScholarship = gpa >= 3.5 || familyIncome <=20000;

        System.out.println(student+ "is eligible for scholarship : "+isEligibleForScholarship);


        System.out.println("----------------------------------");

        boolean result = true;
        System.out.println("result = " + result);

        boolean result1= !result;
        System.out.println("result1 = " + result1);

        System.out.println("----------------------------------");


        int score = 55;

        boolean passed = score>=60;//false
        boolean failed = !passed;//true
        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);



    }
}
