import java.util.Scanner;

public class exercicio04 {
	public static void main(String[] args) {
		// criando objeto scanner
		Scanner scanner = new Scanner(System.in);

		// Crie 4 notas semestrais e faça a media

		int nota1;
		int nota2;
		int nota3;
		int nota4;
		float media;

		System.out.println("Digite a nota1");
		nota1 = scanner.nextInt();
		System.out.println("Digite a nota2");
		nota2 = scanner.nextInt();
		System.out.println("Digite a nota3");
		nota3 = scanner.nextInt();
		System.out.println("Digite a nota4");
		nota4 = scanner.nextInt();

		// Mostrando na tela os valores digitados e calculando a media

		System.out.println("A primeira nota foi de :" + nota1);
		System.out.println("A segunda nota foi de :" + nota2);
		System.out.println("A terceira nota foi de :" + nota3);
		System.out.println("A quarta nota foi de :" + nota4);

		// calculando a media;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		System.out.println("A media foi de :" + media);

	}

}
