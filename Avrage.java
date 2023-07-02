import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        System.out.println("Enter numbers :");

        int i;
        do {
            i= scanner.nextInt();
            if (i != -1) {
                sum += i;
                count++;
            }
        } while (i != -1);

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average: " + average);
        } else {
            System.out.println("No numbers entered.");
        }
    }
}
