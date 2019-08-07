import java.util.Random;
import java.util.Scanner;

public class RollingDice {
    public static void main(String[] args) {

        Scanner rollNumber = new Scanner(System.in);
        System.out.println("How many times You want to roll?");
        int numberOfRolls = rollNumber.nextInt();
        int numValue;

        Random dice = new Random();

        for(int i = 0; i < numberOfRolls; i++) {
            numValue = 1 + dice.nextInt(6);
            System.out.println(numValue);
        }

    }

}
