
package exercicio28;

import java.util.Scanner;


public class Exercicio28 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        char vogal, subsequente = 'B';

        System.out.print("Informe uma vogal maiúscula: ");
        vogal = scanner.next().charAt(0);

        switch (vogal) {
            case 'A':
                subsequente = 'E';
                break;
            case 'E':
                subsequente = 'I';
                break;
            case 'I':
                subsequente = 'O';
                break;
            case 'O':
                subsequente = 'U';
                break;
            case 'U':
                subsequente = 'A';
                break;
            default:
                System.out.println("A informação digitada é inválida e/ou não é uma vogal!");
                break;
        }

        System.out.println("A vogal '" + vogal + "' possui a vogal subsequente: '" + subsequente + "'.");
        scanner.close();
    }
    
}
