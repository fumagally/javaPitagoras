//
// 3) Escreva um algoritmo que calcule a área de um círculo  e mostre o resultado. A fórmula
// para fazer o cálculo é A = Pi . r².
//

import java.util.Scanner;

public class AreaCirculo {
	
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		
		double pi = 3.14, raio = 0, area = 0;
				
		System.out.println("Informe o Raio do Círculo:");
		raio = input.nextDouble();
		
		area = pi * (raio*raio);
		
		System.out.println("A Área do Círculo é de: "+area+"!");
		
	}

}