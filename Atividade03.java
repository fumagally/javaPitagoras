//
// 3) Escreva um algoritmo que leia tr�s n�meros inteiros e mostre o maior deles. Se os n�meros
// forem iguais, qualquer um pode ser mostrado.
//

import java.util.Scanner;

public class Atividade03 {

	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);

		int numero1 = 0, numero2 = 0, numero3 = 0, maior = 0;

		System.out.println("Insira o Primeiro N�mero:");
		numero1 = input.nextInt();
		
		System.out.println("Insira o Segundo N�mero:");
		numero2 = input.nextInt();
		
		System.out.println("Insira o Terceiro N�mero:");
		numero3 = input.nextInt();

		if(numero1 >= numero2) {
			maior = numero1;
		} else {
			maior = numero2;
		}
		
		if(maior <= numero3) {
			maior = numero3;
		}
		
		System.out.println("O maior n�mero informado foi o: "+maior);

	}

}
