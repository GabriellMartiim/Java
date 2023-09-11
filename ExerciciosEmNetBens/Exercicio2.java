
package exercicio2;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
         Scanner n = new Scanner (System.in);
        System.out.println("informe um valor: ");
        int valor1 = n.nextInt();
        System.out.println("informe um segundo valor: ");
        int valor2 = n.nextInt();
        System.out.println("a subtração dos dois valores fornecidos é de: "+(valor1-valor2));
    }
    
}
