import java.util.Scanner;
import java.text.DecimalFormat;
public class Atividade0304_18 {

	public static void main (String [] args) {

		Scanner input = new Scanner(System.in);
		
		int contador = 1, outraSoma = 0, qtd = 0, somaQtd = 0;
		double valor = 0, somaValor = 0;
		boolean rePerguntar = false;
		DecimalFormat valorOK = new DecimalFormat("#.##");
		
		while(contador > 0) {
			if(rePerguntar == false) {
				System.out.println("Qual a quantidade do item:");
				qtd = input.nextInt();
				
				System.out.println("Qual o valor do item:");
				valor = input.nextDouble();
				
				somaQtd += qtd;
				somaValor += qtd*valor;
				
				rePerguntar = true;
			}
			if(rePerguntar == true) {
				System.out.println("Deseja informar outro item? Digite > 1: Sim, 2: Não");
				outraSoma = input.nextInt();
				
				if(outraSoma != 1 && outraSoma != 2) {
					rePerguntar = true;
					contador = 1;
				}
			}
			if(outraSoma == 1) { contador = 1; rePerguntar = false; }
			if(outraSoma == 2) { contador = 0; }
		}
		
		System.out.println("Seu estoque possui "+somaQtd+" itens, com o valor total de R$ "+valorOK.format(somaValor));
		input.close();
	}
}