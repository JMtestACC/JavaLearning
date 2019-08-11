public class ArraysBasics {
    public static void main(String[] args) {

        FirstArray();
        PrintNumberFromArray();
        ArrayTable();
        SumOfNumInArray();
        TwoDimensionArray();

    }

    public static void FirstArray() {
        int number[] = new int[10];
        number[3] = 11;
        number[9] = 123;
        number[0] = 9;

        System.out.println(number[3]);
    }

    public static void PrintNumberFromArray() {
        int number[] = {43,12,11,433,98,65,76};

        System.out.println(number[4]);
    }

    public static void ArrayTable() {
        int number[] = {43,12,11,433,98,65,76};

        System.out.println("Loop start");

        for(int i = 0; i < number.length; i++) {
            System.out.println(i + "\t" + number[i]);
        }
    }

    public static void SumOfNumInArray() {
        int number[] = {43,12,11,433,98,65,76};
        int counter = 0;

//        for(int i = 0; i < number.length; i++) {
        for(int i:number) {     //Simple version of for loop
//            counter += number[i];
            counter += i;   //number[i] replaced just by 'i'
        }
        System.out.println("Sum of all numbers in array: " + counter);

    }

    public static void TwoDimensionArray() {
        int numbers[][] = {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}};

        System.out.println("To jest wartość 12: " + numbers[2][1]);
        System.out.println("To jest wartość 10: " + numbers[1][4]);

    }

}
