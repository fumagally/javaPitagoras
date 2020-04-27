//
// 4) Faça um algoritmo em que o usuário digite sua idade em anos e o algoritmo calcule e mostre
// a idade em dias (desconsidere anos bissextos)
//

import java.util.Scanner;

public class IdadeEmDias {
	
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		
		int idade = 0, viveu = 0;
				
		System.out.println("Informe sua Idade:");
		idade = input.nextInt();
				
		viveu = idade * 365;
		
		System.out.println("Você já viveu: "+viveu+" dias!");
		
	}

}
