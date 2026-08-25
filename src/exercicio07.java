import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu salário bruto anual: R$ ");
        double salario = scanner.nextDouble();

        double imposto = 0;

        if (salario <= 30000) {

            imposto = 0;

        } else if (salario <= 50000) {

            imposto = (salario - 30000) * 0.10;

        } else if (salario <= 80000) {

            imposto = (20000 * 0.10)
                    + ((salario - 50000) * 0.20);

        } else {

            imposto = (20000 * 0.10)
                    + (30000 * 0.20)
                    + ((salario - 80000) * 0.275);
        }

        double salarioLiquido = salario - imposto;

        System.out.println("\n===== IMPOSTO DE RENDA =====");
        System.out.printf("Salário bruto: R$ %.2f%n", salario);
        System.out.printf("Imposto: R$ %.2f%n", imposto);
        System.out.printf("Salário líquido: R$ %.2f%n", salarioLiquido);

        scanner.close();
    }
}