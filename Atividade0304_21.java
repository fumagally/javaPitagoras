import java.util.Scanner;
import java.text.DecimalFormat;
public class Atividade0304_21 {

	public static void main (String [] args) {

		Scanner input = new Scanner(System.in);
		
		int contador = 1, outraSoma = 0, sexo = 0;
		double altura = 0, totalM = 0, totalF = 0, totalAlturaM = 0, totalAlturaF = 0, maiorAlturaM = 0, maiorAlturaF = 0;
		double mediaAlturaM = 0, mediaAlturaF = 0, mediaGeral = 0, popM = 0, popF = 0;
		boolean rePerguntar = false;
		
		DecimalFormat numOK = new DecimalFormat("#.##");
		
		while(contador > 0) {
			if(rePerguntar == false) {
				System.out.println("==================================================================");
				System.out.println("Informe o Sexo:");
				System.out.println("------------------------------------------------------------------");
				System.out.println("1 - Masculino");
				System.out.println("2 - Feminino");
				System.out.println("==================================================================");
				sexo = input.nextInt();
				
				System.out.println("==================================================================");
				System.out.println("Qual a Altura:");
				System.out.println("==================================================================");
				altura = input.nextDouble();
				
				if(sexo == 1) {
					totalM++;
					totalAlturaM += altura;
					if(altura > maiorAlturaM) {
						maiorAlturaM = altura;
					}
				} else if(sexo == 2) {
					totalF++;
					totalAlturaF += altura;
					if(altura > maiorAlturaF) {
						maiorAlturaF = altura;
					}
				}
				rePerguntar = true;
			}
			if(rePerguntar == true) {
				System.out.println("------------------------------------------------------------------");
				System.out.println("Deseja informar outro habitante? Digite > 1: Sim, 2: Não");
				System.out.println("------------------------------------------------------------------");
				outraSoma = input.nextInt();
				
				if(outraSoma != 1 && outraSoma != 2) {
					rePerguntar = true;
					contador = 1;
				}
			}
			if(outraSoma == 1) { contador = 1; rePerguntar = false; }
			if(outraSoma == 2) { contador = 0; }
		}
		
		if(maiorAlturaM > maiorAlturaF) {
			System.out.println("A maior altura informada foi Masculina: "+numOK.format(maiorAlturaM));
		} else if(maiorAlturaF > maiorAlturaM) {
			System.out.println("A maior altura informada foi Feminina: "+numOK.format(maiorAlturaF));
		} else {
			System.out.println("A maior altura informada foi um empate entre Masculina e Feminina: "+numOK.format(maiorAlturaM));
		}
		
		mediaAlturaM = totalAlturaM/totalM;
		mediaAlturaF = totalAlturaF/totalF;
		
		System.out.println("A média de altura Masculina é de: "+numOK.format(mediaAlturaM));
		System.out.println("A média de altura Feminina é de: "+numOK.format(mediaAlturaF));
		
		popM = (totalM * 100)/(totalM + totalF);
		popF = (totalF * 100)/(totalM + totalF);
		
		System.out.println("A população Masculina é de "+numOK.format(popM)+"%");
		System.out.println("A população Feminina é de "+numOK.format(popF)+"%");
		
		mediaGeral = (totalAlturaM + totalAlturaF)/(totalM + totalF);
		
		System.out.println("==================================================================");
		System.out.println("A média geral da altura da população é de "+numOK.format(mediaGeral));
		System.out.println("==================================================================");
		input.close();
	}
}