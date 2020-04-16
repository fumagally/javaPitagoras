import java.util.Scanner;

public class Atividade16 {
	
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		
		double peso = 0, altura = 0, imc = 0;
		
		System.out.println("Qual o seu Peso (Kg):");
		peso = input.nextDouble();
		
		System.out.println("Qual a sua Altura (Ex.: 1,70):");
		altura = input.nextDouble();
		
		imc = peso/(altura * altura);
		System.out.println("Seu IMC é de: "+imc);
		
	}

}
