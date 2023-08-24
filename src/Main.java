import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.print("Введите количество строк треугольника Паскаля: ");
        int strings = scanner.nextInt();
        int digital = 1;

        for (int i = 0; i < strings; i++) { // печать строки
            for (int space = 1; space < strings - i; space++) { // вывод пробелов в строке
                System.out.print("  ");
            }

            for(int j = 0; j <= i; j++) {
                if (j == 0 || i == 0)
                    digital = 1;
                else
                    digital = digital * (i - j + 1) / j;

                System.out.printf("%4d", digital);
            }

            System.out.println();
        }
    }
}