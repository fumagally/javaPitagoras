import java.util.*;
import javax.swing.JOptionPane;

public class Atividade0805_11 {
	public static void main (String [] args ) {
	
		int vetor[] = new int[10];
		
		for(int i = 0; i <= 9; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o "+(i+1)+"º número:"));
		}
		
		for(int i = 0; i <= 9; i++) {
			if(vetor[i] % 2 != 0) {
				vetor[i] = 0;
			}
		}
		
		JOptionPane.showMessageDialog(null, "Vetor substuído ímpar por 0: "+Arrays.toString(vetor));
	
	}

}