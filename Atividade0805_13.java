import java.util.*;
import javax.swing.JOptionPane;

public class Atividade0805_13 {
	public static void main (String [] args ) {

		int vetor[] = new int[10], par = 0;

		for(int i = 0; i <= 9; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o "+(i+1)+"º número:"));
			if(vetor[i] % 2 == 0) {
				par++;
			}
		}

		if(par >= 1) {

			int vetorPares[] = new int[par];
			par = 0;

			for(int i = 0; i <= 9; i++) {
				if(vetor[i] % 2 == 0) {
					vetorPares[par] = vetor[i];
					par++;
				}
			}
			JOptionPane.showMessageDialog(null, "Números pares informados: "+Arrays.toString(vetorPares));
		} else {
			JOptionPane.showMessageDialog(null, "Nenhum número par foi informado!");
		}

	}
}