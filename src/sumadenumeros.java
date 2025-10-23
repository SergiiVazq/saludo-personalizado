import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class sumadenumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce el primer numero para sumar: ");
        int x = input.nextInt();
        System.out.print("Introduce el segundo numero para sumar: ");
        int z = input.nextInt();
        sumar(x,z);
    }

    private static void sumar(int a , int b) {
        int resultado = a + b;
        System.out.println("La suma de los dos numeros " + a + " y " + b + " es igual: "+ resultado);   }
}