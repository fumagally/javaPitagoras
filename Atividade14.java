import java.util.Scanner;

public class Atividade14 {
	
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		
		String nomeAluno;
		double nota1 = 0, nota2 = 0, nota3 = 0, media = 0;
				
		System.out.println("Qual o Nome do Aluno:");
		nomeAluno = input.next();
		
		System.out.println("Qual a Nota da Primeira Prova:");
		nota1 = input.nextDouble();
		
		System.out.println("Qual a Nota da Segunda Prova:");
		nota2 = input.nextDouble();
		
		System.out.println("Qual a Nota da Terceira Prova:");
		nota3 = input.nextDouble();
		
		media = (nota1 + nota2 + nota3)/3;
		
		if(media >= 7) {
			System.out.println("O aluno "+nomeAluno+" está APROVADO!");
		} else {
			System.out.println("O aluno "+nomeAluno+" está REPROVADO!");
		}
		
	}

}
