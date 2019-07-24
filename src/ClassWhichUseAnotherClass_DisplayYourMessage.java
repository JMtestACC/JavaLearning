import java.util.Scanner;

public class ClassWhichUseAnotherClass_DisplayYourMessage {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        DisplayYourMessage message = new DisplayYourMessage();
        message.displayMessage();

        System.out.println("Enter your name: ");
        String name = scanner.next();
        System.out.println("What's your age?");
        Integer age = scanner.nextInt();

        message.enterName(name, age);

    }
}