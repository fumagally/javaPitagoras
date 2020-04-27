//
// 3) Escreva um algoritmo que leia três números inteiros e mostre o maior deles. Se os números
// forem iguais, qualquer um pode ser mostrado.
//

import java.util.Scanner;

public class Atividade03 {

	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);

		int numero1 = 0, numero2 = 0, numero3 = 0, maior = 0;

		System.out.println("Insira o Primeiro Número:");
		numero1 = input.nextInt();
		
		System.out.println("Insira o Segundo Número:");
		numero2 = input.nextInt();
		
		System.out.println("Insira o Terceiro Número:");
		numero3 = input.nextInt();

		if(numero1 >= numero2) {
			maior = numero1;
		} else {
			maior = numero2;
		}
		
		if(maior <= numero3) {
			maior = numero3;
		}
		
		System.out.println("O maior número informado foi o: "+maior);

	}

}
