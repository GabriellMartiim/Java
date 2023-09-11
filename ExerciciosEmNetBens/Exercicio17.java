
package exercicio17;

import java.util.Scanner;


public class Exercicio17 {

    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        double salariominimo, precoBicicleta, lucroPorBicicleta, lucroLoja, salarioPorEmpregado, comissaoTotal, comissaoPorEmpregado, TotalEmpregado, lucroLiquido;
        int funcionarios, vendidasBici;
        
        System.out.print("Informe quantos funcionários há na loja: ");
        funcionarios = scanner.nextInt();
        System.out.print("Informe o valor do salário mínimo: ");
        salariominimo = scanner.nextDouble();
        System.out.print("Informe o preço de custo da bicicleta: ");
        precoBicicleta = scanner.nextDouble();
        System.out.print("Informe quantas bicicletas foram vendidas: ");
        vendidasBici = scanner.nextInt();
        
        lucroPorBicicleta = precoBicicleta + (0.50 * precoBicicleta);
        lucroLoja = vendidasBici * lucroPorBicicleta;
        
        System.out.println("\n50% de acréscimo na bicicleta: " + lucroPorBicicleta);
        
        salarioPorEmpregado = salariominimo * 2;
        comissaoTotal = 0.15 * precoBicicleta * vendidasBici;
        comissaoPorEmpregado = comissaoTotal / funcionarios;
        
        System.out.println("\nComissão para cada funcionário: " + comissaoPorEmpregado);
        
        TotalEmpregado = salarioPorEmpregado + comissaoPorEmpregado;
        lucroLiquido = lucroLoja - TotalEmpregado * funcionarios;
        
        System.out.println("\nO salário de cada funcionário foi de: " + TotalEmpregado);
        System.out.println("\nO lucro líquido foi de: " + lucroLiquido);
    }
    
}
