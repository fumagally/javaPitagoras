import java.util.Scanner;
public class Atividade20 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int codigo = 0;
		
		System.out.println("Informe o código do produto:");
		codigo = input.nextInt();
		
		switch(codigo) {
			case 1: System.out.println("Impressora HP | R$ 400,00");
			break;
			case 2: System.out.println("Notebook Dell | R$ 1.800,00");
			break;
			case 3: System.out.println("Mouse Óptico | R$ 50,00");
			break;
			case 4: System.out.println("Pendrive 16GB | R$ 60,00");
			break;
			default: System.out.println("O Código informado não corresponde a nenhum produto!");
		}
		
	}

}
