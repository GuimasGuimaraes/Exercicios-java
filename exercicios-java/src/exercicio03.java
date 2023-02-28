import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		// Faça um programa que peça dois numeros e imprima a soma;

		Scanner scanner = new Scanner(System.in);

		int nota1;
		int nota2;
		double resultado;
		// Digite as notas
		System.out.println("Digite a primeira nota: ");
		nota1 = scanner.nextInt();

		System.out.println("Digite a segunda nota: ");
		nota2 = scanner.nextInt();

		resultado = (nota1 + nota2);

		// Imprima na tela

		System.out.println("A primeira nota é: " + nota1);
		System.out.println("A segunda nota é: " + nota2);
		System.out.println("E a soma foi de :" + resultado);

	}

}
