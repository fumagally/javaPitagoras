import java.util.Scanner;

public class Atividade02 {

	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);

		int numero1 = 0, numero2 = 0;

		System.out.println("Insira o primeiro número:");
		numero1 = input.nextInt();

		System.out.println("Insira o segundo número:");
		numero2 = input.nextInt();
		
		if(numero1 > numero2) {
			System.out.println("O maior número é o "+numero1);
		} else if(numero2 > numero1) {
			System.out.println("O maior número é o "+numero2);
		} else {
			System.out.println("Os dois números informados são iguais. Você informou o número "+numero1+"!");
		}

	}

}