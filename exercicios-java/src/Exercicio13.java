import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		// criando um scanner

		Scanner scanner = new Scanner(System.in);

		System.out.println("Quando você ganha por hora?");
		double valorHora = scanner.nextDouble();

		double salarioMensal = (valorHora * 8) * 24;
		System.out.println("Seu salario mensal é de: " + salarioMensal);

		System.out.println("Desses " + salarioMensal + " será descontado 11% para o imposto de Renda");
		double descontoIm = (salarioMensal * 0.11);
		salarioMensal = salarioMensal - descontoIm;
		System.out.println("Restando: " + salarioMensal);

		double descontoInss = (salarioMensal * 0.08);
		salarioMensal = salarioMensal - descontoInss;
		System.out.println("Com o desconto do inss sobraram: " + salarioMensal);

		double descontoSindicato = salarioMensal * 0.05;
		salarioMensal = salarioMensal - descontoSindicato;
		System.out.println("Com o desconto do sindicato restaram: " + salarioMensal);

	}
}
