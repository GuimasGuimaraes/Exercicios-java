import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com uma letra(f ou m)");
		String letra = scan.next();

		if (letra.equalsIgnoreCase("f")) {
			System.out.println("F- Feminino");

		} else if (letra.equalsIgnoreCase("m")) {
			System.out.println("M - Masculino");
		} else {
			System.out.println("Sexo invalido");
		}

	}
}
