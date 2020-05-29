import java.util.Scanner;
public class Atividade0805_01 {
	public static void main (String [] args ) {
		Scanner input = new Scanner(System.in);

		int qtdNomes = 3;

		String nomes[] = new String[qtdNomes];

		for(int i = 0; i < qtdNomes; i++){
			int y = i + 1;
			System.out.println("Digite o "+ y +"° nome:");
			nomes[i] = input.next();
		}

		System.out.println("Lista dos nomes inseridos");

		for(int i = 0; i < qtdNomes; i++) {
			System.out.println(nomes[i]);
		}

		input.close();
	}

}