
import java.util.Scanner;
public class Q_2 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];

        // Input
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + names[i]);

            System.out.print("Age: ");
            age[i] = sc.nextInt();

            System.out.print("Height: ");
            height[i] = sc.nextDouble();
        }

        // Find youngest and tallest
        int minAgeIndex = 0;
        int maxHeightIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (age[i] < age[minAgeIndex]) {
                minAgeIndex = i;
            }

            if (height[i] > height[maxHeightIndex]) {
                maxHeightIndex = i;
            }
        }

        // Output
        System.out.println("\nYoungest: " + names[minAgeIndex]);
        System.out.println("Tallest: " + names[maxHeightIndex]);

        sc.close();
    }
}
