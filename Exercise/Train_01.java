package Arrays.Exercise;

import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        int[] people = new int[input];
        int sum = 0;

        for (int i = 0; i < input; i++) {
            people[i] = Integer.parseInt(scanner.nextLine());
            sum += people[i];
        }

        for (int i = 0; i < people.length; i++) {
            System.out.print(people[i] + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}