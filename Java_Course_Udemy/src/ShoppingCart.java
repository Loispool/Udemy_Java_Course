import java.util.Scanner;

public class ShoppingCart {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Number of Item(s): ");

        double item =  input.nextDouble();
double itemTotal = 0;
        for (int i = 1; i < item; i++) {
            System.out.print("Enter the Price of item " + i + " :");
            double price = input.nextDouble();
            price += itemTotal;
        }
        System.out.println("The Total Price is $" + itemTotal);
        input.close();
    }
}
