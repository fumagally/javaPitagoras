import java.util.Scanner;

public class Atividade07 {
	
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		
		double num1 = 0, num2 = 0, resultado = 0;
				
		System.out.println("Informe o Primeiro Número:");
		num1 = input.nextDouble();
		
		System.out.println("Informe o Segundo Número:");
		num2 = input.nextDouble();
		
		if(num1 >= 0 && num2 >= 0) {
			
			if(num1 > num2) {
				resultado = num1-num2;
				System.out.println("O resultado da subtração do primeiro e segundo número informado é: "+resultado);
			} else {
				resultado = num2-num1;
				System.out.println("O resultado da subtração do segundo e primeiro número informado é: "+resultado);
			}
			
		} else if(num1 < 0) {
			System.out.println("O primeiro número informado é menor que zero!");
		} else if(num2 < 0) {
			System.out.println("O segundo número informado é menor que zero!");
		}
		
		
	}

}