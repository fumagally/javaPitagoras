import java.util.Scanner;

public class Atividade19 {

	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);

		double nota1 = 0, nota2 = 0, nota3 = 0, mediaFrequencia = 0, mediaNotas = 0, mediaNormal = 0, notaExameEspecial = 0, novaMedia = 0;
		int aulas = 0, faltas = 0;

		System.out.println("Qual a quantidade de Aulas:");
		aulas = input.nextInt();

		if(aulas > 0) {

			System.out.println("Qual a quantidade de Faltas do Aluno:");
			faltas = input.nextInt();

			if(faltas > aulas) {
				System.out.println("O número de Faltas não pode ser superior oa número de Aulas!");
			} else {

				System.out.println("Qual a Nota da Primeira Prova (0 a 10):");
				nota1 = input.nextDouble();

				System.out.println("Qual a Nota da Segunda Prova (0 a 10):");
				nota2 = input.nextDouble();

				System.out.println("Qual a Nota da Terceira Prova (0 a 10):");
				nota3 = input.nextDouble();

				if(nota1 <= 10 && nota1 >= 0 && nota2 <= 10 && nota2 >= 0 && nota3 <= 10 && nota3 >= 0) {

					mediaFrequencia = (faltas*100)/aulas; // % de presença do aluno nas aulas

					if(mediaFrequencia >= 25) {
						System.out.println("Aluno REPROVADO por frequência!");
					} else {
						mediaNormal = (nota1 + nota2 + nota3)/3;
						mediaNotas = (mediaNormal*100)/10;
						if(mediaNotas >= 70) {
							System.out.println("Aluno APROVADO!");
						} else {
							System.out.println("Aluno com menos de 70% nas avaliações! É necessário realizar o Exame Especial.");
							System.out.println("Qual a Nota do Exame Especial do Aluno (0 a 10):");
							notaExameEspecial = input.nextDouble();

							if(notaExameEspecial <= 10 && notaExameEspecial >= 0) {

								novaMedia = ((mediaNormal + notaExameEspecial)/2)*10;
								if(novaMedia >= 70) {
									System.out.println("Aluno APROVADO após Exame Especial!");
								} else {
									System.out.println("Aluno REPROVADO por nota!");
								}

							} else {
								System.out.println("A nota do Exame Especial deve ser informada entre 0 e 10!");
							}
						}
					}

				} else {
					System.out.println("Todas as notas devem ser informadas entre 0 e 10!");
				} // validação notas
			} // validação faltas
		} else {
			System.out.println("A quantidade de aulas deve ser maior que 0!");
		} // validação aulas

	}

}
