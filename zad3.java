package demo;

import java.util.Arrays;
import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете броя на елементите в масива: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Въведете елементите на масива:");
        for (int i = 0; i < n; i++) {
            System.out.print("Елемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);

        System.out.println("Макс: " + array[n - 1] + ", Мин: " + array[0]);

        scanner.close();
    }
}