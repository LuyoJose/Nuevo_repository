import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Introduce un número (0 para salir): ");
            numero = scanner.nextInt();
        } while (numero != 0);

        System.out.println("¡Adiós!");
    }
}
