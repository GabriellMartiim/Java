
package exercicio4;

import java.util.Scanner;

public class Exercicio4 {

    
    public static void main(String[] args) {
        Scanner n = new Scanner (System.in);
        System.out.println("informe um valor: ");
        float valor1 = n.nextInt();
        System.out.println("informe um segundo valor: ");
        float valor2 = n.nextInt();
        System.out.println("a dvisão dos dois valores fornecidos é de: "+(valor1/valor2));
    }
    
}
