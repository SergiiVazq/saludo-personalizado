import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Conversiontemperatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce la temperatura actual en grados Cº: ");
        float x = input.nextFloat();
        float resultado;
        resultado = celsiusAFahrenheit(x);
        System.out.print("los grados celsios :" + x + " es equivalente a " + resultado + "f(fahrenheit)");

    }

    private static float celsiusAFahrenheit(float celsius) {
        float y = (celsius * 9/5) + 32;
        return y;
    }

}