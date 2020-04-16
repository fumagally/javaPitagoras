import java.util.Scanner;

public class Atividade15 {
	
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		
		double preco = 0, novoValor = 0;
		int desconto = 0;
				
		System.out.println("Qual o valor da peça de roupa:");
		preco = input.nextDouble();
		
		if(preco <= 50) { desconto = 0; }
		if(preco > 50 && preco <= 100) { desconto = 1; }
		if(preco > 100 && preco <= 150) { desconto = 2; }
		if(preco > 150) { desconto = 5; }
		
		if(preco <= 50) {
			System.out.println("O valor líquido da peça de roupa é de R$ "+preco);
		} else {
			novoValor = preco-((preco*desconto)/100);
			System.out.println("O valor líquido da peça de roupa é de R$ "+novoValor);
		}
		
	}

}
