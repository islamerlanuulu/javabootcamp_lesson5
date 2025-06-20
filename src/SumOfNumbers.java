import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0; int userNumber;

        do {
            System.out.println("Введите число: ");
            userNumber = scanner.nextInt();
            sum += userNumber;
        } while (userNumber != 0);

        System.out.println(sum);
    }
}
