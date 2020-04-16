import java.util.Scanner;

public class Atividade17 {
	
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		
		int qtdLivros = 0;
		double aValor = 0.25, aFixo = 7.5, bValor = 0.5, bFixo = 2.5, totalA = 0, totalB = 0;
		
		System.out.println("Quantos Livros você quer comprar?");
		qtdLivros = input.nextInt();
		
		totalA = (qtdLivros*aValor)+aFixo;
		totalB = (qtdLivros*bValor)+bFixo;
		
		if(totalA <= totalB) {
			System.out.println("O Critério A é a sua melhor opção! Você pagará um total de R$ "+totalA+" enquanto no Critério B você iria pagar um total de R$ "+totalB+"!");
		} else {
			System.out.println("O Critério B é a sua melhor opção! Você pagará um total de R$ "+totalB+" enquanto no Critério A você iria pagar um total de R$ "+totalA+"!");
		}		
		
	}

}
