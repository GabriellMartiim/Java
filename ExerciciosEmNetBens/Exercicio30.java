/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio30;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Exercicio30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int opcao, valor1, valor2;

        do {
            System.out.println("\nEscolha uma opção da tabela abaixo:");
            System.out.println("[1] - Soma de valores");
            System.out.println("[2] - Multiplicação");
            System.out.println("[3] - Sair do programa");
            System.out.print("Informe a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Informe um valor: ");
                    valor1 = scanner.nextInt();
                    System.out.print("Informe um segundo valor: ");
                    valor2 = scanner.nextInt();
                    System.out.println("A soma dos dois valores é de: " + (valor1 + valor2));
                    break;
                case 2:
                    System.out.print("Informe um valor: ");
                    valor1 = scanner.nextInt();
                    System.out.print("Informe um segundo valor: ");
                    valor2 = scanner.nextInt();
                    System.out.println("A multiplicação dos dois valores é de: " + (valor1 * valor2));
                    break;
                case 3:
                    System.out.println("PROGRAMA FINALIZADO!");
                    break;
                default:
                    System.out.println("Opção inválida. Digite 1, 2 ou 3.");
                    break;
            }
        } while (opcao != 3);

    }
    
}
