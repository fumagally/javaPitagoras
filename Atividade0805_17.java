import javax.swing.JOptionPane;

public class Atividade0805_17 {
	public static void main (String [] args ) {

		int [] cod = {21 ,5, 12, 14, 8};
		String [] nome = {"Notebook", "Memória", "Disco Rígido", "Pendrive", "Mouse"};
		double preco[] = {1800, 120, 200, 55, 25};
		boolean encontrado = false;

		int codigo = Integer.parseInt(JOptionPane.showInputDialog("Insira o Código do Produto:"));

		for (int i=0; i < cod.length; i++) {
			if(codigo == cod[i]) {
				JOptionPane.showMessageDialog(null, "Produto Encontrado:\n\n"
						+ nome[i]+" - R$ "+String.format("%,.2f", preco[i]));
				encontrado = true;
			}
		}
		if(!encontrado) {
			JOptionPane.showMessageDialog(null, "Produto não Encontrado!");
		}

	}
}