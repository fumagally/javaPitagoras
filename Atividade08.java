import java.util.Scanner;

public class Atividade08 {

	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);

		int x = 0, y= 0, resto = 0, parteInteira = 0;
		
		System.out.println("Insira o N�mero X:");
		x = input.nextInt();
		
		System.out.println("Insira o N�mero Y:");
		y = input.nextInt();
		
		if(y > 0) {
			parteInteira = x/y;
			resto = x % y;
			System.out.println("O quociente inteiro da divis�o � "+parteInteira+" e o resto da divis�o � "+resto+"!");
		} else {
			System.out.println("N�o � poss�vel realizar a divis�o porque Y � menor ou igual a 0!");
		}

	}

}