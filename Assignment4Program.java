import java.util.Scanner;
class Assignment4Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Starting number: ");
        int start = sc.nextInt();

        System.out.print("Ending number: ");
        int end = sc.nextInt();

        int count = 0;

        System.out.print("Armstrong numbers: ");

        for (int num = start; num <= end; num++) {

            int temp = num;
            int digits = 0;

            while (temp > 0) {
                digits++;
                temp = temp / 10;
            }

            temp = num;
            int sum = 0;

            while (temp > 0) {
                int digit = temp % 10;

                int power = 1;

                for (int i = 1; i <= digits; i++) {
                    power = power * digit;
                }

                sum = sum + power;
                temp = temp / 10;
            }

            if (sum == num) {
                System.out.print(num + " ");
                count++;
            }
        }

        System.out.println();
        System.out.println("Number of Armstrong numbers: " + count);

    }
}