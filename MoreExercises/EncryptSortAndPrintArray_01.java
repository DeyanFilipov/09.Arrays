package Arrays.MoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arrLength = Integer.parseInt(scanner.nextLine());
        String vowels = "aeiouAEIOU";

        String[] sequenceOfStings = new String[arrLength];
        int[] valueOfString = new int[arrLength];

        for (int i = 0; i < sequenceOfStings.length; i++) {
            sequenceOfStings[i] = scanner.nextLine();

            int sumVowels = 0;
            int sumCons = 0;
            char[] charArr = sequenceOfStings[i].toCharArray();
            for (char index : charArr) {
                if (index == 'a' || index == 'e' || index == 'i' || index == 'o' || index == 'u' ||
                        index == 'A' || index == 'E' || index == 'I' || index == 'O' || index == 'U') {
                    sumVowels += ((int) index * sequenceOfStings[i].length());
                } else {
                    sumCons += ((int) index / sequenceOfStings[i].length());
                }
            }
            int stringNum = sumVowels + sumCons;
            valueOfString[i] = stringNum;
        }
        Arrays.sort(valueOfString);
        for (int value : valueOfString) {
            System.out.println(value);
        }
    }
}