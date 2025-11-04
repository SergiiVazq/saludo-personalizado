import java.util.Random;
import java.util.Scanner;

public class Cadenas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el numero QUE VA A TENER EL ARRAY: ");
        int x = input.nextInt();
        float[] array = new float[x];
        Random rand = new Random();
        for (int i = 0; i < x; i++) {
            array[i] = rand.nextFloat(20);
        }
        System.out.print("\nel array es: ");
        for (int i = 0; i < x; i++) {
            System.out.print(array[i] + " ");
        }

    }

}
