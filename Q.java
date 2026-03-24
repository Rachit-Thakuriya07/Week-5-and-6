import java.util.Scanner;

public class Q {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Step 2: Handle 0 case
        int temp = num;
        int count = 0;

        if (num == 0) {
            count = 1;
        } else {
            while (temp != 0) {
                count++;
                temp = temp / 10;
            }
        }

        // Step 3: Store digits in array
        int[] digits = new int[count];
        temp = num;

        if (num == 0) {
            digits[0] = 0;
        } else {
            for (int i = count - 1; i >= 0; i--) {
                digits[i] = temp % 10;
                temp = temp / 10;
            }
        }

        // Step 4: Frequency array (0–9)
        int[] freq = new int[10];

        for (int i = 0; i < count; i++) {
            freq[digits[i]]++;
        }

        // Step 5: Display frequency
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " times");
            }
        }

        sc.close();
    }

}
