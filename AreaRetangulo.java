//
// 2) Escreva um algoritmo para calcular a área de um retângulo e mostrar o resultado. A fórmula
// para tal é A = b . h, onde b é a base e h é a altura.
//

import java.util.Scanner;

public class AreaRetangulo {

	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);

		double base = 0, altura = 0, area = 0;

		System.out.println("Informe a Base do Retângulo:");
		base = input.nextDouble();

		System.out.println("Informe a Altura do Retângulo:");
		altura = input.nextDouble();

		area = base * altura;

		System.out.println("A Área do Retângulo é de: "+area+"!");

	}

}