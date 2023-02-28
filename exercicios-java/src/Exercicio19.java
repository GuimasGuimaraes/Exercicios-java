import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// faça um programa para leitura de duas notas de um aluno e calular a media
		// se a media for maior ou igual a sete imprima aprovado
		// se a media for menor que sete imprima reprovado
		// se a media for igual a dez imprima aprovado com distinção

		System.out.println("Digite a primeira nota: ");
		double nota1 = scan.nextDouble();

		System.out.println("Digite a segunda nota: ");
		double nota2 = scan.nextDouble();

		double media = (nota1 + nota2) / 2;

		if (media >= 7 && media < 10) {
			System.out.println("Aprovado com media: " + media);
		} else if (media < 7) {
			System.out.println("Reprovado, media: " + media);
		} else {
			System.out.println("Aprovado com Distinção, media: " + media);
		}

	}
}
