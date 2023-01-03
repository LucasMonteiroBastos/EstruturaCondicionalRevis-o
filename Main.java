import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Fazer um programa para ler um número inteiro, e depois dizer se este número é
		// negativo ou não.

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		if (n >= 0) {
			System.out.println("NÃO NEGATIVO");
		} else {
			System.out.println("NEGATIVO");
		}

	}

}
