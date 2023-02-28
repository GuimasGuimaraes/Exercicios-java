import java.util.Scanner;

public class Exercicio25 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o valor do seu salário: ");
		double salario = scan.nextDouble();

		if (salario <= 280.00) {

			System.out.println("Salario antes do reajuste: " + salario);
			salario = (salario * 0.20) + salario;
			System.out.println("Salario após reajuste: " + salario + " aumento de 20%");

		} else if (salario > 280.00 || salario <= 700) {
			System.out.println("Salario antes do reajuste: " + salario);
			salario = (salario * 0.15) + salario;
			System.out.println("Salario após reajuste: " + salario + " aumento de 15%");

		} else if (salario > 700.00 || salario <= 1500) {
			System.out.println("Salario antes do reajuste: " + salario);
			salario = (salario * 0.10) + salario;
			System.out.println("Salario após reajuste: " + salario + " aumento de 10%");

		} else {
			System.out.println("Salario antes do reajuste: " + salario);
			salario = (salario * 0.05) + salario;
			System.out.println("Salario após reajuste: " + salario + " aumento de 5%");
		}
	}

}
