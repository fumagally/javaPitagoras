import javax.swing.JOptionPane;

public class Atividade0805_16 {
	public static void main (String [] args ) {
	
		String [] gabarito = {"e", "a", "b", "b", "c", "a", "c", "e", "a", "d"};
		String respostas[] = new String[10];
		int acertos = 0;
		
		for(int i = 0; i <= 9; i++) {
			respostas[i] = JOptionPane.showInputDialog("Informe sua resposta da Questão nº "+(i+1)+":");
			if(respostas[i].equals(gabarito[i])) { acertos++; }
		}
		
		JOptionPane.showMessageDialog(null, "Você acertou: "+acertos+" questões!");
	
	}
}