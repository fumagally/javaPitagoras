import java.util.Scanner;
public class Atividade0304_10 {

	public static void main (String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		int i = 0, soma = 0;
		
		while(i <= 1000) {
			if(i % 5 == 0) {
				soma += i;
			}
			i++;
		}
		System.out.println("A soma dos divisíveis por 5 de 0 a 1000 é: "+soma);
		input.close();
	}

}