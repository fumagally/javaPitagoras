import java.util.Scanner;
public class Atividade0304_03 {

	public static void main (String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		int i = 0;
		
		do {
			if(i % 2 != 0) {
				System.out.println("O número "+i+" é ímpar!");
			}
			i++;
		} while(i <= 100);
		
		input.close();
		
	}
	
}
