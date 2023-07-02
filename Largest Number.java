import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        int largest;

        if (number1 >= number2) {
            if (number1 >= number3) {
                largest = number1;
            } else {
                largest = number3;
            }
        } else {
            if (number2 >= number3) {
                largest = number2;
            } else {
                largest = number3;
            }
        }

        System.out.println("The largest number is: " + largest);
    }
}
