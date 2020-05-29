import java.util.*;
import javax.swing.JOptionPane;

public class Atividade0805_08 {
	public static void main (String [] args ) {

		int vetorA[] = new int[12], vetorB[] = new int[6], vetorInverso[] = new int[6];

		for(int i = 0; i <= 11; i++) {
			vetorA[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o "+(i+1)+"º número:"));
		}

		for(int i = 0; i <= 5; i++) {
			vetorB[i] = vetorA[i];
		}

		int i = 0;
		int k = 5;
		while(i <= 5) {
			vetorInverso[i] = vetorB[k];
			i++; k--;
		}

		JOptionPane.showMessageDialog(null, "Vetor em ordem inversa: "+Arrays.toString(vetorInverso)+"!");

	}
}