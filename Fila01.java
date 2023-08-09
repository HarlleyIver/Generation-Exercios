package Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> fila=new LinkedList<String>();
		String nome;
		int n=1;
		Scanner scan=new Scanner(System.in);
		
		while (n != 0){
			System.out.println("------------------------------------------\n");
			System.out.println("	 1 - Adicionar Cliente na Fila	    	");
			System.out.println("	 2 - Listar todos os Clientes	    	");
			System.out.println("	 3 - Retirar Clientes da Fila	    	");
			System.out.println("	 0 - Sair\n	    						");
			System.out.println("------------------------------------------\n");
			System.out.println("Entre com a opção desejada: ");
			n=scan.nextInt();
			scan.nextLine();
			
			switch(n) {
				case 0:
					System.out.println("Programa Finalizado!");
					break;
				case 1:
					System.out.println("Digite o nome: ");
					nome=scan.nextLine();
					fila.add(nome);
                    System.out.printf("Cliente %s foi adcionado!\n", nome);
                    break;
				case 2:
					if(fila.isEmpty()) {
						System.out.println("A Fila está vazia!");
						break;
					}
					System.out.println("Lista de clientes na fila: \n");
					leia(fila);
					break;
				case 3:
					if(fila.isEmpty()) {
						System.out.println("A Fila está vazia!");
						break;
					}
					System.out.println("Fila: ");
					fila.remove();
					leia(fila);
					System.out.println("O Cliente foi chamado!\n");
					break;
				default:
					System.out.println("Digite uma opção válida");
					
				
			}
			
			

	}
		
	}
	public static void leia(Queue<String> fila){
        Iterator<String> lista = fila.iterator();
        while(lista.hasNext()){
            System.out.println(lista.next());
	
	
}
	}
}



