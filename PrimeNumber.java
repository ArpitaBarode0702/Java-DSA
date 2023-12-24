import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int c = 2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();

        while (c < num) {
            if (num % c == 0) {
                System.out.println("Not prime");
                return; // Exit the program if the number is not prime
            }
            c = c + 1;
        }

        System.out.println(num + " is a prime number");
    }
}
