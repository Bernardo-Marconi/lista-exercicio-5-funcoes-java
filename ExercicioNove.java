import java.util.Scanner;

public class ExercicioNove {
    public static void main(String[] args) {

        System.out.println("Exercício Nove");

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número");
        int numeroDigitado = scan.nextInt();

        inverterNumero(numeroDigitado);

        scan.close();
    }

    public static void inverterNumero(int numeroEscolhido) {

        int unidade = numeroEscolhido % 10;
        int dezena = (numeroEscolhido % 100) / 10;
        int centena = numeroEscolhido / 100;

        System.out.printf("O número invertido é: %d%d%d",unidade, dezena, centena);
    }
}
