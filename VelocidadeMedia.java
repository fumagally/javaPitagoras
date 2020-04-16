//
// 9) A velocidade média de um veículo é calculada pela seguinte fórmula: Vm = S/t, onde S é
// a variação do espaço (ponto de chegada - ponto de partida) em km e t é o intervalo de tempo
// (tempo final - tempo inicial) em horas. Faça um algoritmo capaz de determinar a velocidade
// média de um veículo com base nos dados da fórmula.
//

import java.util.Scanner;

public class VelocidadeMedia {

	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);

		double kmPercorrido = 0, horas = 0, velocidadeMedia = 0;

		System.out.println("Qual a Distância (km) percorrida:");
		kmPercorrido = input.nextDouble();

		System.out.println("Quantas Horas durou a viagem:");
		horas = input.nextDouble();

		velocidadeMedia = kmPercorrido/horas;

		System.out.println("Sua Velocidade Média foi de "+velocidadeMedia+"Km/h!");

	}

}
