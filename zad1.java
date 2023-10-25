package demo;

import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Число " + i + ": ");
            int num = scanner.nextInt();
            sum += num;

            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        scanner.close();

        System.out.println("Сума: " + sum + ", Четни: " + evenSum + ", Нечетни: " + oddSum);
    }
}
