//
// 2) Escreva um algoritmo que leia um número inteiro digitado pelo usuário e retorne se ele é
// negativo, positivo ou neutro (zero).
//

import java.util.Scanner;

public class Atividade06 {

	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);

		int numero = 0;

		System.out.println("Insira o número:");
		numero = input.nextInt();

		if(numero > 0) {
			System.out.println("O número "+numero+" é Positivo!");
		} else if(numero < 0) {
			System.out.println("O número "+numero+" é Negativo!");
		} else {
			System.out.println("O número "+numero+" é Neutro!");
		}

	}

}
