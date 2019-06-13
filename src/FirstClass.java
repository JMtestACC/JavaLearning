import java.util.Scanner;

public class FirstClass {
    public static void main(String[] args) {

        int userValue;
        String user;

        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide your lucky number: ");
        userValue = sc.nextInt();
        System.out.println("Great! Your lucky number is: " + userValue + "\n");

        System.out.println("What is your name?");
        user = sc.next();
        System.out.println("Hello " + user);

    }
}
