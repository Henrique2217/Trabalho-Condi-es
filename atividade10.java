import java.util.Scanner;
public class atividade10 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o valor total da compra: R$ ");
            double valorCompra = scanner.nextDouble();

            double desconto = 0.0;
            double valorFinal = 0.0;

            if (valorCompra > 500) {
                desconto = 0.20;
            } else if (valorCompra >= 200) {
                desconto = 0.10;
            } else if (valorCompra >= 100) {
                desconto = 0.05;
            } else {
                desconto = 0.0;
            }

            double valorDesconto = valorCompra * desconto;
            valorFinal = valorCompra - valorDesconto;


            System.out.println("Valor original: R$ " + valorCompra);
            System.out.println("Percentual de desconto aplicado: " + (desconto * 100) + "%");
            System.out.println("Valor descontado: R$ " + valorDesconto);
            System.out.println("Valor final após desconto: R$ " + valorFinal);

            scanner.close();
        }
}
