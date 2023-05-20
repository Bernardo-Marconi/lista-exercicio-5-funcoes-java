import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {

        System.out.println("Exercício Um");

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double primeiroNumero = scan.nextDouble();

        System.out.println("Digite o segundo número número: ");
        double segundoNumero = scan.nextDouble();

        double mediaResultado = calcularMedia(primeiroNumero, segundoNumero);
        System.out.printf("A média aritmética entre os dois valores é: %.2f\n", mediaResultado);

        scan.close();
    }

    public static double calcularMedia(double numeroUm, double numerDois) {
        double mediaAritmetica = (numeroUm + numerDois) / 2;
        return mediaAritmetica;
    }
}
