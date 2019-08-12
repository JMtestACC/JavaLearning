import java.util.Scanner;

public class WorkingWithStrings {
    public static void main(String[] args) {

        countingLength();
        concatenatingStrings();
        findCharInString();
        pickSubstring();
        findWordsPositionInString();

    }

    public static void countingLength() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write some text and length of this text will be counted");
        String textToCount = scanner.next();
        String textToCount2 = "Write some text and length of this text will be counted";

        System.out.println(textToCount.length());
        System.out.println(textToCount2.length());
    }

    public static void concatenatingStrings() {
        String text_1 = "Beginnings are ";
        String text_2 = "hard";

        String combinedStrings = text_1.concat(text_2);
        String combinedStrings_2 = text_1.concat("VERY HARD");
        String combinedStrings_3 = text_1 + text_2;


        System.out.println("concat() with two variables: " + combinedStrings);
        System.out.println("concat() with variable and string: " + combinedStrings_2);
        System.out.println("just '+' sign used for two variables: " + combinedStrings_3);
    }

    public static void findCharInString() {
        Scanner scanner = new Scanner(System.in);
        String message = "This is method which show You what letter is located in position of this string";
        System.out.println(message);
        System.out.println("Enter character position in string");
        int stringPosition = scanner.nextInt();

        while(stringPosition >= message.length()){
            System.out.println("Value is out of range. Please try provide other value");
            stringPosition = scanner.nextInt();
        }

        System.out.println("'" + message.charAt(stringPosition) + "'");

    }

    public static void pickSubstring() {
        Scanner scanner = new Scanner(System.in);

        String text = "This is simple string and I want to cut part of text from it";
        System.out.println(text);
        System.out.println("Provide start position number of this substring");
        int substringStart = scanner.nextInt();
        System.out.println("Provide length of your substring");
        int substringLength = scanner.nextInt();

        String substringValue = text.substring(substringStart, substringLength);

        System.out.println(substringValue);
    }

    public static void findWordsPositionInString() {
        String text = "Po pierwsze primo, po drugie primo, po trzecie primo ultimo";

        int firstPosition = text.indexOf("primo");
        int lastPosition = text.lastIndexOf("primo");

        System.out.println(text);
        System.out.println("Pierwsze primo jest na pozycji: " + firstPosition + "\nOstatnie primo jest na pozycji: " + lastPosition);

    }
}
