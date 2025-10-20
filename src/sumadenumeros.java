import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce el primer numero para sumar: ");
        String nome = input.nexInt();
        saludar(nome);
    }

    private static void saludar(String name) {
        System.out.println("Bienvenido " + name);
    }
}