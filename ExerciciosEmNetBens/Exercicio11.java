
package exercicio11;

import java.util.Scanner;


public class Exercicio11 {

   
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a temperatura em graus Celsius: ");
        float celsius = scanner.nextFloat();
        
        float fahrenheit = (celsius * 9/5) + 32;
        
        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
        
        scanner.close();
    }
    
}
