//
// 8) Anualmente uma empresa reajusta o salário dos seus funcionários aplicando ao seu salário
// bruto um percentual referente à inflação e ao crescimento real da mesma. Escreva um algoritmo
// onde o funcionário do departamento pessoal possa calcular o novo salário de cada um dos
// empregados.
//

import java.util.Scanner;

public class ReajusteSalario {
	
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		
		double salario = 0, aumento = 0, novoSalario = 0;
				
		System.out.println("Qual o Salário Atual do Funcionário:");
		salario = input.nextDouble();
		
		System.out.println("Quantos % deseja acrescentar ao salário do Funcionário:");
		aumento = input.nextDouble();
		
		novoSalario = ((salario*aumento)/100)+salario;
		
		System.out.println("O novo salário do Funcionário é de R$ "+novoSalario);
		
	}

}
