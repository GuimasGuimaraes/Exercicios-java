import java.util.Scanner;

public class exercicio08 {
	public static void main(String[] args) {

		// criando objeto scanner

		Scanner scanner = new Scanner(System.in);

		// Faça um programa que pergunte quanto você ganha por hora e o número de horas
		// trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.

		double ganhosHora;
		double horasTrabalhadas;
		double salario;

		System.out.println("Digite quanto você ganha por hora: ");
		ganhosHora = scanner.nextDouble();

		System.out.println("Digite quantas horas você trabalha por dia");
		horasTrabalhadas = scanner.nextDouble();

		// fazendo a soma

		salario = (ganhosHora * horasTrabalhadas) * 24;

		System.out.println("Se você trabalhar 24 dias terá um salario de: " + salario);
	}

}
