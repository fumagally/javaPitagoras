//
// 2) Escreva um algoritmo que leia um n�mero inteiro digitado pelo usu�rio e retorne se ele �
// negativo, positivo ou neutro (zero).
//

import java.util.Scanner;

public class Atividade06 {

	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);

		int numero = 0;

		System.out.println("Insira o n�mero:");
		numero = input.nextInt();

		if(numero > 0) {
			System.out.println("O n�mero "+numero+" � Positivo!");
		} else if(numero < 0) {
			System.out.println("O n�mero "+numero+" � Negativo!");
		} else {
			System.out.println("O n�mero "+numero+" � Neutro!");
		}

	}

}
