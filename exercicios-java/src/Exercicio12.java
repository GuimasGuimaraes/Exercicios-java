import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Entre com a altura:");
		double altura = scanner.nextDouble();

		double f = (72.7 * altura) - 58;

		System.out.println("O peso ideal é: " + f);
	}
}
