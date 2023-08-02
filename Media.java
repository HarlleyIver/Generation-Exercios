package JavaTech;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n1,n2,n3,n4, media;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		n1=scan.nextFloat();
		System.out.println("Digite a segunda nota: ");
		n2=scan.nextFloat();
		System.out.println("Digite a terceira nota: ");
		n3=scan.nextFloat();
		System.out.println("Digite a quarta nota: ");
		n4=scan.nextFloat();
		
		media = (n1+n2+n3+n4)/4;
		
		System.out.printf("Média: %.1f", media);
		
		
		
		
		
		
		
		
		
	}

}
