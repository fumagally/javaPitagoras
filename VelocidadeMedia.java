//
// 9) A velocidade m�dia de um ve�culo � calculada pela seguinte f�rmula: Vm = S/t, onde S �
// a varia��o do espa�o (ponto de chegada - ponto de partida) em km e t � o intervalo de tempo
// (tempo final - tempo inicial) em horas. Fa�a um algoritmo capaz de determinar a velocidade
// m�dia de um ve�culo com base nos dados da f�rmula.
//

import java.util.Scanner;

public class VelocidadeMedia {

	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);

		double kmPercorrido = 0, horas = 0, velocidadeMedia = 0;

		System.out.println("Qual a Dist�ncia (km) percorrida:");
		kmPercorrido = input.nextDouble();

		System.out.println("Quantas Horas durou a viagem:");
		horas = input.nextDouble();

		velocidadeMedia = kmPercorrido/horas;

		System.out.println("Sua Velocidade M�dia foi de "+velocidadeMedia+"Km/h!");

	}

}
