import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro lado: ");
        double ladoA = scanner.nextDouble();

        System.out.print("Digite o segundo lado: ");
        double ladoB = scanner.nextDouble();

        System.out.print("Digite o terceiro lado: ");
        double ladoC = scanner.nextDouble();

        if (ladoA + ladoB <= ladoC ||
                ladoA + ladoC <= ladoB ||
                ladoB + ladoC <= ladoA) {

            System.out.println("Os lados não formam um triângulo válido.");

        } else if (ladoA == ladoB && ladoB == ladoC) {

            System.out.println("Triângulo equilátero.");

        } else if (ladoA == ladoB ||
                ladoA == ladoC ||
                ladoB == ladoC) {

            System.out.println("Triângulo isósceles.");

        } else {

            System.out.println("Triângulo escaleno.");
        }

        scanner.close();
    }
}