package JavaTech;

import java.util.Scanner;

public class Multiplo03 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		Scanner Scan = new Scanner (System.in); 
		
		
		int adicao = 0;
		int num = 0;
		float result = 0;
		float media = 0;
		
		
		
		do{
			System.out.printf("Digite sua média: ");
			num=Scan.nextInt();
			
			if(num %3 == 0 && num>0) {
				adicao= adicao+num;
				media++;
			}
			
		}
		
		
		
		while(num != 0);
		
		result =adicao/media;
		System.out.println("A média de todos os números múltiplos de 3 é: "+result);
		
		
	}

}


