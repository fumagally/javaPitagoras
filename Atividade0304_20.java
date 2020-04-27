import java.util.Scanner;
import java.text.DecimalFormat;
public class Atividade0304_20 {

	public static void main (String [] args) {

		Scanner input = new Scanner(System.in);
		
		int contador = 1, outraSoma = 0, categoria = 0;
		double salarioAtual = 0, novoSalario = 0, valorReajuste = 0, totalReajusteFolha = 0, ajuste = 0;
		boolean rePerguntar = false;
		DecimalFormat valorOK = new DecimalFormat("#.##");
		
		while(contador > 0) {
			if(rePerguntar == false) {
				System.out.println("==================================================================");
				System.out.println("Digite a Categoria do(a) Funcionário(a):");
				System.out.println("------------------------------------------------------------------");
				System.out.println("1 - Gerente");
				System.out.println("2 - Analista");
				System.out.println("3 - Programador");
				System.out.println("4 - Administrativo");
				System.out.println("==================================================================");
				categoria = input.nextInt();
				
				System.out.println("==================================================================");
				System.out.println("Qual o Salário Atual do(a) Funcionário(a):");
				System.out.println("==================================================================");
				salarioAtual = input.nextDouble();
				
				switch(categoria) {
					case 1: ajuste = 5;
					break;
					case 2: ajuste = 6;
					break;
					case 3: ajuste = 10;
					break;
					case 4: ajuste = 3;
					break;
					default: ajuste = 0;
				}
				
				valorReajuste = (salarioAtual*ajuste)/100;
				novoSalario = salarioAtual + valorReajuste;
				
				totalReajusteFolha += valorReajuste;
				
				System.out.println("==================================================================");
				System.out.println("O novo salário do(a) Funcionário(a) é: R$ "+valorOK.format(novoSalario));
				System.out.println("==================================================================");
				
				rePerguntar = true;
			}
			if(rePerguntar == true) {
				System.out.println("Deseja efetuar outro reajuste? Digite > 1: Sim, 2: Não");
				System.out.println("------------------------------------------------------------------");
				outraSoma = input.nextInt();
				
				if(outraSoma != 1 && outraSoma != 2) {
					rePerguntar = true;
					contador = 1;
				}
			}
			if(outraSoma == 1) { contador = 1; rePerguntar = false; }
			if(outraSoma == 2) { contador = 0; }
		}
		
		System.out.println("==================================================================");
		System.out.println("O aumento na folha de pagamento da empresa foi de R$ "+valorOK.format(totalReajusteFolha));
		System.out.println("==================================================================");
		input.close();
	}
}