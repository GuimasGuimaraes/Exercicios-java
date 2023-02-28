import java.util.Scanner;

public class exercicio09 {
	public static void main(String[] args) {
		// criando objeto scanner

		Scanner scanner = new Scanner(System.in);

		// Faça um programa que peça a temperatura em graus Farenheit, transforme e
		// mostre a temperatura em graus Celsius

		double grausF;
		double grausC;

		System.out.println("Digite a temperatura em graus Farenheit: ");
		grausF = scanner.nextInt();

		// Fazendo o calculo;

		grausC = (grausF - 32) * 5 / 9;

		System.out.println("A temperatura em Graus Celcius é de: " + grausC);

	}

}
