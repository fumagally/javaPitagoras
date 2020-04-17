import java.util.Scanner;
import java.text.DecimalFormat;
public class Atividade0304_17 {

	public static void main (String [] args) {

		Scanner input = new Scanner(System.in);
		
		int c = 0;
		double f = 0, k = 273.15;
		DecimalFormat intervaloOK = new DecimalFormat("#.##");
		
		while(c <= 100){
			f = (c*1.8)+32;
			System.out.println(c+"º C = "+intervaloOK.format(f)+"º F = "+intervaloOK.format(k)+" K");
			c++;
			k = c + 273.15;
		}
		input.close();
	}
}