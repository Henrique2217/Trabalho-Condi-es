import java.util.Scanner;
public class atividade07 {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o primeiro número: ");
            double numero1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double numero2 = scanner.nextDouble();

            scanner.nextLine();

            System.out.print("Digite a operação (adição, subtração, multiplicação, divisão): ");
            String operacao = scanner.nextLine().toLowerCase();

            double resultado;
            switch (operacao) {
                case "adição":
                    resultado = numero1 + numero2;
                    System.out.println("Resultado da adição: " + resultado);
                    break;
                case "subtração":
                    resultado = numero1 - numero2;
                    System.out.println("Resultado da subtração: " + resultado);
                    break;
                case "multiplicação":
                    resultado = numero1 * numero2;
                    System.out.println("Resultado da multiplicação: " + resultado);
                    break;
                case "divisão":
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                        System.out.println("Resultado da divisão: " + resultado);
                    } else {
                        System.out.println("Erro: Divisão por zero não é permitida.");
                    }
                    break;
                default:
                    System.out.println("Operação inválida. Por favor, escolha entre adição, subtração, multiplicação ou divisão.");
                    break;
            }
            scanner.close();
    }
}