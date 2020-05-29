import javax.swing.JOptionPane;
public class Atividade0805_07 {
	public static void main (String [] args ) {

		int numeros[] = new int[10], posicaoA = 0, posicaoB = 0;

		for(int i = 0; i <= 9; i++) {
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o "+(i+1)+"º número:"));
		}

		posicaoA = Integer.parseInt(JOptionPane.showInputDialog("Informe a Posição A de 1 a 10:"));
		for(int i = 0; i <= 9; i++) {
			if(posicaoA >= 1 && posicaoA <= 10) {
				i = 9;
			} else {
				posicaoA = Integer.parseInt(JOptionPane.showInputDialog("Você não informou um valor de 1 a 10.\n Informe novamente a Posição A de 1 a 10:"));
				i = 0;
			}
		}

		posicaoB = Integer.parseInt(JOptionPane.showInputDialog("Informe a Posição B, de 1 a 10:"));
		for(int i = 0; i <= 9; i++) {
			if(posicaoB >= 1 && posicaoB <= 10) {
				i = 9;
			} else {
				posicaoB = Integer.parseInt(JOptionPane.showInputDialog("Você não informou um valor de 1 a 10.\n Informe novamente a Posição B de 1 a 10:"));
				i = 0;
			}
		}

		JOptionPane.showMessageDialog(null, "O número da Posição A é "+numeros[posicaoA-1]+" e o número da Posição B é "+numeros[posicaoB-1]+"!");	

	}
}