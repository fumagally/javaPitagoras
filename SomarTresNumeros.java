//
// 1) Escreva um algoritmo para somar três núemros e mostrar o resultado.
//

import java.util.Scanner;

public class SomarTresNumeros {
	
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		
		double num1 = 0, num2 = 0, num3 = 0, total = 0;
				
		System.out.println("Informe o Primeiro Número:");
		num1 = input.nextDouble();
		
		System.out.println("Informe o Segundo Número:");
		num2 = input.nextDouble();
		
		System.out.println("Informe o Terceiro Número:");
		num3 = input.nextDouble();
				
		total = num1 + num2 + num3;
		
		System.out.println("A soma dos três números é de: "+total+"!");
		
	}

}