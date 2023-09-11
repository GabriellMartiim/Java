
package exercicio25;

import java.util.Scanner;

public class Exercicio25 {

   
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        double GanhaPorHora, salarioTotal;
        int horasNomes;

        System.out.print("Informe quantas horas você trabalha em um mês: ");
        horasNomes = scanner.nextInt();

        System.out.print("Informe quanto você ganha por hora: ");
        GanhaPorHora = scanner.nextDouble();

        if (horasNomes <= 160) {
            salarioTotal = horasNomes * GanhaPorHora;
            System.out.println("O salário total é de R$ " + salarioTotal);
        } else {
            salarioTotal = (160 * GanhaPorHora) + ((horasNomes - 160) * (GanhaPorHora * 1.5));
            System.out.println("O salário total do funcionário é de R$ " + salarioTotal);
        }

        scanner.close();
    }
    
}
