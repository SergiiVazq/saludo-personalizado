import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce el primer numero: ");
        int x = input.nextInt();
        System.out.print("Introduce el segundo numero: ");
        int z = input.nextInt();
        System.out.print("\nQUE OPERACION QUIERES HACER?");
        System.out.println("\n1. sumar");
        System.out.println("2. restar");
        System.out.println("3. multiplicar");
        System.out.println("4. dividir");
        System.out.print("5. salir");
        int seleccion = input.nextInt();

        switch (seleccion) {
            case 1:
                sumar(x,z);
                break;
            case 2:
                restar(x,z);
                break;
            case 3:
                multiplicar(x,z);
                break;
            case 4:
                dividir(x,z);
                break;
        }
    }
    private static void sumar(int a, int b) {
        int resultado = a + b;
        System.out.println("El resultado de la suma es: " + resultado);
    }
    private static void restar(int a, int b) {
        int resultado = a - b;
        System.out.println("El resultado de la resta es: " + resultado);

    }
    private static void multiplicar(int a, int b) {
        int resultado = a * b;
        System.out.println("El resultado de la multiplicacion es: " + resultado);

    }
    private static void dividir(int a, int b) {
        if (b <= 0) {
            System.out.println("ERROR EL DIVISOR ES MENOR O IGUAL A 0");

        }else {
            float resultado = (float) a / (float) b;
            System.out.println("El resultado de la division es: " + resultado);
        }
    }
}
