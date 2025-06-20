
public class Loop {
    public static void main(String[] args) {

        System.out.println("1. Вывести на экран 10 раз своё имя");
        for (int i = 0; i < 10; i++) {
            System.out.println(i+1 + " Ислам");
        }

        System.out.println("2. Вывести на экран числа от 1 до 100");
        for (int i = 0; i < 100; i++) {
            System.out.println(i+1);
        }

        System.out.println("3. Вывести на экран все четные числа от 1 до 100");
        for (int i = 2; i <= 100; i+=2) {
            System.out.println(i);
        }

        System.out.println("4. Вывести на экран все числа от 1 до 100 кратные 4");
        for (int i = 0; i < 100; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }
    }
}