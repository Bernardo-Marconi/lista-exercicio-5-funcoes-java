import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {

        System.out.println("Exercicio Cinco");

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numeroEscolhido = scan.nextInt();

        repetirNumero(numeroEscolhido);

        scan.close();
    }

    public static int repetirNumero(int numeroInformado) {

        for (int i = 0; i < numeroInformado; i++) {
            System.out.println(numeroInformado);
        }
        return numeroInformado;
    }
}
