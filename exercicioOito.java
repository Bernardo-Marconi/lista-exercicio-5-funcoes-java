import java.util.Scanner;

public class exercicioOito {
    public static void main(String[] args) {

        System.out.println("Exercício Oito");

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a taxa de imposto:");
        double taxaImposto = scan.nextDouble();

        System.out.println("Digite o custo do produto:");
        double custoProduto = scan.nextDouble();

        double novoValorCustoCalculado = somarImposto(taxaImposto, custoProduto);

        System.out.printf("Valor de custo com imposto somado: R$%.2f", novoValorCustoCalculado);

        scan.close();
    }

    public static double somarImposto(double imposto, double custo) {
        imposto = (imposto / 100);
        double novoValorCusto = (imposto * custo) + custo;
        return novoValorCusto;
    }
}
