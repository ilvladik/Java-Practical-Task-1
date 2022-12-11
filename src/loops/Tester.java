package loops;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Размер массива: ");
        int size = scanner.nextInt();
        int[] arrayForSum = new int[size];

        System.out.print("Элементы массива: ");
        for (int i = 0; i < size; i++) {
            arrayForSum[i] = scanner.nextInt();
        }

        System.out.println("Сумма элементов массива: ");
        System.out.println("Через for: " + sumArray(arrayForSum, 0));
        System.out.println("Через while: " + sumArray(arrayForSum, 1));
        System.out.println("Через do while: " + sumArray(arrayForSum, 2));
    }

    public static int sumArray(int[] array, int mode) {
        int sum = 0, j = 0;
        switch (mode) {
            case 0:
                for (int i : array) {
                    sum += i;
                }
                break;
            case 1:
                while (j < array.length) {
                    sum += array[j];
                    j++;
                }
                break;
            case 2:
                if (array.length != 0) {
                    do {
                        sum += array[j];
                        j++;
                    } while (j < array.length);
                }
                break;
        }
        return sum;
    }
}
