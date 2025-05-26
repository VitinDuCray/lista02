package lista02;

import java.util.Scanner;

public class E09_CalculoPotencia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calculadora de Potência.");
		System.out.println("Digite o número base:");
		int base = sc.nextInt();
		System.out.println("Digite o número expoente:");
		int expoente = sc.nextInt();
		double potencia = Math.pow(base, expoente);
		System.out.println("A potência é: " + potencia + ".");
		sc.close();
	}
}
