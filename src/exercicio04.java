import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia do nascimento: ");
        int dia = scanner.nextInt();

        System.out.print("Digite o mês do nascimento: ");
        int mes = scanner.nextInt();

        System.out.print("Digite o ano do nascimento: ");
        int ano = scanner.nextInt();

        LocalDate nascimento = LocalDate.of(ano, mes, dia);
        LocalDate hoje = LocalDate.now();

        long idadeEmDias = ChronoUnit.DAYS.between(nascimento, hoje);

        System.out.println("\nVocê viveu aproximadamente " + idadeEmDias + " dias.");

        scanner.close();
    }
}