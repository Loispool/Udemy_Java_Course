import java.util.Scanner;

public class SwitchString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = 0;
        while (x < 1) {

            System.out.print("\n\nEnter a Fruit (Apple,Banana,Grapes): ");
            String fruit = scan.nextLine();

            switch (fruit) {
                case "Apple":
                    System.out.println("Apples can be red or green, Great Choice!!");
                    break;
                case "Banana":
                    System.out.println("Bananas have a lot of Vitamins and Minerals, Great Choice!!");
                    break;
                case "Grapes":
                    System.out.println("Grapes are Super juicy and sweet, Great Choice!!");
                    break;
                default:
                    if (fruit.equals("Exit")) {
                        x++;
                    } else {
                        System.out.println("Invalid fruit please type only the one of the three Choices!!");
                    }
            }

        }
    }
}
