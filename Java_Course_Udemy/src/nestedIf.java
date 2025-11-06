import java.util.Scanner;

public class nestedIf {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your username: ");
        String userName = input.nextLine();
        System.out.print("Please enter your password: ");
        String password = input.nextLine();

        if (userName.equals("Admin") && password.equals("1234")) {

            System.out.println("You are now logged in");
        } else if (!userName.equals("Admin") || !password.equals("1234")) {
            if (userName.equals("") || password.equals("")){
                System.out.println("Please  enter your username and password");
            }
            System.out.println("Your username and password are incorrect");
        }
        input.close();

    }
}
