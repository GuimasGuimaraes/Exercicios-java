import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Entre com um numero inteiro:");
		int num1 = scanner.nextInt();

		System.out.println("Entre com um numero inteiro:");
		int num2 = scanner.nextInt();

		System.out.println("Entre com um numero real:");
		double num3 = scanner.nextDouble();

		int resultado1 = (num1 * 2) * (num2 / 2);

		double resultado2 = (num1 * 3) + num3;

		double resultado3 = Math.pow(3, 3);

		System.out.println("Resultado 1 :" + resultado1);
		System.out.println("Resultado 2 :" + resultado2);
		System.out.println("Resultado 3 :" + resultado3);

	}

}
