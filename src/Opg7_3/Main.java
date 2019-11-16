package Opg7_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] numbers = createArray();
        System.out.println("The entered numbers are: ");
        displayArray(numbers);
        int [] counts = countInts(numbers);
        System.out.println();
        System.out.println("The occurence of each number are: ");
        displayCounts(counts);


    }
    public static int[] createArray() {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[8];
        System.out.print("Enter 8 integers between 1-50, the numbers are allowed to be the same: ");
        for (int i = 0; i < 8; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.println();
        return numbers;
    }
    public static void displayArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
    public static int[] countInts(int[] numbers) {
        int[] counts = new int[50];
        for (int i = 0; i < numbers.length; i++) {
            counts[numbers[i]]++;
        }
        return counts;
    }
    public static void displayCounts(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0){
                if (counts[i] == 1) {
                    System.out.println(i + " is present " + counts[i] + "time");
                }
                else {
                    System.out.println(i + " is present " + counts[i] + "times");
                }

            }
        }
    }

}
