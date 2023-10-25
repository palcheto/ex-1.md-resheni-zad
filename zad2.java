package demo;

import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];
        System.out.println("Въведете 10 числа:");

        for (int i = 0; i < array.length; i++) {
            System.out.print("Число " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        System.out.print("Масив след обръщане: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i < array.length - 1 ? ", " : ""));
        }
        System.out.println("]");

        scanner.close();
    }
}