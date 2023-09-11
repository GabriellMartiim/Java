
package exercicio13;

import java.util.Scanner;




public class Exercicio13 {
   
    public static void main(String[] args) {
        Scanner n = new Scanner (System.in);
          int numero;
        
        System.out.print("Informe um valor numérico inteiro: ");
        numero = n.nextInt();
        
        int quociente = numero / 3;
        int resto = numero % 3;
        
        System.out.println("Quociente da divisão por 3: " + quociente);
        System.out.println("Resto da divisão por 3: " + resto);
    }
    
}
