package JavaTech;
import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Scan = new Scanner (System.in);
		
		int idade;
		int cont1= 0;
		int cont2 = 0;
		
		System.out.println("Digite sua idade: ");
		idade=Scan.nextInt();
		
		
		while (idade >0) {
			
			if(idade <21) {
				cont1++;	
				
		}else if(idade >50) {
			cont2++;

	}
			System.out.println("Digite sua idade: ");
			idade=Scan.nextInt();
			
		}
			
			System.out.println("Total de pessoas menores de 21 anos:" +cont1);
			System.out.println("Total de pessoas maiores de 50 anos:" +cont2);

		
	}}