package lista02;

import java.util.Scanner;

public class E01_MediaPonderada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos descobrir qual sua média ponderada.");
        System.out.println("Digite sua nota 1: ");
        float nota1 = sc.nextFloat();
        System.out.println("Qual o peso da nota 1?");
        float peso1 = sc.nextFloat();
        System.out.println("Digite sua nota 2: ");
        float nota2 = sc.nextFloat();
        System.out.println("Qual o peso da nota 2?");
        float peso2 = sc.nextFloat();
        System.out.println("Digite sua nota 3: ");
        float nota3 = sc.nextFloat();
        System.out.println("Qual o peso da nota 3?");
        float peso3 = sc.nextFloat();
        float notaPonderada1 = nota1 * peso1; 
        float notaPonderada2 = nota2 * peso2;
        float notaPonderada3 = nota3 * peso3;
        float somaNotasPonderadas = notaPonderada1 + notaPonderada2 + notaPonderada3;
        float somaPesos = peso1 + peso2 + peso3;
        float resultado = somaNotasPonderadas / somaPesos;
        System.out.println("O resultado da média ponderada é: " + resultado);

        sc.close();
    }
}
