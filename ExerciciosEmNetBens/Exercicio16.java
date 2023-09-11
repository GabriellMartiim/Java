
package exercicio16;

import java.util.Scanner;


public class Exercicio16 {

   
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        
        double odometro, odometroFinal, combustivelGasto, valorRecebido, totalOdometro, consumo, valorlitro = 2.5, lucro;
        
        System.out.print("Informe a marcação do odômetro (km): ");
        odometro = scanner.nextDouble();
        
        System.out.print("Informe a marcação do odômetro no final do dia: ");
        odometroFinal = scanner.nextDouble();
        
        System.out.print("Informe o número de combustível gasto no dia: ");
        combustivelGasto = scanner.nextDouble();
        
        System.out.print("Informe o valor total recebido dos passageiros (R$): ");
        valorRecebido = scanner.nextDouble();
        
        totalOdometro = odometroFinal - odometro;
        consumo = totalOdometro / combustivelGasto;
        lucro = valorRecebido - (consumo * valorlitro);
        
        System.out.println("Você rodou " + totalOdometro + " km.");
        System.out.println("Seu consumo foi de " + consumo + " km/L.");
        System.out.println("O lucro do dia foi de R$ " + lucro);
    }
    
}
