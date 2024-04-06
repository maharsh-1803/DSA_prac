import java.util.Scanner;

public class armStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int power = findDigit(n);
        int sum = 0;
        int temp = n;

        while(temp > 0) {
            int rem = temp % 10;
            sum += Math.pow(rem, power);
            temp /= 10;
        }

        if (sum == n) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    public static int findDigit(int n) {
        int count = 0;
        while(n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

}
