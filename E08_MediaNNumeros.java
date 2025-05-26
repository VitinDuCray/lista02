package lista02;

import java.util.Scanner;

public class E08_MediaNNumeros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos números você irá inserir:");
		int base = sc.nextInt();
		
		double somaNumeros = 0;
		
		for (int contador = 1; contador <= base; contador++) {
			System.out.println("Digite o número " + contador + ": ");
			double numero = sc.nextDouble();
			somaNumeros += numero;
		}
		
		double media = somaNumeros / base;
		System.out.println("A média dos " + base + " números inseridos é: " + media + ".");
		
		sc.close();
	}
}