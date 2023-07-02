import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int fist=0;
        int second=1;
        
        // System.out.println("Fibonacci series up to " + n + " terms:");
        // System.out.print(fist + " " + second+ " ");
        
        for(int i=3; i<=n; i++){
            int fibnacciSeries=fist+second;
            System.out.println(fibnacciSeries+" ");
            fist=second;
            second=fibnacciSeries;
        }
    }
}
