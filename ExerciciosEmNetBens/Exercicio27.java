
package exercicio27;

import java.util.Scanner;

public class Exercicio27 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, opcao, resultado;

        System.out.print("Informe um valor numérico inteiro: ");
        numero = scanner.nextInt();

        System.out.println("Escolha uma opção abaixo:");
        System.out.println("[1] - Calcular o valor quadrado");
        System.out.println("[2] - Calcular o valor cúbico");

        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                resultado = numero * numero;
                System.out.println("O valor do quadrado é: " + resultado);
                break;
            case 2:
                resultado = numero * numero * numero;
                System.out.println("O valor cúbico é: " + resultado);
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
    

