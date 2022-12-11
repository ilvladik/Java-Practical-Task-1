package harmony;

public class Tester {

    public static void main(String[] args) {

        float sum = 0.0f;
        System.out.println("Гармонический ряд: ");
        for (float i = 1; i <= 10; i++) {
            sum += 1/i;
            System.out.printf("%.2f ", 1/i);
        }
        System.out.printf("\nCумма ряда: %.3f\n", sum);
    }
}
