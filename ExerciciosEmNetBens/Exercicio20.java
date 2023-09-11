
package exercicio20;

import java.util.Scanner;


public class Exercicio20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;

        System.out.print("Informe sua idade: ");
        idade = scanner.nextInt();

        if (idade < 18) {
            System.out.println("Você é menor de idade.");
        } else if (idade >= 18 && idade <= 64) {
            System.out.println("Maior de idade.");
        } else {
            System.out.println("Você é idoso.");
        }
    }
    
}
