//
// 4) Escreva um algoritmo que leia dois n�meros inteiros digitados pelo usu�rio e fa�a a subtra��o
// do maior valor pelo menor valor e mostre o resultado.
//

import java.util.Scanner;

public class Atividade04 {

	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);

		int num1 = 0, num2 = 0, resultado = 0;

		System.out.println("Insira um n�mero:");
		num1 = input.nextInt();

		System.out.println("Insira outro n�mero:");
		num2 = input.nextInt();

		if(num1 > num2) {
			resultado = num1 - num2;
			System.out.println("O primeiro n�mero informado ("+num1+") � maior que o segundo n�mero informado ("+num2+"). O resultado de sua subtra��o �: "+resultado+".");
		} else if(num2 > num1) {
			resultado = num2 - num1;
			System.out.println("O segundo n�mero informado ("+num2+") � maior que o primeiro n�mero informado ("+num1+"). O resultado de sua subtra��o �: "+resultado+".");
		} else {
			System.out.println("Os dois n�meros informados ("+num1+") s�o iguais, portanto o resultado de sua subtra��o � 0.");
		}

	}

}
