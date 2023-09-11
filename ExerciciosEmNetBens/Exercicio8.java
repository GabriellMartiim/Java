
package exercicio8;

import java.util.Scanner;


public class Exercicio8 {

    
    public static void main(String[] args) {
        Scanner n = new Scanner (System.in);
        System.out.println("informe um valor inteiro: ");
        float valor1 = n.nextInt();
        System.out.println("informe um segundo valor inteiro: ");
        float valor2 = n.nextInt();
        System.out.println("o resultado da multiplicação dos dois valores é de:"+(valor1*valor2));
        System.out.println("a divisão dos dois valores é de "+(valor1/valor2));
        
    }
    
}
//8. Crie um programa para receber dois valores inteiros e mostrar o resultado da multiplicação e da divisão dos valores.