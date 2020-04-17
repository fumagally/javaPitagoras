import java.util.Scanner;
import java.text.DecimalFormat;
public class Atividade0304_19 {

	public static void main (String [] args) {

		Scanner input = new Scanner(System.in);
		
		String candidato1 = "João", candidato2 = "José", candidato3 = "Maria";
		int contador = 1, votarNovamente = 0, voto = 0, votos1 = 0, votos2 = 0, votos3 = 0, brancos = 0, nulos = 0;
		double votos1P = 0, votos2P = 0, votos3P = 0, brancosP = 0, nulosP = 0, totalVotos = 0;
		boolean rePerguntar = false;
		
		DecimalFormat pOK = new DecimalFormat("#.##");
		
		while(contador > 0) {
			if(rePerguntar == false) {
				System.out.println("====================================");
				System.out.println("########## ELEIÇÕES 2020 ###########");
				System.out.println("====================================");
				System.out.println("Informe o número de seu Candidato\npara confirmar seu voto");
				System.out.println("====================================");
				System.out.println("1 - "+candidato1);
				System.out.println("2 - "+candidato2);
				System.out.println("3 - "+candidato3);
				System.out.println("0 - Votar em Branco");
				System.out.println("====================================");
				voto = input.nextInt();
				
				switch(voto) {
					case 1: votos1++;
					break;
					case 2: votos2++;
					break;
					case 3: votos3++;
					break;
					case 0: brancos++;
					break;
					default: nulos++;
				}
				
				totalVotos++;
				
				System.out.println("====================================");
				System.out.println("Seu voto foi computado com sucesso!");
				System.out.println("====================================");
				rePerguntar = true;
			}
			if(rePerguntar == true) {
				System.out.println("Deseja votar novamente?\n1: Sim  |  2: Não");
				System.out.println("====================================");
				votarNovamente = input.nextInt();
				
				if(votarNovamente != 1 && votarNovamente != 2) {
					rePerguntar = true;
					contador = 1;
				}
			}
			if(votarNovamente == 1) { contador = 1; rePerguntar = false; }
			if(votarNovamente == 2) { contador = 0; }
		}
		
		System.out.println("====================================");
		System.out.println("RESULTADO - ELEIÇÕES 2020");
		System.out.println("====================================");
		System.out.println("Total de Votos: "+totalVotos);
		
		brancosP = (brancos*100)/totalVotos;
		System.out.println("Votos Brancos: "+brancos+" ("+pOK.format(brancosP)+"%)");
		nulosP = (nulos*100)/totalVotos;
		System.out.println("Votos Nulos: "+nulos+" ("+pOK.format(nulosP)+"%)");
		votos1P = (votos1*100)/totalVotos;
		System.out.println("------------------------------------");
		System.out.println(candidato1+": "+votos1+" Votos ("+pOK.format(votos1P)+"%)");
		votos2P = (votos2*100)/totalVotos;
		System.out.println(candidato2+": "+votos2+" Votos ("+pOK.format(votos2P)+"%)");
		votos3P = (votos3*100)/totalVotos;
		System.out.println(candidato3+": "+votos3+" Votos ("+pOK.format(votos3P)+"%)");
		System.out.println("====================================");
		
		input.close();
	}
}