import java.util.Random;


public class Main {
    public static void main(String[] args) {
        int[] arr = new int[30];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 100_000 + random.nextInt(100_000);
        }

        // Задание 1. Найти сумму всех выплат.
        double sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        // Задание 2. Найти минимальную и максимальную сумму выплат.
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSum) {
                maxSum = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxSum + " рублей.");
        int minSum = 200001;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minSum){
                minSum = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей.");

        // Задание 3. Найти среднюю сумму затрат в течении месяца.
        double average = sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");

        // Задание 4. Корректно вывести в консоль фамилию и имя.
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}
