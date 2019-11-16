package Opg7_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] line = new int[11];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number from 1 to 50 you want to compare ten random numbers with: ");
        line[10] = input.nextInt();
        for (int i = 0; i < 11; i++) {
            line[i] = (int)(Math.random()*50);
            if (line[i] > line[10]) {
                System.out.println("random number " + i + " = " + line[i] + " and is greater than the number you entered");
            } else if (line[i] == line[10]) {
                System.out.println("random number " + i + " = " + line[i] + " and is equal to the number you have entered" );
            } else {
                System.out.println("random number " + i + " = " + line[i] + " and is smaller than the number you have entered");
            }
        }
    }
}
