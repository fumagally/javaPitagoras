import java.util.Scanner;

public class Atividade12 {
	
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		
		double salario = 0, aumento = 30, novoSalario = 0;
				
		System.out.println("Qual o Salário Atual do Funcionário:");
		salario = input.nextDouble();
		
		if(salario < 500) {
			novoSalario = ((salario*aumento)/100)+salario;
			System.out.println("O valor do novo salário do funcionário é R$ "+novoSalario+".");
		} else {
			System.out.println("O funcionário não tem direito ao aumento de salário!");
		}
		
		
		
	}

}
