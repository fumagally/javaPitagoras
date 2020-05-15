import java.util.Scanner;
public class Atividade0805_03 {
	public static void main (String [] args ) {
		Scanner input = new Scanner(System.in);
		
		int qtdNumeros = 0;
		
		System.out.println("Digite a quantidade de números a serem digitados:");
		qtdNumeros = input.nextInt();
		
		int numeros[] = new int[qtdNumeros];

		for(int i = 0; i < qtdNumeros; i++){
			int y = i + 1;
			System.out.println("Digite o "+ y +"° número:");
			numeros[i] = input.nextInt();
		}
		
		System.out.println("Lista dos números inseridos em ordem descrecente:");
			
		for(int i = qtdNumeros-1; i >= 0; i--) {
			System.out.println(numeros[i]);
		}
		
		input.close();
	}

}