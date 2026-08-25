import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor inicial: ");
        int valorInicial = scanner.nextInt();

        System.out.print("Digite o incremento: ");
        int incremento = scanner.nextInt();

        int numero = valorInicial;

        System.out.println("\nSequência:");

        while (numero <= 100) {

            System.out.print(numero);

            numero += incremento;

            if (numero <= 100) {
                System.out.print(", ");
            }
        }

        System.out.println();

        scanner.close();
    }
}