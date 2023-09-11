/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio32;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Exercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        int opcao;
        double valor1;

        System.out.print("Informe um valor para ser convertido (em metros): ");
        valor1 = scanner.nextDouble();

        System.out.println("Opção [1]: Converter (m) para Centímetros (cm)");
        System.out.println("Opção [2]: Converter (m) para Decímetros (dm)");
        System.out.println("Opção [3]: Converter (m) para Quilômetros (km)");
        System.out.println("Opção [4]: Converter (m) para Polegadas (pol)");

        System.out.print("Selecione uma opção do menu: ");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("O valor " + valor1 + "m convertido para cm é de " + (valor1 * 100) + "cm.");
                break;
            case 2:
                System.out.println("O valor " + valor1 + "m convertido para dm é de " + (valor1 * 10) + "dm.");
                break;
            case 3:
                System.out.println("O valor " + valor1 + "m convertido para km é de " + (valor1 / 1000) + "km.");
                break;
            case 4:
                System.out.println("O valor " + valor1 + "m convertido para pol é de " + (valor1 * 39.37) + "pol.");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                break;
        }
      
    }
    
    
}
