//
// Escreva um algoritmo que leia um número inteiro digitado pelo usuárioe retorne se
// ele é par ou ímpar
//

import java.util.Scanner;

public class Atividade05 {

	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);

		int numero = 0;

		System.out.println("Insira o número:");
		numero = input.nextInt();

		if(numero % 2 == 0) {
			System.out.println("O número "+numero+" é Par!");
		} else {
			System.out.println("O número "+numero+" é Impar!");
		}

	}

}