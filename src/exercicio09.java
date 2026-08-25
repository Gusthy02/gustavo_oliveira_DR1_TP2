import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Cadastre uma senha: ");
        String senha = scanner.nextLine();

        String tentativa;

        do {

            System.out.print("Digite sua senha novamente: ");
            tentativa = scanner.nextLine();

            if (!tentativa.equals(senha)) {
                System.out.println("Senha incorreta. Tente novamente.");
            }

        } while (!tentativa.equals(senha));

        System.out.println("Senha correta! Acesso permitido.");

        scanner.close();
    }
}