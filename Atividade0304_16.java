import java.util.Scanner;
public class Atividade0304_16 {

	public static void main (String [] args) {

		Scanner input = new Scanner(System.in);
		
		int contador = 1, outraSoma = 0;
		double numA = 0, numB = 0, soma = 0;
		boolean rePerguntar = false; 
		
		while(contador > 0) {
			if(rePerguntar == false) {
				System.out.println("Insira o Primeiro Número:");
				numA = input.nextInt();
				
				System.out.println("Insira o Segundo Número:");
				numB = input.nextInt();
				soma = numA + numB;
				
				System.out.println("A Soma dos dois números é: "+soma);
				rePerguntar = true;
			}
			if(rePerguntar == true) {
				System.out.println("Deseja efetuar outra soma? Digite > 1: Sim, 2: Não");
				outraSoma = input.nextInt();
				
				if(outraSoma != 1 && outraSoma != 2) {
					rePerguntar = true;
					contador = 1;
				}
			}
			if(outraSoma == 1) { contador = 1; rePerguntar = false; }
			if(outraSoma == 2) { contador = 0; }
		}
		
		System.out.println("Obrigado e volte sempre!");
		input.close();
	}
}