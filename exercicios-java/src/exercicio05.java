import java.util.Scanner;

public class exercicio05 {
	public static void main(String[] args) {

		// criando objeto scanner

		Scanner scanner = new Scanner(System.in);

		// Convertendo metros para centimetros

		int metros;
		double centimetros;

		System.out.println("Digite quantos metros você quer converter: ");
		metros = scanner.nextInt();

		metros = metros * 100;
		centimetros = metros;

		System.out.println("A quantidade de centimetros é: " + centimetros + "cm");

	}
}
