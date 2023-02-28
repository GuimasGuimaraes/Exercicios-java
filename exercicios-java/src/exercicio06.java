import java.util.Scanner;

public class exercicio06 {
	public static void main(String[] args) {

		// Faça um programa que peça o raio de um circulo, calcule e mostre sua área.

		// criando objeto scanner

		Scanner scanner = new Scanner(System.in);

		// criando area e raio do circulo

		int area;
		int raio;

		// pedindo o raio

		System.out.println("Informe o raio do circulo: ");
		raio = scanner.nextInt();

		// calculando a area

		area = raio * 2;

		// informando a area

		System.out.println("A area do circulo é: " + area);

	}

}
