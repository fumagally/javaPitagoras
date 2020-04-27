import java.util.Scanner;
public class Triangulo {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double a = 0, b = 0, c = 0;
		
		System.out.println("Informe a medida do lado A do tri�ngulo:");
		a = input.nextDouble();
		
		System.out.println("Informe a medida do lado B do tri�ngulo:");
		b = input.nextDouble();
		
		System.out.println("Informe a medida do lado C do tri�ngulo:");
		c = input.nextDouble();
		
		if (a < b + c && b < a + c && c < a + b){
			if (a == b && a == c){
				System.out.println("Equil�tero. Tr�s lados iguais!");
			} else if(a == b || a == c || c == b){
				System.out.println("Isosceles. Dois lados iguais!");
			} else {
				System.out.println("Escaleno. Tr�s lados diferentes.");
			}
		} else {
			System.out.println("N�o � um triangulo!");
		}
		
	}

}
