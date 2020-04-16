import java.util.Scanner;

public class Atividade13 {
	
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		
		double salarioBruto = 0, valorAliquota = 0, beneficios = 0, salarioLiquido = 0;
		int inssAliquota = 0, valorMaximoInss = 354;
				
		System.out.println("Qual o Sal�rio Bruto do Funcion�rio:");
		salarioBruto = input.nextDouble();
		
		System.out.println("Insira o valor dos Benef�cios:");
		beneficios = input.nextDouble();
		
		if(salarioBruto <= 965) { inssAliquota = 8; }
		if(salarioBruto > 965 && salarioBruto <= 1609) { inssAliquota = 9; }
		if(salarioBruto > 1609) { inssAliquota = 11; }
		
		valorAliquota = ((salarioBruto*inssAliquota)/100);
		
		if(valorAliquota <= valorMaximoInss) {
			salarioLiquido = salarioBruto + beneficios + valorAliquota;
			System.out.println("O Sal�rio l�quido do Funcion�rio � de R$ "+salarioLiquido);
		} else {
			salarioLiquido = salarioBruto + beneficios - valorMaximoInss;
			System.out.println("O Sal�rio l�quido do Funcion�rio � de R$ "+salarioLiquido);
		}
		
	}

}
