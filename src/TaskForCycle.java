import java.util.Scanner;
import java.util.SortedMap;

public class TaskForCycle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Сумма от 1 до N\n" + "Вводится число N. Выведите сумму всех чисел от 1 до N.");
        int n = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Сумма от 1 до " + n + " = " + sum);

        System.out.println("2. Четные числа от 1 до N\n" + "Выведите все четные числа от 1 до N включительно.");
        for (int i = 2; i <= n; i += 2) {
            System.out.println(i);
        }

        System.out.println("3. Проверка простого числа\n" + "Вводится число N. Определите, является ли оно простым.");
        for (int i = 0; i <= n; i++) {
            if (n > 1 && !(n % 2 == 0)) {
                System.out.println(n + " Число простое");
                break;
            } else {
                System.out.println(n + " Не простое число");
            }
        }

        System.out.println("5. Сумма цифр числа\n" + "Вводится число N. Выведите сумму его цифр.");


        int sumNumbers = 0;
        while (n > 0) {
            sumNumbers += n % 10;
            n = n / 10;
        }
        System.out.println("Ответ: " + sumNumbers);
    }
}
