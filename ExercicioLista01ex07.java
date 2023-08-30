
package exerciciolista01ex07;

import java.util.Scanner;


public class ExercicioLista01ex07 {

    
    public static void main(String[] args) {
     Scanner n = new Scanner (System.in);
        System.out.println("informe um saldo: ");
        float saldo = n.nextFloat();
        System.out.println("informe um valor de Reajuste Porcentual: ");
        float reajustePorcentual = n.nextFloat();
        float valorReajuste = (float) ((saldo*reajustePorcentual)/100.0);
        float saldoComReajuste = saldo+valorReajuste;
        System.out.println("Valor do reajuste: " + valorReajuste);
        System.out.println("Saldo com reajuste de 18%: " + saldoComReajuste);
        
    }
    
}
//Informar um saldo e valor em % de reajuste de saldo.
//Imprimir o valor do reajuste e o saldo com reajuste de 18%.
///A fórmula para encontrar o reajuste é: valorReajuste = (saldo * reajuste) / 100;