import java.util.Scanner;

public class ExercicioTres {
  public static void main(String[] args) {

    System.out.println("Exercício Três");

    Scanner scan = new Scanner(System.in);

    System.out.println("Informe a temperatura em Fahrenheit:");
    double temperaturaFahrenheit = scan.nextInt();

    double temperaturaConvertidaCentigrados = converterTemperatura(temperaturaFahrenheit);

    System.out.printf("A temperatura em grau centígrados é: %.0f°C", temperaturaConvertidaCentigrados);

    scan.close();
  }

  public static double converterTemperatura(double temperaturaOriginalFahrenheit) {
    double conversao = ((temperaturaOriginalFahrenheit - 32) / 1.8);
    return conversao;
  }
}