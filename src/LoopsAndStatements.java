import java.util.Scanner;

public class LoopsAndStatements {
    public static void main(String[] args) {

        ifStatement();
        switchStatement();

    }

    public static void ifStatement() {
        int grade = 5;

        if(grade >= 2 && grade < 7) {
            System.out.println("You've passed");
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
}
