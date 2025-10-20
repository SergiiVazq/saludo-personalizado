import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce la temperatura actual en grados Cº: ");
        float x = input.nextFloat();

    }

    private static void celsiusAFahrenheit(float celsius) {
        float resultado= (celsius * 9/5) + 32;
        System.out.println("La temperatura celsius es: " + celsius+ " y el resultado en fahrenheit: " + resultado);
    }

}