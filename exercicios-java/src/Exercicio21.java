import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro numero: ");
		int num1 = scan.nextInt();

		System.out.println("Digite o segundo numero: ");
		int num2 = scan.nextInt();

		System.out.println("Digite o terceiro numero: ");
		int num3 = scan.nextInt();

		// mostrar o maior valor

		if (num1 > num2 && num1 > num3) {

			System.out.println(num1 + " Maior valor");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + " Maior valor");
		} else {
			System.out.println(num3 + " Maior valor");
		}

		// mostrar menor valor

		if (num1 < num2 && num1 < num3) {

			System.out.println(num1 + " Menor valor");
		} else if (num2 < num1 && num2 < num3) {
			System.out.println(num2 + " Menor valor");
		} else {
			System.out.println(num3 + " Menor valor");
		}

	}
}
