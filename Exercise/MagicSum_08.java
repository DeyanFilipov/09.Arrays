package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer :: parseInt).toArray();

        int sumNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numbers.length; i++) {
            int currentNum = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                int powerNumber = numbers[j];
                if (currentNum + powerNumber == sumNumber) {
                    System.out.printf("%d %d\n", currentNum, powerNumber);
                }

            }

        }
    }
}
