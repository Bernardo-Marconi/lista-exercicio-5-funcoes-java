import java.util.Scanner;

public class ExercicioSete {
    public static void main(String[] args) {

        System.out.println("Exercício Sete");

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numeroEscolhido = scan.nextInt();

        String resultadoIndicadorPositivoOuNegativo = informarNumeroNegativoOuPositivo(numeroEscolhido);

        System.out.printf("O número Informado é: %s ", resultadoIndicadorPositivoOuNegativo);

        scan.close();
    }

    public static String informarNumeroNegativoOuPositivo(int numeroInformado) {
        String indicadorPositivoOuNegativo = (numeroInformado > 0) ? "Positivo" : "Negativo";
        return indicadorPositivoOuNegativo;
    }
}
