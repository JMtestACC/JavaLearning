import java.util.Scanner;

public class MathBasics {
    public static void main(String[] args) {

        int userValue;

        Scanner sc = new Scanner(System.in);
        System.out.println("Provide your lucky number: ");
        userValue = sc.nextInt();
        System.out.println("Check basic math operations on your example numbers.");
        System.out.println("Provide number a: ");
        int a = sc.nextInt();
        System.out.println("a = " + a);
        System.out.println("Provide number b: ");
        int b = sc.nextInt();
        System.out.println("b = " + b);
        int c;
        c = a + b;
        System.out.println("a + b = " + c);
        c = a - b;
        System.out.println("a - b = " + c);
        c = a * b;
        System.out.println("a * b = " + c);
        c = a / b;
        System.out.println("a / b = " + c);
        c = a % b;
        System.out.println("a % b = " + c);

        System.out.println("Incrementing lucky number by 1");
        userValue++;
        System.out.println(userValue);
        System.out.println("Lets decrement this number to get lucky number again");
        userValue--;
        System.out.println(userValue);

    }
}
