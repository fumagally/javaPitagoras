import java.util.Scanner;
public class Atividade21 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double valor = 0, valorDesconto = 0, valorAcrescimo = 0, valorFinal = 0, valorParcelas = 0;
		int tipoCompra = 0;
		
		System.out.println("Informe o Valor Total da Compra:");
		valor = input.nextInt();
		
		if(valor > 0) {
			
			System.out.println("Qual a Forma de Pagamento? (Digite o Número da Opção)");
			System.out.println("1 - Pagamento à Vista - 15% de Desconto");
			System.out.println("2 - Pagamento com Cheque Pré-Datado - 10% de Desconto");
			System.out.println("3 - Pagamento parcelado em 3x - 5% de Desconto");
			System.out.println("4 - Pagamento parcelado em 6x - Sem Desconto");
			System.out.println("5 - Pagamento parcelado em 12x - Acréscimo de 8%");
			tipoCompra = input.nextInt();
			
			switch(tipoCompra) {
				case 1:
					valorDesconto = (valor*15)/100;
					valorFinal = valor-valorDesconto;
					System.out.println("PAGAMENTO À VISTA:");
					System.out.println("Valor total de sua compra: R$ "+valor);
					System.out.println("Valor do Desconto: R$ "+valorDesconto);
					System.out.println("Valor final de sua compra com o desconto: R$ "+valorFinal);
				break;
				case 2:
					valorDesconto = (valor*10)/100;
					valorFinal = valor-valorDesconto;
					System.out.println("PAGAMENTO COM CHEQUE PRÉ-DATADO:");
					System.out.println("Valor total de sua compra: R$ "+valor);
					System.out.println("Valor do Desconto: R$ "+valorDesconto);
					System.out.println("Valor final de sua compra com o desconto: R$ "+valorFinal);
				break;
				case 3:
					valorDesconto = (valor*5)/100;
					valorFinal = valor-valorDesconto;
					valorParcelas = valorFinal/3;
					System.out.println("PAGAMENTO PARCELADO EM 3X:");
					System.out.println("Valor total de sua compra: R$ "+valor);
					System.out.println("Valor do Desconto: R$ "+valorDesconto);
					System.out.println("Valor final de sua compra com o desconto: R$ "+valorFinal);
					System.out.println("Valor da Parcela: R$ "+valorParcelas);
				break;
				case 4:
					valorParcelas = valor/6;
					System.out.println("PAGAMENTO PARCELADO EM 6X:");
					System.out.println("Valor total de sua compra: R$ "+valor);
					System.out.println("Compra sem desconto!");
					System.out.println("Valor da Parcela: R$ "+valorParcelas);
				break;
				case 5:
					valorAcrescimo = (valor*8)/100;
					valorFinal = valor+valorAcrescimo;
					valorParcelas = valorFinal/12;
					System.out.println("PAGAMENTO PARCELADO EM 12X:");
					System.out.println("Valor total de sua compra: R$ "+valor);
					System.out.println("Valor do Acréscimo: R$ "+valorAcrescimo);
					System.out.println("Valor final de sua compra com o acréscimo: R$ "+valorFinal);
					System.out.println("Valor da Parcela: R$ "+valorParcelas);
				break;
				default: System.out.println("A opção informada inválida!");
			}
		} else {
			System.out.println("O Valor da compra informado é inválido!");
		}
		
	}
}
