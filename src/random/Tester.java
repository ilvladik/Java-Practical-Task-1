package random;

import java.util.Arrays;
import java.util.Random;

public class Tester {

    public static void main(String[] args) {

        final int length = 10;
        int[] arrayRandom = new int[length];
        Random rand = new Random();

        System.out.println("Случайное заполнение при помощи Random: ");
        for (int i = 0; i < length; i++) {
            arrayRandom[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(arrayRandom));

        System.out.println("Случайное заполнение при помощи Math.random: ");
        for (int i = 0; i < length; i++) {
            arrayRandom[i] = (int)(Math.random() * 100);
        }
        System.out.println(Arrays.toString(arrayRandom));

        System.out.println("Отсортированный массив: ");
        Arrays.sort(arrayRandom);
        System.out.println(Arrays.toString(arrayRandom));
    }
}
