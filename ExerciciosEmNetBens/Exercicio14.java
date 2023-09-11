
package exercicio14;

import java.util.Scanner;

public class Exercicio14 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double quantidadeKg;
        
        System.out.print("Informe a quantidade de alimento em quilos: ");
        quantidadeKg = scanner.nextDouble();
        
        double quantidadeGramas = quantidadeKg * 1000;
        double consumoDiarioGramas = 50;
        double duracaoDias = quantidadeGramas / consumoDiarioGramas;
        
        System.out.println("Esse alimento durará " + duracaoDias + " dias para uma pessoa que consome 50 gramas por dia.");
    }
    
}
