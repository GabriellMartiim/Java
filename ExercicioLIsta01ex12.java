
package exerciciolista01ex12;

import java.util.Scanner;


public class ExercicioLIsta01ex12 {

   
    public static void main(String[] args) {
        Scanner n = new Scanner (System.in);
        System.out.println("informe a quantidade minima do estoque: ");
        float quantidadeMinima = n.nextFloat();
        System.out.println("informe a quantidade máxima do estoque: ");
        float quantidadeMaxima = n.nextFloat();
        float media = (quantidadeMinima+quantidadeMaxima)/2f;
        System.out.println("A média do estoque é de"+media);
        n.close();
    }
    
    
}
n.close();
//12.
//Faça um programa para calcular o estoque médio de uma peça, sendo que
//ESTOQUE MÉDIO ==(QUANTIDADE_MÍNIMA QUANTIDADE_MÁXIMA) 2