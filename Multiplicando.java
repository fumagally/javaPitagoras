//
// Calcular o valor total informando o pre�o e quantidade.
//

import java.util.Scanner;

public class Multiplicando {
	
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		
		int qtd;
		double preco, total;
		
		System.out.println("Informe o pre�o:");
		preco = input.nextDouble();
		
		System.out.println("Informe a Quantidade:");
		qtd = input.nextInt();
		
		total = preco * qtd;
		System.out.println("O Valor Total � de: "+total);
		
	}

}
