import java.util.Scanner;
public class Atividade0304_13 {

	public static void main (String [] args) {

		Scanner input = new Scanner(System.in);
		
		double inicio = 1, numero = 0, somaPositivos = 0, qtdNegativos = 0, somaTodos = 0, media = 0;
		
		while(inicio <= 100) {
			System.out.println("Insira um Número:");
			numero = input.nextInt();
			
			if(numero > 0) {
				somaPositivos += numero;
			}
			
			if(numero < 0) {
				qtdNegativos++;
			}
			
			somaTodos += numero;
			
			inicio++;
		}
		
		media = somaTodos/100;
		
		System.out.println("Soma dos Positivos: "+somaPositivos);
		System.out.println("Quantidade de Negativos: "+qtdNegativos);
		System.out.println("Média: "+media);
		input.close();
	}
}