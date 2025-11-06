public class Printer {
    public static void main(String[] args) {
        /*System.out.println(); // YOu know hot this work
         */
        double price = 19.97;
        int quantity = 3;

        System.out.printf("The Total Price For %d item is $%.2f%n", quantity, price *
                quantity);
    }
}
