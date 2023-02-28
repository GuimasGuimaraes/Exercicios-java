import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o valor da sua diaria: ");
		double diaria = scan.nextDouble();

		System.out.println("Digite quantos dias trabalha no mês: ");
		double horasMes = scan.nextDouble();

		double salario = (diaria * horasMes);
		double descontoIr;
		double descontoInss = salario * 0.1;
		double depoFgts;
		double totalDescontos;
		double sindicato = (salario * 0.03);

		// calculos de descontos

		descontoInss = (salario * 0.1);

		// descontos serão imposto de renda , 3% para sindicato e 10% para inss, a
		// empresa deposita 11% para o fgts

		if (salario <= 900) {
			System.out.println("Salario bruto: " + salario);
			System.out.println("(-) IR (5%) : Insento");

			descontoInss = (salario * 0.1);

			System.out.println("(-) INSS (10%) : " + descontoInss);
			System.out.println("(-) Sindicato (3%) : " + sindicato);

			depoFgts = (salario * 0.11);
			System.out.println("FGTS (11%) : " + depoFgts);

			totalDescontos = descontoInss + sindicato;
			System.out.println("Total de descontos: " + totalDescontos);

			salario = salario - totalDescontos;
			System.out.println("Salário liquido : " + salario);

		} else if (salario > 900 && salario <= 1500) {

			System.out.println("Salario bruto: " + salario);
			descontoIr = (salario * 0.05);
			System.out.println("(-) IR (5%) : " + descontoIr);

			descontoInss = (salario * 0.1);

			System.out.println("(-) INSS (10%) : " + descontoInss);
			System.out.println("(-) Sindicato (3%) : " + sindicato);

			depoFgts = (salario * 0.11);
			System.out.println("FGTS (11%) : " + depoFgts);

			totalDescontos = descontoInss + sindicato + descontoIr;
			System.out.println("Total de descontos: " + totalDescontos);

			salario = salario - totalDescontos;
			System.out.println("Salário liquido : " + salario);
		} else if (salario > 1500 && salario <= 2500) {

			System.out.println("Salario bruto: " + salario);
			descontoIr = (salario * 0.10);
			System.out.println("(-) IR (10%) : " + descontoIr);

			descontoInss = (salario * 0.1);

			System.out.println("(-) INSS (10%) : " + descontoInss);
			System.out.println("(-) Sindicato (3%) : " + sindicato);

			depoFgts = (salario * 0.11);
			System.out.println("FGTS (11%) : " + depoFgts);

			totalDescontos = descontoInss + sindicato + descontoIr;
			System.out.println("Total de descontos: " + totalDescontos);

			salario = salario - totalDescontos;
			System.out.println("Salário liquido : " + salario);
		} else if (salario > 2500) {

			System.out.println("Salario bruto: " + salario);
			descontoIr = (salario * 0.20);
			System.out.println("(-) IR (20%) : " + descontoIr);

			descontoInss = (salario * 0.1);

			System.out.println("(-) INSS (10%) : " + descontoInss);
			System.out.println("(-) Sindicato (3%) : " + sindicato);

			depoFgts = (salario * 0.11);
			System.out.println("FGTS (11%) : " + depoFgts);

			totalDescontos = descontoInss + sindicato + descontoIr;
			System.out.println("Total de descontos: " + totalDescontos);

			salario = salario - totalDescontos;
			System.out.println("Salário liquido : " + salario);
		}
	}
}
