package JavaTech;
import java.util.Scanner;

public class For02 {
    public static void main(String[] argss){
        Scanner Scan = new Scanner(System.in);
        int num, contPar = 0, contImpar = 0;
        
        for(int i = 1; i <= 10; i++){
            System.out.println("Digite o " + i + "º número");
            num = Scan.nextInt();
            
            if(num % 2 == 0){
                contPar++;
            }

            if(num % 2 == 1){
                contImpar++;
            }
            
        }
        
        System.out.println("Foram digitados " + contPar + " números pares \n");
        System.out.println("E " + contImpar + " números ímpares");
        
    }
}