import java.util.Scanner;

class Assignment1Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Units consumed: ");
        int units = sc.nextInt();

        if (units < 0) {
            System.out.println("Invalid units");
        } else {
            double energyCharge = 0;

            if (units <= 100) {
                energyCharge = units * 1.50;
            } else if (units <= 200) {
                energyCharge = (100 * 1.50)
                        + ((units - 100) * 2.50);
            } else if (units <= 500) {
                energyCharge = (100 * 1.50)
                        + (100 * 2.50)
                        + ((units - 200) * 4.00);
            } else {
                energyCharge = (100 * 1.50)
                        + (100 * 2.50)
                        + (300 * 4.00)
                        + ((units - 500) * 6.00);
            }

            double fixedCharge = 75;
            double subtotal = energyCharge + fixedCharge;
            double surcharge = 0;

            if (subtotal > 1500) {
                surcharge = subtotal * 5 / 100;
            }

            double finalBill = subtotal + surcharge;

            System.out.printf("Energy charge: Rs. %.2f%n", energyCharge);
            System.out.printf("Fixed charge: Rs. %.2f%n", fixedCharge);
            System.out.printf("Surcharge: Rs. %.2f%n", surcharge);
            System.out.printf("Final bill: Rs. %.2f%n", finalBill);
        }
		
    }
}