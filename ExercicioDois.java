import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {

        System.out.println("Exercício Dois");

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do produto:");
        double valorProduto = scan.nextDouble();

        double resultadoPorcentagemCalculada = calcularPorcentagem(valorProduto);

        System.out.printf("O valor do produto atualizado é: R$ %.2f", resultadoPorcentagemCalculada);

        scan.close();
    }

    public static double calcularPorcentagem(double valorOriginalProduto) {
        double porcentagem = ((valorOriginalProduto * 0.1) + valorOriginalProduto);
        return porcentagem;
    }
}
