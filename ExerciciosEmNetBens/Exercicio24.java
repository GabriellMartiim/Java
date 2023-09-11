
package exercicio24;

import java.util.Scanner;


public class Exercicio24 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val1, val2, val3, val4, val5, val6, val7, val8, val9, val10;
        int maiorValor, menorValor;

        System.out.println("Informe 10 números: ");
        val1 = scanner.nextInt();
        val2 = scanner.nextInt();
        val3 = scanner.nextInt();
        val4 = scanner.nextInt();
        val5 = scanner.nextInt();
        val6 = scanner.nextInt();
        val7 = scanner.nextInt();
        val8 = scanner.nextInt();
        val9 = scanner.nextInt();
        val10 = scanner.nextInt();

        maiorValor = val1;
        menorValor = val1;

        if (val2 > maiorValor) {
            maiorValor = val2;
        } else if (val2 < menorValor) {
            menorValor = val2;
        }

        if (val3 > maiorValor) {
            maiorValor = val3;
        } else if (val3 < menorValor) {
            menorValor = val3;
        }

        if (val4 > maiorValor) {
            maiorValor = val4;
        } else if (val4 < menorValor) {
            menorValor = val4;
        }

        if (val5 > maiorValor) {
            maiorValor = val5;
        } else if (val5 < menorValor) {
            menorValor = val5;
        }

        if (val6 > maiorValor) {
            maiorValor = val6;
        } else if (val6 < menorValor) {
            menorValor = val6;
        }

        if (val7 > maiorValor) {
            maiorValor = val7;
        } else if (val7 < menorValor) {
            menorValor = val7;
        }

        if (val8 > maiorValor) {
            maiorValor = val8;
        } else if (val8 < menorValor) {
            menorValor = val8;
        }

        if (val9 > maiorValor) {
            maiorValor = val9;
        } else if (val9 < menorValor) {
            menorValor = val9;
        }

        if (val10 > maiorValor) {
            maiorValor = val10;
        } else if (val10 < menorValor) {
            menorValor = val10;
        }

        System.out.println("O maior valor é " + maiorValor);
        System.out.println("O menor valor é " + menorValor);

    }
    
}
