import java.util.Scanner;
public class Atividade0304_11 {

	public static void main (String [] args) {

		Scanner input = new Scanner(System.in);
		
		int valorN = 0;
		double i = 0, somaX = 0, x = 0;
		
		System.out.println("Insira o valor de N:");
		valorN = input.nextInt();
		
		if(valorN < 10) {
			System.out.println("O valor de N deve ser maior que 10!");
		} else {
			for(i = 1; i <= valorN; i++) {
				somaX += 1 / i;
			}
			x = 1 + somaX;
			System.out.println("O valor de X é "+x+"!");
		}
		input.close();
	}

}
