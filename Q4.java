import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] arr = new double[10]; // Array of size 10
        double total = 0.0;
        int index = 0;

        // Infinite loop for input
        while (true) {
            System.out.print("Enter a number: ");
            double num = sc.nextDouble();

            // Stop conditions
            if (num <= 0) {
                break;
            }

            if (index == 10) {
                break;
            }

            // Store value
            arr[index] = num;
            index++;
        }

        // Display numbers and calculate sum
        System.out.println("\nEntered Numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println(arr[i]);
            total += arr[i];
        }

        // Display total
        System.out.println("\nTotal sum = " + total);

        sc.close();
    }
}