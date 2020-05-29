import java.util.Scanner;
public class Atividade0805_04 {
	public static void main (String [] args ) {
		Scanner input = new Scanner(System.in);

		int qtdNumeros = 10;
		int numeros[] = new int[qtdNumeros];

		for(int i = 0; i < qtdNumeros; i++){
			int y = i + 1;
			System.out.println("Digite a "+ y +"ª posição:");
			numeros[i] = input.nextInt();
		}

		System.out.println("Resultado das posições com a multiplicação por 2 conforme solicitado:");

		for(int i = 0; i < qtdNumeros; i++){
			System.out.println("Posição "+numeros[i]+" x 2 = "+numeros[i]*2);
		}

		input.close();
	}

}