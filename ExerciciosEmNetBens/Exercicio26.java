
package exercicio26;

import java.util.Scanner;


public class Exercicio26 {

    
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        double n1, n2, n3, media;

        System.out.println("Informe 3 notas abaixo: ");
        n1 = scanner.nextDouble();
        n2 = scanner.nextDouble();
        n3 = scanner.nextDouble();

        media = (n1 + n2 + n3) / 3;

        if (media < 3) {
            System.out.println("Reprovado");
        } else if (media >= 3 && media < 6) {
            System.out.println("Em exame");
        } else {
            System.out.println("Aprovado");
        }
    }
    
}
