import java.util.Scanner;
public class Atividade0304_14 {

	public static void main (String [] args) {

		Scanner input = new Scanner(System.in);
		
		int numero = 0, qtdPares = 0;
		
		while(numero >= 0){
			System.out.println("Insira um N�mero:");
			numero = input.nextInt();
			
			if(numero % 2 == 0) {
				qtdPares++;
			}
		}
		
		System.out.println("Quantidade de N�meros Pares: "+qtdPares);
		input.close();
	}
}