package com.MINIPROJECT;

import java.util.Scanner;

public class ScientificCalculator {

    public static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        long fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nScientific Calculator");
            System.out.println("1. Square root (√x)");
            System.out.println("2. Factorial (x!)");
            System.out.println("3. Natural Logarithm (ln(x))");
            System.out.println("4. Power function (x^y)");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    double num1 = scanner.nextDouble();
                    System.out.println("√" + num1 + " = " + Math.sqrt(num1));
                    break;

                case 2:
                    System.out.print("Enter an integer: ");
                    int num2 = scanner.nextInt();
                    System.out.println(num2 + "! = " + factorial(num2));
                    break;

                case 3:
                    System.out.print("Enter a number: ");
                    double num3 = scanner.nextDouble();
                    if (num3 <= 0) {
                        System.out.println("ln(x) is only defined for x > 0.");
                    } else {
                        System.out.println("ln(" + num3 + ") = " + Math.log(num3));
                    }
                    break;

                case 4:
                    System.out.print("Enter base (x): ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter exponent (y): ");
                    double exp = scanner.nextDouble();
                    System.out.println(base + "^" + exp + " = " + Math.pow(base, exp));
                    break;

                case 5:
                    System.out.println("Exiting... Thank you!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        }
    }
}
