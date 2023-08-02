package JavaTech;

import java.util.Scanner;

public class CalculadoraSimples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cod;
		float n1,n2;
		
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		n1=Scan.nextFloat();
		System.out.println("Digite um número: ");
		n2=Scan.nextFloat();
		
		System.out.println("1 Soma ");
		System.out.println("2 Subtração ");
		System.out.println("3 Multiplicação ");
		System.out.println("4 Divisão ");
		System.out.println("Selecione a operação: ");
		cod=Scan.nextInt();
		
		switch(cod) {
			case 1:
				System.out.printf("%.1f + %.1f = %.1f", n1, n2, n1 + n2);
				break;
			case 2:
				System.out.printf("%.1f - %.1f = %.1f", n1, n2, n1 - n2);
				break;
			case 3:
				System.out.printf("%.1f * %.1f = %.1f", n1, n2, n1 * n2);
				break;
			case 4:
				System.out.printf("%.1f / %.1f = %.1f", n1, n2, n1 / n2);
				break;
			default:
				System.out.println("Operação Inválida!");
				break;	
		}
		
	}

}
