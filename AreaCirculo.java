//
// 3) Escreva um algoritmo que calcule a �rea de um c�rculo  e mostre o resultado. A f�rmula
// para fazer o c�lculo � A = Pi . r�.
//

import java.util.Scanner;

public class AreaCirculo {
	
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		
		double pi = 3.14, raio = 0, area = 0;
				
		System.out.println("Informe o Raio do C�rculo:");
		raio = input.nextDouble();
		
		area = pi * (raio*raio);
		
		System.out.println("A �rea do C�rculo � de: "+area+"!");
		
	}

}