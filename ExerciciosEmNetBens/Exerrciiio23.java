
package exerrciiio23;

import java.util.Scanner;


public class Exerrciiio23 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;

        System.out.print("Informe sua idade: ");
        idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Você pode entrar no estabelecimento.");
        } else {
            System.out.println("Você não pode entrar no estabelecimento.");
        }
    }
    
}
