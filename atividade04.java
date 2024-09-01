import java.util.Scanner;
public class atividade04 {
        public static void main(String[] args) {

            String nomeUsuarioCorreto = "Henrique22";
            String senhaCorreta = "1722";

            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o nome de usuário: ");
            String nomeUsuario = scanner.nextLine();

            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine();


            if (nomeUsuario.equals(nomeUsuarioCorreto) && senha.equals(senhaCorreta))
                System.out.println("Login bem-sucedido!");
        }
}