import java.util.Random;
import java.util.Scanner;

public class dado {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Introduce el numero de veces que quieres tirar el dado: ");
        int tiradas = input.nextInt();
        int a = 0;//1
        int b = 0;//2
        int c = 0;//3
        int d = 0;//4
        int e = 0;//5
        int f = 0;//6
        for (int i = 1; i <= tiradas + 1; i++) {
            int y = lanzardado();
            switch (y) {
                case 1:
                    a++;
                    break;
                case 2:
                    b++;
                    break;
                case 3:
                    c++;
                    break;
                case 4:
                    d++;
                    break;
                case 5:
                    e++;
                    break;
                case 6:
                    f++;
                    break;
            }
        }
        System.out.println("Has tirado el dado un totla de: "+ tiradas + " veces.");
        System.out.println("\nHa salido 1 : "+ a + " veces");
        System.out.println("\nHa salido 2 : "+ b + " veces");
        System.out.println("\nHa salido 3 : "+ c + " veces");
        System.out.println("\nHa salido 4 : "+ d + " veces");
        System.out.println("\nHa salido 5 : "+ e + " veces");
        System.out.println("\nHa salido 6 : "+ f + " veces");
    }
    private static int lanzardado(){
        Random rand = new Random();
        int x = rand.nextInt(0,6)+1;
        return x;

    }

}
