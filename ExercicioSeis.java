import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {

        System.out.println("Exercício Seis");

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = scan.nextInt();

        System.out.println("Digite o segundo número: ");
        int segundoNumero = scan.nextInt();

        System.out.println("Digite o terceiro número: ");
        int TerceiroNumero = scan.nextInt();

        int resultadoSomaTresNumeros = somarTresNumeros(primeiroNumero, segundoNumero, TerceiroNumero);

        System.out.printf("O resultado da soma dos três número é: %d", resultadoSomaTresNumeros);

        scan.close();
    }

    public static int somarTresNumeros(int numeroUm, int numeroDois, int numeroTres) {
        int resultadoSoma = (numeroUm + numeroDois + numeroTres);
        return resultadoSoma;
    }
}