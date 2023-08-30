
import java.util.Scanner;


 

public class ExercicioLIsta01Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner n = new Scanner (System.in);
        System.out.println("Conta Bancaria");
        System.out.println("Seu saldo é de R$0,00");
        System.out.println("Informe quanto você quer depositar: " );
        float deposito = n.nextFloat();
        System.out.println("Seu saldo é de: "+deposito);
        System.out.println("informe quanto você quer tirar de (débito)");
        float debito = n.nextFloat();
        float saldo = deposito-debito;
        System.out.println("seu saldo é de: "+saldo);
    }
    
}
