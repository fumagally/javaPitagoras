//
// 6) Um viajante precisa de um algoritmo que o auxilie a calcular o valor total de cada uma das
// suas viagens. Ele anota as seguintes informa��es para cada viagem: m�dia (km/l) de consumo do
// ve�culo, dist�ncia (km) da viagem e pre�o (R$) da gasolina. Escreva o algoritmo solicitado.
//

import java.util.Scanner;

public class ViajanteValorViagem {
	
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		
		double distancia = 0, valorGasolina = 0, mediaCarro = 0, totalGasto = 0;
		
		System.out.println("Qual a Dist�ncia Percorrida:");
		distancia = input.nextDouble();
		
		System.out.println("Quanto foi o Valor do Litro da Gasolina:");
		valorGasolina = input.nextDouble();
		
		System.out.println("Qual a M�dia (Km) por Litro de seu ve�culo:");
		mediaCarro = input.nextDouble();
		
		totalGasto = (distancia/mediaCarro)*valorGasolina;
		System.out.println("O valor de sua Viagem foi de: R$ "+totalGasto);
		
	}

}
