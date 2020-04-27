import java.util.Scanner;
public class Atividade0304_09 {

	public static void main (String [] args) {

		Scanner input = new Scanner(System.in);

		int multiplo = 0, inicio = 0, fim = 0, i = 0;

		System.out.println("Insira o múltiplo desejado:");
		multiplo = input.nextInt();

		System.out.println("Insira o intervalo inicial:");
		inicio = input.nextInt();

		System.out.println("Insira o intervalo final:");
		fim = input.nextInt();

		if(inicio >= fim) {
			System.out.println("O intervalo final deve ser maior que o inicial!");
		} else {
			
			System.out.println("Lista dos múltiplos de "+multiplo+" entre "+inicio+" e "+fim+":");
			
			for (i = inicio; i <= fim; i++) {
		        if(i % multiplo == 0) {
		        	System.out.println(i);
		        }
		    }
		}
		input.close();
	}

}