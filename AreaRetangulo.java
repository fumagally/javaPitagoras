//
// 2) Escreva um algoritmo para calcular a �rea de um ret�ngulo e mostrar o resultado. A f�rmula
// para tal � A = b . h, onde b � a base e h � a altura.
//

import java.util.Scanner;

public class AreaRetangulo {

	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);

		double base = 0, altura = 0, area = 0;

		System.out.println("Informe a Base do Ret�ngulo:");
		base = input.nextDouble();

		System.out.println("Informe a Altura do Ret�ngulo:");
		altura = input.nextDouble();

		area = base * altura;

		System.out.println("A �rea do Ret�ngulo � de: "+area+"!");

	}

}