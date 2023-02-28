import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println(
				"Olá, em qual turno você estuda? Digite M- para Matutino, V- para Vespertino ou N- para Noturno");
		String turno = scan.next();

		if (turno.equalsIgnoreCase("m")) {
			System.out.println("BOM DIA!");
		} else if (turno.equalsIgnoreCase("v")) {
			System.out.println("BOA TARDE!");
		} else if (turno.equalsIgnoreCase("n")) {
			System.out.println("BOA NOITE!");
		} else {
			System.out.println("Turno inválido!");
		}
	}

}
