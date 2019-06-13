import java.util.Scanner;

public class DisplayYourMessage {
    public void displayMessage() {

        System.out.println("What message do You want to sent?");
        Scanner messageToDisplay = new Scanner(System.in);
        String msg = messageToDisplay.next();

        System.out.println(msg);

    }
}
