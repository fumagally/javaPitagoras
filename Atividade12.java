import java.util.Scanner;

public class Atividade12 {
	
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		
		double salario = 0, aumento = 30, novoSalario = 0;
				
		System.out.println("Qual o Sal�rio Atual do Funcion�rio:");
		salario = input.nextDouble();
		
		if(salario < 500) {
			novoSalario = ((salario*aumento)/100)+salario;
			System.out.println("O valor do novo sal�rio do funcion�rio � R$ "+novoSalario+".");
		} else {
			System.out.println("O funcion�rio n�o tem direito ao aumento de sal�rio!");
		}
		
		
		
	}

}
