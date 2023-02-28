import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Entre com o tamanho do arquivo");
		double tamArquivo = scanner.nextDouble();

		System.out.println("Entre com a velocidade da internet");
		double velInternet = scanner.nextDouble();

		double tempo = tamArquivo / velInternet;

		System.out.println("Tempo de download: " + tempo);
	}

}
