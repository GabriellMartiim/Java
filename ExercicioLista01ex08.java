
package exerciciolista01ex08;

import java.util.Scanner;


public class ExercicioLista01ex08 {

    
    public static void main(String[] args) {
        Scanner n= new Scanner (System.in);
        System.out.println("informe o valor do produto: ");
        float produto = n.nextFloat();
        System.out.println("informe o percentual de desconto: ");
        float percentualDesconto = n.nextFloat();
        float valorDesconto = ((produto*percentualDesconto)/100.0f);
        float valorComDesconto = (produto-valorDesconto);
        System.out.println("o valor do desconto é de: "+valorDesconto);
        System.out.println("o valor com o desconto é de: "+ valorComDesconto);
        
        
    }
    
}
//Implemente um algoritmo que receba o valor de um produto e a porcentagem de
//desconto calcule o valor do desconto e o valor do produto com desconto O
//valor do desconto é calculado por meio da fórmula valor desconto valor
//produto **(percentual do desconto 100