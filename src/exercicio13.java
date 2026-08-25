import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        String[] palavras = frase.trim().split("\\s+");

        int quantidade = 0;

        for (int i = 0; i < palavras.length; i++) {
            quantidade++;
        }

        System.out.println("Quantidade de palavras: " + quantidade);

        scanner.close();
    }
}