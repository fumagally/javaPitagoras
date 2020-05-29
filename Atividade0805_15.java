import java.util.*;
import javax.swing.JOptionPane;

public class Atividade0805_15 {
	public static void main (String [] args ) {

		int vetorA[] = new int[10], vetorB[] = new int[10], vetorSoma[] = new int[10];

		for(int i = 0; i <= 9; i++) {
			vetorA[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o "+(i+1)+"º número do Vetor A:"));
			vetorB[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o "+(i+1)+"º número do Vetor B:"));
		}

		int inversaoVetorB = 9;
		for(int i = 0; i <= 9; i++) {
			vetorSoma[i] = vetorA[i]+vetorB[inversaoVetorB];
			inversaoVetorB--;
		}

		JOptionPane.showMessageDialog(null, "Vetor A: "+Arrays.toString(vetorA)+"\n"
				+ "Vetor B: "+Arrays.toString(vetorB)+"\n"
				+ "Soma das Respectivas Posições de A e B: "+Arrays.toString(vetorSoma));

	}
}