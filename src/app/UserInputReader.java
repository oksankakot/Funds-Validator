package app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputReader {
    private final Scanner scanner = new Scanner(System.in);

    public double readWithdrawalAmount() {
        double amount = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter a purchase amount, USD: ");

            try {
                amount = scanner.nextDouble();
                validInput = true;

            } catch (InputMismatchException e) {
                System.out.println("Error! Purchase amount should contain numbers only.");
                scanner.next();
            }
        }
        return amount;
    }
}
