
package exercicio22;

import java.util.Scanner;

public class Exercicio22 {

    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        double peso, altura, imc;

        System.out.print("Informe seu peso (em kg): ");
        peso = scanner.nextDouble();

        System.out.print("Informe sua altura (em metros): ");
        altura = scanner.nextDouble();

        imc = peso / (altura * altura);

        System.out.println("\nIMC: " + imc);

        if (imc <= 18.5) {
            System.out.println("Abaixo do peso.");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Peso ideal. Parabéns!");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Levemente acima do peso.");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Obesidade grau 1.");
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Obesidade de grau 2 (severa).");
        } else {
            System.out.println("Obesidade de grau 3 (mórbida).");
        }
    }
    
}
