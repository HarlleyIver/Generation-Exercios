package JavaTech;

import java.util.Scanner;

public class MenorMaior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1, n2, n3;
		int soma;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primerio número: ");
		n1=scan.nextInt();
		System.out.println("Digite o segundo número: ");
		n2=scan.nextInt();
		System.out.println("Digite o terceiro número: ");
		n3=scan.nextInt();
		soma=n1+n2;
		
		if(soma>n3) {
			System.out.println("A Soma do primeiro e segundo número é maior do que " +n3);
		}else if(soma<n3) {
			System.out.println("A Soma do primeiro e segundo número é menor do que " +n3);
		}else {
			System.out.println("A Soma do primeiro e segundo número é igual a  " +n3);
		}
		
}

}
	
	
		