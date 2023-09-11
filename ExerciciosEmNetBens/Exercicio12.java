
package exercicio12;

import java.util.Scanner;


public class Exercicio12 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        float valInvestimento, taxaDeJuros, tempo, total;
        
        System.out.print("Informe o valor do investimento: ");
        valInvestimento = scanner.nextFloat();
        
        System.out.print("Informe a taxa de juros anual em porcentagem: ");
        taxaDeJuros = scanner.nextFloat();
        
        System.out.print("Informe quantos anos você quer investir: ");
        tempo = scanner.nextFloat();
        
        total = valInvestimento * (1 + (taxaDeJuros / 100) * tempo);
        
        System.out.println("No final do período você terá: " + total);
    }
    
}
