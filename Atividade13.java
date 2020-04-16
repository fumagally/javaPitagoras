import java.util.Scanner;

public class Atividade13 {
	
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		
		double salarioBruto = 0, valorAliquota = 0, beneficios = 0, salarioLiquido = 0;
		int inssAliquota = 0, valorMaximoInss = 354;
				
		System.out.println("Qual o Salário Bruto do Funcionário:");
		salarioBruto = input.nextDouble();
		
		System.out.println("Insira o valor dos Benefícios:");
		beneficios = input.nextDouble();
		
		if(salarioBruto <= 965) { inssAliquota = 8; }
		if(salarioBruto > 965 && salarioBruto <= 1609) { inssAliquota = 9; }
		if(salarioBruto > 1609) { inssAliquota = 11; }
		
		valorAliquota = ((salarioBruto*inssAliquota)/100);
		
		if(valorAliquota <= valorMaximoInss) {
			salarioLiquido = salarioBruto + beneficios + valorAliquota;
			System.out.println("O Salário líquido do Funcionário é de R$ "+salarioLiquido);
		} else {
			salarioLiquido = salarioBruto + beneficios - valorMaximoInss;
			System.out.println("O Salário líquido do Funcionário é de R$ "+salarioLiquido);
		}
		
	}

}
