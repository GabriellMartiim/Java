
package exercicio5;

import java.util.Scanner;


public class Exercicio5 {

    
    public static void main(String[] args) {
       Scanner n = new Scanner (System.in);
        System.out.println("informe um valor: ");
        float valor1 = n.nextFloat();
        System.out.println("informe um segundo valor: ");
        float valor2 = n.nextFloat();
        System.out.println("informe um terceiro valor: ");
        float valor3 = n.nextFloat();
        float media = (valor1+valor2+valor3)/3 ;
        System.out.println("a média dos valores é de: "+media);
        
    }
    
}
// Crie um programa para receber três valores e calcular a média.