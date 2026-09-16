import java.util.Scanner;

class Assignment2Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Age: ");
        int age = sc.nextInt();

        System.out.print("Monthly income: ");
        double income = sc.nextDouble();

        System.out.print("Credit score: ");
        int creditScore = sc.nextInt();

        System.out.print("Existing EMI: ");
        double existingEmi = sc.nextDouble();

        System.out.print("Proposed EMI: ");
        double proposedEmi = sc.nextDouble();

        if (income < 0 || existingEmi < 0 || proposedEmi < 0) {
            System.out.println("Invalid input");
        } else {

            double totalEmi = existingEmi + proposedEmi;
            double emiPercentage = (totalEmi / income) * 100;

            System.out.printf("Combined EMI percentage: %.2f%%%n",
                    emiPercentage);

            if (age < 21 || age > 60) {
                System.out.println("Loan status: Not Eligible");
                System.out.println("Age must be between 21 and 60");
            } else if (income < 25000) {
                System.out.println("Loan status: Not Eligible");
                System.out.println("Income must be at least Rs. 25000");
            } else if (creditScore < 650) {
                System.out.println("Loan status: Not Eligible");
                System.out.println("Credit score must be at least 650");
            } else if (totalEmi > income * 40 / 100) {
                System.out.println("Loan status: Not Eligible");
                System.out.println("EMI should not exceed 40% of income");
            } else {
                System.out.println("Loan status: Eligible");

                if (creditScore >= 750) {
                    System.out.println(
                            "Applicable annual interest rate: 8.5%");
                } else if (creditScore >= 700) {
                    System.out.println(
                            "Applicable annual interest rate: 10.0%");
                } else {
                    System.out.println(
                            "Applicable annual interest rate: 12.0%");
                }
            }
        }

    }
}