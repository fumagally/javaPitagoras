import java.util.Scanner;
public class Atividade0304_01 {
	public static void main (String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i <= 100; i++) {
			
			if(i % 2 != 0) {
				System.out.println("O n�mero "+i+" � impar!");
			}
			
		}
		
		input.close();
		
	}
}
