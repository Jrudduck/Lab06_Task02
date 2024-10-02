import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Variables
        double gasTank = 0;
        double fuelEfficiency = 0;
        double gasPrice = 0;
        double costHundred = 0;
        double distancePossible = 0;
        boolean gasValid = false;
        boolean fuelValid = false;
        boolean priceValid = false;

        //input
        System.out.println("Enter the amount of gallons of gas in your tank.");
        do {
            if (scan.hasNextDouble()) {
                gasTank = scan.nextDouble();
                if (gasTank >= 0) {
                    gasValid = true;
                }
                else {
                    System.out.println("You have inputted an invalid value. Please try again.");
                }
            }
            else {
                System.out.println("Please enter a valid amount of gallons of gas in your tank.");
                scan.nextLine();
            }
        } while (!gasValid);
        System.out.println("Enter the fuel efficiency in miles/gallon.");
        do {
            if (scan.hasNextDouble()) {
                fuelEfficiency = scan.nextDouble();
                if (fuelEfficiency > 0) {
                    fuelValid = true;
                }
                else {
                    System.out.println("You have inputted an invalid value. Please try again.");
                }
            }
            else {
                System.out.println("Please enter a valid fuel efficiency in miles/gallon.");
                scan.nextLine();
                scan.nextLine();
            }
        } while (!fuelValid);
        System.out.println("Please enter the price of gas per gallon.");
        do {
            if (scan.hasNextDouble()) {
                gasPrice = scan.nextDouble();
                if (gasPrice > 0) {
                    priceValid = true;
                }
                else {
                    System.out.println("You have inputted an invalid value. Please try again.");
                }
            }
            else {
                System.out.println("Please enter a valid price of gas per gallon.");
                scan.nextLine();
                scan.nextLine();
            }
        } while (!priceValid);

        //process
        costHundred = (gasPrice/fuelEfficiency*100);
        distancePossible = gasTank * fuelEfficiency;
        System.out.printf("%5s %10.2f %5s %10.2f", "Cost per 100 miles:", costHundred, "\nDistance possible with current gas in tank:", distancePossible);
    }
}