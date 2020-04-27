import java.util.Scanner;
public class Atividade0304_02 {
	
	public static void main (String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		int i = 0;
		while(i <= 100) {
			if(i % 2 != 0) {
				System.out.println("O número "+i+" é ímpar!");
			}
			i++;
		}
		input.close();
	}

}
