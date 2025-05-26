package lista02;

import java.util.Scanner;

public class E03_ConversorMoedas {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Conversor de Moedas");
		
		System.out.println("Digite o valor que deseja converter : ");
		float real =sc.nextFloat();
		System.out.println("Digite o valor do dollar virgente : ");
		float dollar =sc.nextFloat();
		System.out.println("Digite o valor do euro virgente : ");
		float euro =sc.nextFloat();
		System.out.println("Digite o valor da libra virgente : ");
		float libra =sc.nextFloat();
		
		float conversorDollar = real/dollar;
		float conversorEuro = real/euro;
		float conversorLibra = real/libra;
		
		System.out.printf("O valor convertido em dollar é : US$%f\n",conversorDollar);
		System.out.printf("O valor convertido em euro é : EUR%f\n",conversorEuro);
		System.out.printf("O valor convertido em libra é : GBP%f\n",conversorLibra);
		sc.close();
		
	}

}