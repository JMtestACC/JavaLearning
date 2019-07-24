import java.util.Scanner;

public class DisplayYourMessage {

    Scanner scanner = new Scanner(System.in);

    public void displayMessage() {

        System.out.println("What message do You want to sent?");
        String msg = scanner.next();

        System.out.println(msg);

    }

    public void enterName(String name, Integer age) {

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " old!");


    }
}
