package demo;

import java.util.Scanner;

public class zad4 {
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете число: ");
        int numToCheck = scanner.nextInt();

        System.out.println(numToCheck + (isPrime(numToCheck) ? " е просто число." : " не е просто число."));

    }
}