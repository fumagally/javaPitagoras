import java.util.Scanner;
public class Atividade0304_06 {
	
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		
		int numero = 0, intervalo = 1, multiplica = 0;
		
		System.out.println("Informe o Valor do Número:");
		numero = input.nextInt();
		
		while(intervalo <= 10) {
			multiplica = numero*intervalo;
			System.out.println(numero +" x "+intervalo+" = "+ multiplica);
			intervalo = intervalo + 1;
		}
		
		input.close();
		
	}

}
