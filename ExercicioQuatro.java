import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) throws Exception {

        System.out.println("Exercício Quatro");

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double primeiroNumero = scan.nextDouble();

        System.out.println("Digite o segundo número:");
        double segundoNumero = scan.nextDouble();

        System.out.println("Digite o terceiro número:");
        double terceiroNumero = scan.nextDouble();

        double mediaAritimeticaCalculada = calcularMediaAritimetica(primeiroNumero, segundoNumero, terceiroNumero);
        double mediaHarmonicaCalculada = caluclarMediaHarmonica(primeiroNumero, segundoNumero, terceiroNumero);
        double mediaGeometricaCalculada = calcularMediaGeometrica(primeiroNumero, segundoNumero, terceiroNumero);

        System.out.printf(
                "Resultado média aritmética: %.2f\nResultado média harmônica: %.2f\nResultado média geométrica: %.2f\n",
                mediaAritimeticaCalculada, mediaHarmonicaCalculada, mediaGeometricaCalculada);

        scan.close();
    }

    public static double calcularMediaAritimetica(double primeiroNumero, double segundoNumero, double terceiroNumero) {
        double resultadoMediaAritmetica = (primeiroNumero + segundoNumero + terceiroNumero) / 3;
        return resultadoMediaAritmetica;
    }

    public static double caluclarMediaHarmonica(double primeiroNumero, double segundoNumero, double terceiroNumero) {
        double resultadoMediaHarmonica = 3 / ((1 / primeiroNumero) + (1 / segundoNumero) + (1 / terceiroNumero));
        return resultadoMediaHarmonica;
    }

    public static double calcularMediaGeometrica(double primeiroNumero, double segundoNumero, double terceiroNumero) {
        double resultadoMediaGeometrica = Math.cbrt(primeiroNumero * segundoNumero * terceiroNumero);
        return resultadoMediaGeometrica;
    }
}
