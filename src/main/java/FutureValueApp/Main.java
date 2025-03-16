package FutureValueApp;
import java.util.Scanner;
import java.text.NumberFormat;
/*
Naam : S. Kiers
Datum : 16-03-'25

Dit programma berekent de waarde van een investering over het verloop van aantal jaar op basis van de intrestrate

 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the future value calculator.\n");

        Scanner scanner = new Scanner(System.in);
        String choice = "y";

        while (choice.equals("y")){
            System.out.println("Enter monthly investement : ");
            String input = scanner.nextLine();
            double monthlyInvestment = Double.parseDouble(input);

            System.out.println("Enter yearly interest rate : ");
            input = scanner.nextLine();
            double interestRate = Double.parseDouble(input);

            System.out.println("Enter number of years : ");
            input = scanner.nextLine();
            int years = Integer.parseInt(input);

            // method to calculate the future value :
            double futureValue = calculateFutureValue(monthlyInvestment, interestRate, years);

            // format and display results :
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            System.out.println("Future value : " + currency.format(futureValue));
            System.out.println();

            // see if the user wants to continue :
            System.out.println("Would you like to add another investment? (Enter Y/N) ");
            input = scanner.nextLine();
            while (choice.equalsIgnoreCase("y")) {
                System.out.println("Thank you for using the Future Value Calculator. ");
                break;
            }
            scanner.close();
        }
    }
    public static double calculateFutureValue(double monthlyInvestment, double interestRate, int years){
        // convert yearly into monthly!
        double monthlyInterestRate = interestRate / 12 / 100;
        int months = years * 12;

        double futureValue = 0.0;
        for (int i = 1; i <= months; i++){
            futureValue = (futureValue + monthlyInvestment) * (1 + monthlyInterestRate);
        }
        return futureValue;
    }
}
