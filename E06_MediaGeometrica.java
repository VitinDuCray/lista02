package lista02;

import java.util.Scanner;

public class E06_MediaGeometrica {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Calculadora de Média Geométrica.");
		System.out.println("Digite o primeiro valor: ");
		int valor1 = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		int valor2 = sc.nextInt();
		System.out.println("Digite o terceiro valor: ");
		int valor3 = sc.nextInt();
		int valores = valor1 * valor2 * valor3;
		float mediageometrica = (float) Math.cbrt(valores);
		System.out.println("dada" + mediageometrica + ".");
		sc.close();
	}
}
