import java.util.Scanner;

public class exercicio07 {
	public static void main(String[] args) {

		// Faça um programa que calcule a área de um quadrado, em seguida mostre o dobro
		// desta área para o usuário.

		// criando objeto scanner

		Scanner scanner = new Scanner(System.in);

		// Para calcular a area de um quadrado multiplicamos a base e a altura;

		int baseQuadrado;
		int alturaQuadrado;
		int areaQuadrado;
		int dobroArea;

		System.out.println("Digite o valor da base do quadrado: ");
		baseQuadrado = scanner.nextInt();

		System.out.println("Digite a altura do quadrado: ");
		alturaQuadrado = scanner.nextInt();

		// Fazendo o calculo;

		areaQuadrado = baseQuadrado * alturaQuadrado;

		System.out.println("A área do quadrado é: " + areaQuadrado);

		dobroArea = areaQuadrado * 2;

		System.out.println("E o dobro da área é: " + dobroArea);

	}

}
