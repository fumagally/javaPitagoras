import java.util.Scanner;

public class Atividade08 {

	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);

		int x = 0, y= 0, resto = 0, parteInteira = 0;
		
		System.out.println("Insira o Número X:");
		x = input.nextInt();
		
		System.out.println("Insira o Número Y:");
		y = input.nextInt();
		
		if(y > 0) {
			parteInteira = x/y;
			resto = x % y;
			System.out.println("O quociente inteiro da divisão é "+parteInteira+" e o resto da divisão é "+resto+"!");
		} else {
			System.out.println("Não é possível realizar a divisão porque Y é menor ou igual a 0!");
		}

	}

}