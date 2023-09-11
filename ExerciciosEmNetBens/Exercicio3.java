
package exercicio3;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner n = new Scanner (System.in);
        System.out.println("informe um valor: ");
        int valor1 = n.nextInt();
        System.out.println("informe um segundo valor: ");
        int valor2 = n.nextInt();
        System.out.println("a multiplicação dos dois valores fornecidos é de: "+(valor1*valor2));
    }
    
}
