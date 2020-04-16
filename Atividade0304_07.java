import java.util.Scanner;
public class Atividade0304_07 {

	public static void main (String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		int i = 0, quantidade = 150, numero = 0, soma = 0, media = 0;
		
		for(i = 1; i <= 50; i++) {
			System.out.println("("+i+") Insira o Número: ");
			numero = input.nextInt();
			soma += numero;
		}
		
		while(i <= 100) {
			System.out.println("("+i+") Insira o Número: ");
			numero = input.nextInt();
			soma += numero;
			i++;
		}
		
		do {
			System.out.println("("+i+") Insira o Número: ");
			numero = input.nextInt();
			soma += numero;
			i++;
		} while(i <= 150);
		
		media = soma/quantidade;
		System.out.println("A soma dos números é: "+soma+". A média entre eles é de: "+media+".");
		
		input.close();
		
	}
	
}
