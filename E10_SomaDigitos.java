package lista02;

import java.util.Scanner;

public class E10_SomaDigitos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero inteiro:");
		int numero = sc.nextInt();
		
		int soma = 0;
		int numeroAbsoluto = Math.abs(numero);
		
		while (numeroAbsoluto > 0) {
			soma += numeroAbsoluto % 10;
			numeroAbsoluto /= 10;
		}
		
		System.out.println("A soma dos dígitos é: " + soma);
		
		sc.close();
	}

}
