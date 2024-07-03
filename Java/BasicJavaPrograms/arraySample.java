package BasicJavaPrograms;

import java.util.Scanner;

public class arraySample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Step 2: Create the array
        int array[] = new int[size];

        // Step 3: Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Step 4: Display the array elements
        System.out.println("The elements of the array are:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        // Close the scanner
        scanner.close();
    }
}
