//
// 5) O resultado final de um aluno corresponde à média aritmética das três avaliações que ele faz
// durante o semestre, cada uma delas valendo 10 pontos. Escreva um algoritmo que calcule e mostre
// o resultado final de um aluno.
//

import java.util.Scanner;

public class MediaAluno {
	
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		
		double nota1 = 0, nota2 = 0, nota3 = 0, media = 0;
				
		System.out.println("Informe sua Nota da Primeira Prova:");
		nota1 = input.nextDouble();
		
		System.out.println("Informe sua Nota da Segunda Prova:");
		nota2 = input.nextDouble();
		
		System.out.println("Informe sua Nota da Terceira Prova:");
		nota3 = input.nextDouble();
		
		media = (nota1 + nota2 + nota3)/3;
		
		System.out.println("Sua Média foi de: "+media+"!");
		
	}

}