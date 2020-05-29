import java.util.*;
import javax.swing.JOptionPane;

public class Atividade0805_18 {
	public static void main (String [] args ) {

		int vetor[] = new int[10];

		for(int i = 0; i <= 9; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o "+(i+1)+"º número:"));
		}

		int[] novoSemDuplicacao = Arrays.stream(vetor).distinct().toArray();

		JOptionPane.showMessageDialog(null, "Vetor sem duplicação: "+Arrays.toString(novoSemDuplicacao));

	}
}