//
// 8) Anualmente uma empresa reajusta o sal�rio dos seus funcion�rios aplicando ao seu sal�rio
// bruto um percentual referente � infla��o e ao crescimento real da mesma. Escreva um algoritmo
// onde o funcion�rio do departamento pessoal possa calcular o novo sal�rio de cada um dos
// empregados.
//

import java.util.Scanner;

public class ReajusteSalario {
	
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		
		double salario = 0, aumento = 0, novoSalario = 0;
				
		System.out.println("Qual o Sal�rio Atual do Funcion�rio:");
		salario = input.nextDouble();
		
		System.out.println("Quantos % deseja acrescentar ao sal�rio do Funcion�rio:");
		aumento = input.nextDouble();
		
		novoSalario = ((salario*aumento)/100)+salario;
		
		System.out.println("O novo sal�rio do Funcion�rio � de R$ "+novoSalario);
		
	}

}
