import java.util.Scanner;

public class Task4Cycle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("4. Количество цифр в числе\n" + "Вводится число N. Определите количество цифр в числе.");
        int n = scanner.nextInt();
        int cycleCount = 0;
        while (n > 0) {
            n = n / 10;
            cycleCount++;

            if (n == 0) {
                break;
            }
        }

        System.out.println("Кол-во цифр в числе: " + cycleCount);
    }
}
