//
// 1) Escreva um algoritmo para somar tr�s n�emros e mostrar o resultado.
//

import java.util.Scanner;

public class SomarTresNumeros {
	
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		
		double num1 = 0, num2 = 0, num3 = 0, total = 0;
				
		System.out.println("Informe o Primeiro N�mero:");
		num1 = input.nextDouble();
		
		System.out.println("Informe o Segundo N�mero:");
		num2 = input.nextDouble();
		
		System.out.println("Informe o Terceiro N�mero:");
		num3 = input.nextDouble();
				
		total = num1 + num2 + num3;
		
		System.out.println("A soma dos tr�s n�meros � de: "+total+"!");
		
	}

}