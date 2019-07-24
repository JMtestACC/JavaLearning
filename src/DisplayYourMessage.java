import java.util.Scanner;

public class DisplayYourMessage {

    Scanner scanner = new Scanner(System.in);

    public void displayMessage() {

        System.out.println("What message do You want to sent?");
        String msg = scanner.next();

        System.out.println(msg);

    }

    public void enterNamAndAge(String name, Integer age) {

        System.out.println("Hello " + name);
        if(age < 18) {
            System.out.println("Age: " +age + " - You are underage");
        } else if (age >= 18 && age <= 120) {
            System.out.println("Age: " + age + " - You are adult person");
        } else if (age > 120) {
            System.out.println("Age: " + age + " - No f**king way");
        } else {
            System.out.println("Wrong value. Run program once again and provide correct age");
        }

    }
}
