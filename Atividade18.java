import java.util.Scanner;

public class Atividade18 {
	
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		
		String nomeFuncionario, cargo;
		double salarioAtual = 0, novoSalario = 0;
		int tempoCasa = 0, reajuste = 0;
		
		System.out.println("Insira o Nome do Funcionário:");
		nomeFuncionario = input.next();
		
		System.out.println("Insira o Salário Atual do Funcionário:");
		salarioAtual = input.nextDouble();
		
		System.out.println("Qual o Cargo do Funcionário? (Gerente, Analista ou Programador)");
		cargo = input.next();
		
		System.out.println("Qual o temnpo de casa (em meses) do Funcionário?");
		tempoCasa = input.nextInt();
		
		if(cargo.equalsIgnoreCase("Gerente") || cargo.equalsIgnoreCase("Analista") || cargo.equalsIgnoreCase("Programador")) {
			if(cargo.equalsIgnoreCase("Gerente")){
				if(tempoCasa <= 12) { reajuste = 3; }
				if(tempoCasa >= 13 && tempoCasa <= 24) { reajuste = 5; }
				if(tempoCasa > 24) { reajuste = 8; }
			}
			if(cargo.equalsIgnoreCase("Analista")){
				if(tempoCasa <= 12) { reajuste = 4; }
				if(tempoCasa >= 13 && tempoCasa <= 24) { reajuste = 6; }
				if(tempoCasa > 24) { reajuste = 8; }
			}
			if(cargo.equalsIgnoreCase("Programador")){
				if(tempoCasa <= 12) { reajuste = 5; }
				if(tempoCasa >= 13 && tempoCasa <= 24) { reajuste = 7; }
				if(tempoCasa > 24) { reajuste = 10; }
			}
			
			novoSalario = ((salarioAtual*reajuste)/100)+salarioAtual;
			System.out.println("O novo salário do "+nomeFuncionario+" ("+cargo+") é de R$ "+novoSalario+"! Anteriormente era de R$ "+salarioAtual+".");
			
		} else {
			System.out.println("O cargo informado não faz parte de nosso quadro de funcionários!");
		}
		
	}

}
