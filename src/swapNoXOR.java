import java.util.Scanner;

public class swapNoXOR {
    public static void main(String[] args) {
        System.out.println("Enter the value of a and b:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=sc.nextInt();
        System.out.println("a:"+a + "b:"+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a:"+a + "b:"+b);
    }

}
