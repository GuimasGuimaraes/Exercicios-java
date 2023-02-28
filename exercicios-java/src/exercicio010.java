import java.util.Scanner;

public class exercicio010 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double grausF;
		double grausC;

		System.out.println("Digite a temperatura em graus Celcius: ");
		grausC = scanner.nextInt();

		// Fazendo o calculo;

		grausF = (grausC * 9 / 5) + 32;

		System.out.println("A temperatura em Graus fahrenheit é de: " + grausF);

	}

}
