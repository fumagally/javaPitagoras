import java.util.Scanner;

public class Atividade09 {
	
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		
		int num1 = 0, num2 = 0, num3 = 0;
				
		System.out.println("Informe o Primeiro Número:");
		num1 = input.nextInt();
		
		System.out.println("Informe o Segundo Número:");
		num2 = input.nextInt();
		
		System.out.println("Informe o Terceiro Número:");
		num3 = input.nextInt();
		
		if(num1 < num2) {
			if(num2 < num3) {
				System.out.println("A ordem crescente é: "+num1+", "+num2+" e "+num3+"!");
			} else if(num1 < num3) {
				System.out.println("A ordem crescente é: "+num1+", "+num3+" e "+num2+"!");
			} else {
				System.out.println("A ordem crescente é: "+num3+", "+num1+" e "+num2+"!");
			}
		} else if(num2 < num3) {
			if(num1 < num3) {
				System.out.println("A ordem crescente é: "+num2+", "+num1+" e "+num3+"!");
			} else {
				System.out.println("A ordem crescente é: "+num2+", "+num3+" e "+num1+"!");
			}
		} else {
			System.out.println("A ordem crescente é: "+num3+", "+num2+" e "+num1+"!");
		}
		
	}

}