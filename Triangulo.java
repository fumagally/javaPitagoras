import java.util.Scanner;
public class Triangulo {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double a = 0, b = 0, c = 0;
		
		System.out.println("Informe a medida do lado A do triângulo:");
		a = input.nextDouble();
		
		System.out.println("Informe a medida do lado B do triângulo:");
		b = input.nextDouble();
		
		System.out.println("Informe a medida do lado C do triângulo:");
		c = input.nextDouble();
		
		if (a < b + c && b < a + c && c < a + b){
			if (a == b && a == c){
				System.out.println("Equilátero. Três lados iguais!");
			} else if(a == b || a == c || c == b){
				System.out.println("Isosceles. Dois lados iguais!");
			} else {
				System.out.println("Escaleno. Três lados diferentes.");
			}
		} else {
			System.out.println("Não é um triangulo!");
		}
		
	}

}
