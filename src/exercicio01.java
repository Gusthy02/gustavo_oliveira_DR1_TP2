import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o nome da sua mãe: ");
        String nomeMae = scanner.nextLine();

        System.out.print("Digite o nome do seu pai: ");
        String nomePai = scanner.nextLine();

        System.out.println("\n===== CADASTRO =====");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Nome da mãe: " + nomeMae);
        System.out.println("Nome do pai: " + nomePai);

        System.out.println("\n===== COMPARAÇÃO =====");

        if (nome.length() > nomeMae.length() &&
                nome.length() > nomePai.length()) {

            System.out.println("Seu nome possui mais letras que o nome da sua mãe e do seu pai.");

        } else if (nome.length() > nomeMae.length()) {

            System.out.println("Seu nome possui mais letras que o nome da sua mãe.");

        } else if (nome.length() > nomePai.length()) {

            System.out.println("Seu nome possui mais letras que o nome do seu pai.");

        } else {

            System.out.println("Seu nome não possui mais letras que o nome da sua mãe e do seu pai.");
        }

        scanner.close();
    }
}