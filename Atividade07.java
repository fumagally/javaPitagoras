import java.util.Scanner;

public class Atividade07 {
	
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		
		double num1 = 0, num2 = 0, resultado = 0;
				
		System.out.println("Informe o Primeiro N�mero:");
		num1 = input.nextDouble();
		
		System.out.println("Informe o Segundo N�mero:");
		num2 = input.nextDouble();
		
		if(num1 >= 0 && num2 >= 0) {
			
			if(num1 > num2) {
				resultado = num1-num2;
				System.out.println("O resultado da subtra��o do primeiro e segundo n�mero informado �: "+resultado);
			} else {
				resultado = num2-num1;
				System.out.println("O resultado da subtra��o do segundo e primeiro n�mero informado �: "+resultado);
			}
			
		} else if(num1 < 0) {
			System.out.println("O primeiro n�mero informado � menor que zero!");
		} else if(num2 < 0) {
			System.out.println("O segundo n�mero informado � menor que zero!");
		}
		
		
	}

}