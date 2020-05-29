import java.util.*;
import javax.swing.JOptionPane;

public class Atividade0805_12 {
	public static void main (String [] args ) {

		String pessoas[] = new String[30], blocoA[] = new String[10], blocoB[] = new String[10], blocoC[] = new String[10];
		int contadorBlocoB = 0, contadorBlocoC = 0;

		for(int i = 0; i <= 29; i++) {
			pessoas[i] = JOptionPane.showInputDialog("Informe a Pessoa nº "+(i+1)+":");
		}

		for(int i = 0; i <= 29; i++) {
			if(i <= 9) {
				blocoA[i] = pessoas[i];
			}
			if(i > 9 && i <= 19) {
				blocoB[contadorBlocoB] = pessoas[i];
				contadorBlocoB++;
			}
			if(i > 19 && i <= 30) {
				blocoC[contadorBlocoC] = pessoas[i];
				contadorBlocoC++;
			}
		}

		JOptionPane.showMessageDialog(null, "Primeiro Vetor: "+Arrays.toString(blocoA)+"\n"
				+ "Segundo Vetor: "+Arrays.toString(blocoB)+"\n"
				+ "Terceiro Vetor: "+Arrays.deepToString(blocoC));

	}

}