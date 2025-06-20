import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String LOGIN = "admin";
        final String PASSWORD = "123";

        String userLogin, userPassword;

        int totalCount = 0;

        while (true) {
            System.out.println("Enter your login: ");
            userLogin =  scanner.nextLine();
            System.out.println("Enter your password: ");
            userPassword = scanner.nextLine();

            if (userLogin.equalsIgnoreCase(LOGIN) && userPassword.equals(PASSWORD)) {
                System.out.println("You are logged in!");
                System.out.println("Количество попыток; " + ++totalCount);
                break;
            } else  {
                System.out.println("Wrong password or login!");
                System.out.println("Количество попыток; " + ++totalCount);
            }
        }
    }
}
