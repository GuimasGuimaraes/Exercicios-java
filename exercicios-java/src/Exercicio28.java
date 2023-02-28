
public class Exercicio28 {

	public static void main(String[] args) {
		int popA = 80000;
		int popB = 2000000;
		int cont = 0;

		while (popA <= popB) {

			popA += (popA / 100) * 3;
			popB += (popB / 100) * 1.5;
			cont++;
		}

		System.out.println("PopA: " + popA);
		System.out.println("PopB: " + popB);
		System.out.println("Qtd anos: " + cont);
	}
}
