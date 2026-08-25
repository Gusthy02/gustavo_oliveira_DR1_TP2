import java.util.Random;
import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int palpite;
        int tentativas = 0;

        System.out.println("===== JOGO DE ADIVINHAÇÃO =====");
        System.out.println("Tente descobrir o número entre 1 e 100!");

        do {

            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();

            tentativas++;

            if (palpite < numeroSecreto) {

                System.out.println("O número secreto é MAIOR.");

            } else if (palpite > numeroSecreto) {

                System.out.println("O número secreto é MENOR.");

            } else {

                System.out.println("Parabéns! Você acertou!");
                System.out.println("Número de tentativas: " + tentativas);
            }

        } while (palpite != numeroSecreto);

        scanner.close();
    }
}