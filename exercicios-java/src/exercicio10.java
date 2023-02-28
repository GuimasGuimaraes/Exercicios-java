import java.util.Scanner;

public class exercicio10 {
	public static void main(String[] args) {
		// criando objeto scanner

		Scanner scanner = new Scanner(System.in);

		// Faça um programa que peça a temperatura em graus Celsius, transforme e
		// mostre a temperatura em graus Farenheit

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com a temperatura em Celsius:");
		double c = scan.nextDouble();

		double f = (c * 1.8) + 32;

		System.out.println("A temperatura " + c + "C é igual a " + f + "F");

	}

}
