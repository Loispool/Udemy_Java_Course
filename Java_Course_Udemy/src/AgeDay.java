import java.util.Scanner;

public class AgeDay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your Age: ");
        int age = scan.nextInt();


        if (age < 13) {
            System.out.println("Child discount applies");
        } else if (age <= 17) System.out.println("Teen discount applies.");
        else if (age >= 18 && age <= 64) System.out.println("Standard price.");

        else {
            System.out.println("Señior discount applies");
        }
        System.out.print("Enter the day (1-7): ");
        int day = scan.nextInt();

        switch (day) {
            case (1):
                System.out.println("You Selected Monday");
                break;
            case (2):
                System.out.print(" You Selected Tuesday");
                break;
            case (3):
                System.out.println("You Selected Wednesday");
                break;
            case (4):
                System.out.println("You Selected Thursday");
                break;
            case (5):
                System.out.println("You Selected Friday");
                break;
            case (6):
                System.out.println("You Selected Saturday");
                break;
            case (7):
                System.out.println("You Selected Sunday");


        }
    }
}
