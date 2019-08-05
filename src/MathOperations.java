public class MathOperations {

    public static void main(String[] args) {

        double przykladowyNumer = 16.67;

        System.out.println("Basic Math operators");

        wartBazwzgl(-653);
        minWartosc(przykladowyNumer);
        maxWartosc(przykladowyNumer);
        minLiczba(23,421);
        maxLiczba(23,421);
        potega(3,2);
        pierwiastek(16);

    }

    public static void wartBazwzgl(int liczbaUjemna) {
        System.out.println(Math.abs(liczbaUjemna));
    }

    public static void minWartosc(double liczba) {
        System.out.println(Math.floor(liczba));
    }

    public static void maxWartosc(double liczba) {
        System.out.println(Math.ceil(liczba));
    }

    public static void minLiczba(int liczba_1, int liczba_2) {
        System.out.println(Math.min(liczba_1, liczba_2));
    }

    public static void maxLiczba(int liczba_1, int liczba_2) {
        System.out.println(Math.max(liczba_1,liczba_2));
    }

    public static void potega(int podstawa, int potega) {
        System.out.println(Math.pow(podstawa, potega));
    }

    public static void pierwiastek(int liczba) {
        System.out.println(Math.sqrt(liczba));
    }

}
