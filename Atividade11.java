import java.util.Scanner;

public class Atividade11 {
	
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		
		int num1 = 0, num2 = 0, num3 = 0, num4 = 0, maior = 0, menor = 0;
				
		System.out.println("Informe o Primeiro Número:");
		num1 = input.nextInt();
		
		System.out.println("Informe o Segundo Número:");
		num2 = input.nextInt();
		
		System.out.println("Informe o Terceiro Número:");
		num3 = input.nextInt();
		
		System.out.println("Informe o Quarto Número:");
		num4 = input.nextInt();
		
		if(num1 >= num2 && num1 >= num3 && num1 >= num4) {
			maior = num1;
		} else if(num2 >= num1 && num2 >= num3 && num2 >= num4) {
			maior = num2;
		} else if(num3 >= num1 && num3 >= num2 && num3 >= num4) {
			maior = num3;
		} else {
			maior = num4;
		}
		
		if(num1 <= num2 && num1 <= num3 && num1 <= num4) {
			menor = num1;
		} else if(num2 <= num1 && num2 <= num3 && num2 <= num4) {
			menor = num2;
		} else if(num3 <= num1 && num3 <= num2 && num3 <= num4) {
			menor = num3;
		} else {
			menor = num4;
		}
		
		System.out.println("O menor número informado é o "+menor+" e o maior é "+maior+"!");
		
	}

}