import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {

		// Criando um programa que peça um valor e mostre na tela se o valor é positivo
		// ou negativo

		Scanner scan = new Scanner(System.in);

		double valor;

		System.out.println("Digite um valor");
		valor = scan.nextDouble();

		if (valor < 0) {
			System.out.println("O valor é negativo");
		} else {
			System.out.println("Valor positivo");
		}
	}

}
