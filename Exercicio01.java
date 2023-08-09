package Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> lista = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i <5 ; i++) {
            System.out.println("Digite a cor que deseja: ");
            String cor = scan.nextLine();
            lista.add(cor);
        }

        System.out.println(lista);
        System.out.println("\nCores adicionadas: ");

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }


        Collections.sort(lista);
        System.out.println("\nCores em ordem crescente: ");

        for (int i =0 ; i< lista.size(); i++){
            System.out.println(lista.get(i));
        }

      

	}

	

}
