import java.util.Scanner;
public class Atividade0304_4 {

	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		int i = 1, numero = 0, positivos = 0, negativos = 0, neutros = 0;
		
		while(i <= 100) {
			System.out.println("("+i+") Digite um número: ");
			numero = input.nextInt();
			
			if(numero > 0) {
				positivos++;
			} else if(numero < 0) {
				negativos++;
			} else {
				neutros++;
			}
			i++;
		}
		System.out.println("Positivos: "+positivos+" | Negativos: "+negativos+" | Neutros: "+neutros);
		input.close();
	}
	
}
