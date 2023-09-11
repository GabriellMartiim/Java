
package exercicio1java;

import java.util.Scanner;

/**
 *
 * @author gabriel_oliveira29
 */
public class Exercicio1java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner n = new Scanner (System.in);
        System.out.println("informe um valor: ");
        int valor1 = n.nextInt();
        System.out.println("informe um segundo valor: ");
        int valor2 = n.nextInt();
        System.out.println("a soma dos dois valores fornecidos é de: "+valor1+valor2);
    }
    
}
