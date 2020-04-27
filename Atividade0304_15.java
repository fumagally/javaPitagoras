import java.util.Scanner;
public class Atividade0304_15 {

	public static void main (String [] args) {

		Scanner input = new Scanner(System.in);
		
		int qtdPositivos = 1, numero = 0, qtdMultiplos = 0;
		
		while(qtdPositivos <= 5){
			System.out.println("(#"+qtdPositivos+") Insira um Número Inteiro:");
			numero = input.nextInt();
			
			if(numero % 3 == 0 && numero > 0) {
				qtdMultiplos++;
				qtdPositivos++;
			} else if(numero > 0) {
				qtdPositivos++;
			} else if(numero < 0) {
				System.out.println("O número informado é negativo, informe um número positivo!");
			}
		}
		
		System.out.println("Quantidade de Números Múltiplos de 3: "+qtdMultiplos);
		input.close();
	}
}