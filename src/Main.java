import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i <= 9; i++) {
            int number = 1 + rand.nextInt(50);
            numbers.add(number);
        }

        System.out.println("ArrayList: " + numbers);
        Scanner sc = new Scanner(System.in);
        System.out.print("Value to find: ");
        int value = sc.nextInt();
        System.out.println();

        int count = 0;
        for (int i = 0; i <= 9; i++) {
            if (numbers.get(i) == value) {
                count += 1;
            }
        }

        if (numbers.contains(value)) {
            System.out.println(value + " was found " + count + " times.");
        }
        else {
            System.out.println(value + " was not found.");
        }
    }
}
