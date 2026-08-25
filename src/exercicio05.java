import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: R$ ");
        double valorCompra = scanner.nextDouble();

        double percentualDesconto;

        if (valorCompra > 1000) {
            percentualDesconto = 0.10;

        } else if (valorCompra >= 500) {
            percentualDesconto = 0.05;

        } else {
            percentualDesconto = 0;
        }

        double valorDesconto = valorCompra * percentualDesconto;
        double valorFinal = valorCompra - valorDesconto;

        System.out.println("\n===== COMPRA =====");
        System.out.printf("Valor original: R$ %.2f%n", valorCompra);
        System.out.printf("Desconto: R$ %.2f%n", valorDesconto);
        System.out.printf("Valor final: R$ %.2f%n", valorFinal);

        scanner.close();
    }
}