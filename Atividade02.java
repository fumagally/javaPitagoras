import java.util.Scanner;

public class Atividade02 {

	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);

		int numero1 = 0, numero2 = 0;

		System.out.println("Insira o primeiro n�mero:");
		numero1 = input.nextInt();

		System.out.println("Insira o segundo n�mero:");
		numero2 = input.nextInt();
		
		if(numero1 > numero2) {
			System.out.println("O maior n�mero � o "+numero1);
		} else if(numero2 > numero1) {
			System.out.println("O maior n�mero � o "+numero2);
		} else {
			System.out.println("Os dois n�meros informados s�o iguais. Voc� informou o n�mero "+numero1+"!");
		}

	}

}