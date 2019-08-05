import java.util.Scanner;

public class LoopsAndStatements {

    public static void main(String[] args) {

        int finalGrade = 5;

        ifStatement();
        switchStatement();
        whileLoop();
        forLoop();
        doWhileLoop();

        System.out.println(finalGrade >= 4 ? "Good job" : "You could better");

    }

    public static void ifStatement() {
        int grade = 6;

        if(grade >= 2 && grade < 7) {
            if(grade == 6) {
                System.out.println("Excellent grade !!!");
            } else {
                System.out.println("You've passed");
            }
        } else if(grade < 2 && grade > 0) {
            System.out.println("You are failed. Need write test again.");
        } else {
            System.out.println("Wrong grade provided");
        }
    }

    public static void switchStatement() {
        int gradeDescription;
        gradeDescription = 3;

        switch (gradeDescription) {
            case 1: System.out.println("Very BAD grade!!!!!!!!!!");
                break;
            case 2: System.out.println("bad grade");
                break;
            case 3: System.out.println("not good grade");
                break;
            case 4: System.out.println("good grade");
                break;
            case 5: System.out.println("very good grade");
                break;
            case 6: System.out.println("very GOOD grade!!!!!!!!!");
                break;
        }

    }

    public static void whileLoop() {

        Scanner scanner = new Scanner(System.in);

        String word;
        int timesToRepeat;
        int counter = 0;

        System.out.println("What word do You like to print?");
        word = scanner.next();
        System.out.println("How many times You want to repeat word: " + word + " ?");
        timesToRepeat = scanner.nextInt();

        while(counter < timesToRepeat) {
            System.out.println(word);
            counter ++;
        }
    }

    public static void forLoop() {

        Scanner scanner = new Scanner(System.in);

        String word;
        int timesToRepeat;

        System.out.println("forLoop() method do the same as whileLoop()");
        System.out.println("What word do You like to print?");
        word = scanner.next();
        System.out.println("How many times You want to repeat word: " + word + " ?");
        timesToRepeat = scanner.nextInt();

        for(int i = 0; i < timesToRepeat; i++) {
            System.out.println(word);
        }
    }

    public static void doWhileLoop() {

        int years = 30;

        do {
            System.out.println("This is do-while loop, so loop will be executed at least ONCE !!!! \n oh.. I forgot I'm " + years + " years old");
            years ++;
        } while (years < 25);
    }
}
