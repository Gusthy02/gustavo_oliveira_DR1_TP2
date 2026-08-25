import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double dolar = 5.50;
        double euro = 6.40;
        double libra = 7.40;

        System.out.print("Digite o valor em reais: R$ ");
        double valorReais = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Digite a moeda de destino (dolar, euro ou libra): ");
        String moeda = scanner.nextLine().toLowerCase();

        double valorConvertido;

        switch (moeda) {

            case "dolar":
                valorConvertido = valorReais / dolar;
                System.out.printf("Valor em dólares: US$ %.2f%n", valorConvertido);
                break;

            case "euro":
                valorConvertido = valorReais / euro;
                System.out.printf("Valor em euros: € %.2f%n", valorConvertido);
                break;

            case "libra":
                valorConvertido = valorReais / libra;
                System.out.printf("Valor em libras: £ %.2f%n", valorConvertido);
                break;

            default:
                System.out.println("Moeda inválida.");
        }

        scanner.close();
    }
}