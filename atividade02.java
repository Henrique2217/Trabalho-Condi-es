public class atividade02 {
    public static void main(String[] args) {
        //Crie uma variável para armazenar a nota de um aluno (de 0 a 10)
        double nota = 9.1;

        //Usando condições encadeadas
        if (nota >= 9) {
            System.out.println("Excelente");
        } else if (nota >= 7) {
            System.out.println("Bom");
        } else if (nota >= 5) {
            System.out.println("Satisfatório");
        } else {
            System.out.println("Insatisfatório");
        }
    }
}
