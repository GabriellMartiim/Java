
package exercicio9;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Exercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int filho1, filho2, mediaFilho;
        double sal1, sal2, mediaSal;

        System.out.print("Informe o salário do habitante 1: ");
        sal1 = input.nextDouble();
        System.out.print("Informe quantos filhos o habitante 1 tem: ");
        filho1 = input.nextInt();
        System.out.print("Informe o salário do habitante 2: ");
        sal2 = input.nextDouble();
        System.out.print("Informe quantos filhos o habitante 2 tem: ");
        filho2 = input.nextInt();

        mediaSal = (sal1 + sal2) / 2;
        mediaFilho = (filho1 + filho2) / 2;

        System.out.println("A média de salário é de: " + mediaSal);
        System.out.println("A média de filhos é de: " + mediaFilho);
        
        
    }
    
}
