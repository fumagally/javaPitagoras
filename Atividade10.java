//
// Escreva um algoritmo que leia o primeiro nome de duas pessoas e
// informe se elas s�o xar�s ou n�o.
//

import java.util.Scanner;

public class Atividade10 {

	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);

		String nome1, nome2;

		System.out.println("Insira um Nome:");
		nome1 = input.next();
		
		System.out.println("Insira outro Nome:");
		nome2 = input.next();

		if(nome1.equalsIgnoreCase(nome2)) {
			System.out.println("Os dois s�o xar�s!");
		} else {
			System.out.println("Os dois n�o s�o xar�s!");
		}

	}

}