//
// 4) Escreva um algoritmo que leia dois números inteiros digitados pelo usuário e faça a subtração
// do maior valor pelo menor valor e mostre o resultado.
//

import java.util.Scanner;

public class Atividade04 {

	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);

		int num1 = 0, num2 = 0, resultado = 0;

		System.out.println("Insira um número:");
		num1 = input.nextInt();

		System.out.println("Insira outro número:");
		num2 = input.nextInt();

		if(num1 > num2) {
			resultado = num1 - num2;
			System.out.println("O primeiro número informado ("+num1+") é maior que o segundo número informado ("+num2+"). O resultado de sua subtração é: "+resultado+".");
		} else if(num2 > num1) {
			resultado = num2 - num1;
			System.out.println("O segundo número informado ("+num2+") é maior que o primeiro número informado ("+num1+"). O resultado de sua subtração é: "+resultado+".");
		} else {
			System.out.println("Os dois números informados ("+num1+") são iguais, portanto o resultado de sua subtração é 0.");
		}

	}

}
