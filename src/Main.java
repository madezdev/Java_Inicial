public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        double doubleNumbers = 32.33;
        int entera = (int) (doubleNumbers);

        System.out.println("Numero con decimal: " + doubleNumbers);
        System.out.println("Numero sin decimal: " + entera);
        System.out.println("Decimal: " + (doubleNumbers - entera));
    }
}