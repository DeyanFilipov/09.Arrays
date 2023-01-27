package Arrays.Exercise;

import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int[] firstArr = new int[num];
        int[] secondArr = new int[num];

        for (int i = 0; i < num; i++) {
            String[] currentNum = scanner.nextLine().split(" ");
            if (i % 2 == 0) {
                firstArr[i] = Integer.parseInt(currentNum[0]);
                secondArr[i] = Integer.parseInt(currentNum[1]);
            } else {
                firstArr[i] = Integer.parseInt(currentNum[1]);
                secondArr[i] = Integer.parseInt(currentNum[0]);
            }
        }
        printArrs(firstArr, secondArr);
    }
    public static void  printArrs(int[] first, int[] second) {

        for (int i = 0; i < first.length; i++) {
            System.out.print(first[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < second.length; i++) {
            System.out.print(second[i] + " ");

        }
    }
}