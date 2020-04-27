import java.util.Scanner;
public class Atividade0304_08 {

	public static void main (String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		int i = 0, inicio = 0, fim = 0, soma = 0;
		
		System.out.println("Insira o ínicio do intervalo:");
		inicio = input.nextInt();
		
		System.out.println("Insira o fim do intervalo:");
		fim = input.nextInt();
		
		for(i = inicio; i <= fim; i++) {
			soma += i;
		}
		
		System.out.println("A soma do intervalo é de: "+soma);
		input.close();
	}

}