//
// Escreva um algoritmo que leia um n�mero inteiro digitado pelo usu�rioe retorne se
// ele � par ou �mpar
//

import java.util.Scanner;

public class Atividade05 {

	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);

		int numero = 0;

		System.out.println("Insira o n�mero:");
		numero = input.nextInt();

		if(numero % 2 == 0) {
			System.out.println("O n�mero "+numero+" � Par!");
		} else {
			System.out.println("O n�mero "+numero+" � Impar!");
		}

	}

}