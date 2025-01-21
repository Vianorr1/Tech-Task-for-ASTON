import java.util.Scanner;

public class NumbersCompare {
    public static void main(String[] args) {
        // Создаем объект Scanner для ввода данных с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя ввод двух целых чисел
        System.out.print("Введите число a: ");
        int a = scanner.nextInt();

        System.out.print("Введите число b: ");
        int b = scanner.nextInt();

        // Сравниваем числа и выводим результат
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Выполняем операции сложения, вычитания, умножения и деления
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        double quotient = (double) a / b; // Приводим к double для точного деления

        // Выводим результаты операций
        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);
        System.out.println("Произведение: " + product);
        System.out.println("Частное: " + quotient);

        // Закрываем Scanner
        scanner.close();
    }
}