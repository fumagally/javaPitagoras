import java.util.Scanner;
public class Atividade0304_12 {

	public static void main (String [] args) {

		Scanner input = new Scanner(System.in);
		
		int inicio = 1, maior = 0, menor = 0, numero = 0;
		
		while(inicio <= 100) {
			System.out.println("Insira um Número:");
			numero = input.nextInt();
			
			if(inicio == 1) { maior = numero; menor = numero; }
			
			if(numero >= maior) { maior = numero; }
			if(numero <= menor) { menor = numero; }
			
			inicio++;
		}
		System.out.println("O maior número informado é o: "+maior);
		System.out.println("O menor número informado é o: "+menor);
		input.close();
	}
}