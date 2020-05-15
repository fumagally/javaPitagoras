import java.util.Scanner;
public class Atividade0805_05 {
	public static void main (String [] args ) {
		Scanner input = new Scanner(System.in);
		
		int qtdNumeros = 5, busca = 0, encontrados = 0;
		int numeros[] = new int[qtdNumeros];
		
		for(int i = 0; i < qtdNumeros; i++){
			int y = i + 1;
			System.out.println("Digite o "+ y +"° número:");
			numeros[i] = input.nextInt();
		}
		
		System.out.println("Insira o núemro que deseja buscar entre os digitados:");
		busca = input.nextInt();
			
		for(int i = 0; i < qtdNumeros; i++) {
			if(numeros[i] == busca) {
				encontrados++;
			}
		}
		
		if(encontrados > 0) {
			System.out.println("Sua busca pelo número "+busca+" entre os digitados foi encontrado "+encontrados+" vez(es)!");
		} else {
			System.out.println("Sua busca pelo número "+busca+" entre os digitados não retornou nenhum resultado =(");
		}
		
		input.close();
	}

}