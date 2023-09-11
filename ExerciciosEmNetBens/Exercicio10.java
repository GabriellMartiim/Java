
package exercicio10;

import java.util.Scanner;


public class Exercicio10 {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        float valor1;

        System.out.print("Informe um valor: ");
        valor1 = scanner.nextFloat();

        System.out.println(valor1 + " + " + valor1 + " + " + valor1 + " + " + valor1 + " + " + valor1);
        System.out.println("Somando 5 vezes o valor fornecido fica em: " + valor1 * 5);
        System.out.println("A média é de: " + (valor1 * 5) / 5);

        scanner.close();
    }
    
}
