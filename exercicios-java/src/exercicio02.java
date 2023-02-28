import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		// Faça um programa que pede um numero e mostre a mensagem, o numero informado
		// foi [numero]

		// cria um objeto Scanner para ler dados digitados pelo usuario
		Scanner scanner = new Scanner(System.in);

		// variaveis para armazenar dados

		int idade;
		String nome;

		// lê o nome do usuario

		System.out.println("Digite seu nome e aperte [ENTER]: ");
		nome = scanner.nextLine();

		System.out.println("Digite Sua idade: ");
		idade = scanner.nextInt();

		// Mostra os dados na tela

		System.out.println("O seu nome é : " + nome);
		System.out.println("A sua idade é :" + idade);

	}

}
