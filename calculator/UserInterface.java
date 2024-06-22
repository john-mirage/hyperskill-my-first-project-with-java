package calculator;

import java.util.Scanner;

public class UserInterface {
    private static final Scanner scanner = new Scanner(System.in);

    public static int askForExpenses(String message) {
        while (true) {
            System.out.println(message);
            try {
                int expenses = scanner.nextInt();
                if (expenses > 0) {
                    return expenses;
                } else {
                    System.out.println("Error! Expenses must be a positive number");
                }
            } catch (Exception e) {
                System.out.println("Error! Expenses must be a number!");
            }
        }
    }
}
