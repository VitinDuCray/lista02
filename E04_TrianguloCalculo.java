package lista02;

import java.util.Scanner;

public class E04_TrianguloCalculo {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calculadora de área e perímetro de um triângulo."
				+ "Qual tipo do triângulo: "
				+ "\n1 | Triângulo qualquer "
				+ "\n2 | Triângulo retângulo "
				+ "\n3 | Triângulo isósceles "
				+ "\n4 | Triângulo equilátero");
		int escolha = sc.nextInt();
		
		switch (escolha) {
		case 1:
			System.out.println("Digite o 1° lado: ");
			int triangulo1_lado1 = sc.nextInt();
			System.out.println("Digite o 2° lado: ");
			int triangulo1_lado2 = sc.nextInt();
			System.out.println("Digite o 3° lado: ");
			int triangulo1_lado3 = sc.nextInt();
			int triangulo1_triangulo2_perimetro = triangulo1_lado1 + triangulo1_lado2 + triangulo1_lado3;
			float semitriangulo2_perimetro = (triangulo1_lado1 + triangulo1_lado2 + triangulo1_lado3) / 2;
			float triangulo1_raiz = semitriangulo2_perimetro * (semitriangulo2_perimetro - triangulo1_lado1) * (semitriangulo2_perimetro - triangulo1_lado2) * (semitriangulo2_perimetro - triangulo1_lado3);
			double triangulo1_area = (Math.sqrt(triangulo1_raiz));
			System.out.println("A área do triângulo é: " + triangulo1_area + ".");
			System.out.println("O triangulo2_perimetro do triângulo é: " + triangulo1_triangulo2_perimetro + ".");
			break;
		case 2:
			System.out.println("Digite o 1° cateto: ");
			int triangulo2_cateto1 = sc.nextInt();
			System.out.println("Digite o 2° cateto: ");
			int triangulo2_cateto2 = sc.nextInt();
			float triangulo2_raiz = (triangulo2_cateto1 * triangulo2_cateto1) + (triangulo2_cateto2 * triangulo2_cateto2);
			double hipotenusa = (Math.sqrt(triangulo2_raiz));
			double triangulo2_perimetro = triangulo2_cateto1 + triangulo2_cateto2 + hipotenusa;
			int triangulo2_area = (triangulo2_cateto1 * triangulo2_cateto2) / 2;
			System.out.println("A área do triângulo é: " + triangulo2_area + ".");
			System.out.println("O perímetro do triângulo é: " + triangulo2_perimetro + ".");
			break;
		case 3:
			System.out.println("Digite o lado igual.");
			int triangulo3_ladoigual = sc.nextInt();
			System.out.println("Digite a base:");
			int triangulo3_base = sc.nextInt();
			int triangulo3_perimetro = (triangulo3_ladoigual * 2) + triangulo3_base;
			double alturapro0101 = (triangulo3_base / 2);
			double alturapro0102 = alturapro0101 * alturapro0101;
			double alturapro0201 = triangulo3_ladoigual * triangulo3_ladoigual;
			double alturapro0301 = alturapro0201 - alturapro0102;
			double alturafinal = (Math.sqrt(alturapro0301));
			double triangulo3_area = (triangulo3_base * alturafinal) / 2;
			System.out.println("A área do triângulo é: " + triangulo3_area + ".");
			System.out.println("O perímetro do triângulo é: " + triangulo3_perimetro + ".3");
			break;
		case 4:
			System.out.println("Digite o comprimento do lado do triângulo equilátero: ");
	        int triangulo4_lado = sc.nextInt();
	        int triangulo4_perimetro = 3 * triangulo4_lado;
	        double triangulo4_area = (Math.sqrt(3) / 4) * triangulo4_lado * triangulo4_lado;
	        System.out.println("A área do triângulo equilátero é: " + triangulo4_area + ".");
	        System.out.println("O perímetro do triângulo equilátero é: " + triangulo4_perimetro + ".");
			break;
		default:
			System.out.println("Opção Inválida! Tente de novo.");
			break;
			}
		sc.close();
	}
}

