import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o valor do primeiro produto: ");
		double produto1 = scan.nextDouble();

		System.out.println("Digite o valor do segundo produto: ");
		double produto2 = scan.nextDouble();

		System.out.println("Digite o valor do terceiro produto: ");
		double produto3 = scan.nextDouble();

		if (produto1 < produto2 && produto1 < produto3) {
			System.out.println("O produto 1 é mais barato " + produto1);
		}
		if (produto2 < produto1 && produto2 < produto3) {
			System.out.println("O produto 2 é mais barato " + produto2);
		}
		if (produto3 < produto1 && produto3 < produto2) {
			System.out.println("O produto 3 é mais barato " + produto3);
		}
	}

}
