
package exercicio21;

import java.util.Scanner;


public class Exercicio21 {

  
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int idade;

        System.out.print("Informe sua idade: ");
        idade = scanner.nextInt();

        if (idade < 16) {
            System.out.println("Não eleitor.");
        } else if (idade >= 18 && idade <= 65) {
            System.out.println("Eleitor obrigatório.");
        } else {
            System.out.println("Eleitor facultativo.");
        }
    }
    
}
