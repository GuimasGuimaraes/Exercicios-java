import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro numero: ");
		int num1 = scan.nextInt();

		System.out.println("Digite o segundo numero: ");
		int num2 = scan.nextInt();

		System.out.println("Digite o terceiro numero: ");
		int num3 = scan.nextInt();

		if (num1 > num2 && num1 > num3) {

			System.out.println(num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println(num2);
		} else {
			System.out.println(num3);
		}

	}

}
