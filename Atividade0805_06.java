import javax.swing.JOptionPane;
public class Atividade0805_06 {
	public static void main (String [] args ) {

		int qtdInformar = 0, qtdPositivos = 0, qtdNegativos = 0, numero = 0;
		String pluralPositivo = "", pluralNegativo = "";

		qtdInformar = Integer.parseInt(JOptionPane.showInputDialog("Quandos números deseja informar?"));

		for(int i = 1; i <= qtdInformar; i++) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o "+i+"º número:"));
			if(numero >= 0) { qtdPositivos++; } else { qtdNegativos++; }
		}

		if(qtdPositivos > 1) { pluralPositivo = "s"; }
		if(qtdNegativos > 1) { pluralNegativo = "s"; }

		JOptionPane.showMessageDialog(null, "Foram informados "+qtdPositivos+" número"+pluralPositivo+" Positivo"+pluralPositivo+" e "
				+ ""+qtdNegativos+" número"+pluralNegativo+" Negativo"+pluralNegativo+"!");	

	}
}
