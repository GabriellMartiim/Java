
package exercicio3mes;

import java.util.Scanner;

public class Exercicio3Mes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner n = new Scanner (System.in);
        System.out.println("Informe um numero que seja correspondente a algum mês:");
        byte mes = n.nextByte();
        switch(mes){
            case 1:
                System.out.println(" o mês é Janeiro");
                break;
            case 2:
                System.out.println("o mês é Fevereiro");
            case 3:
                System.out.println("o mês é Março");
                break;
            case 4:
                System.out.println("o mês é Abril");
                break;
            case 5:
                System.out.println("o mês é Maio");
                break;
            case 6:
                System.out.println("o mês é Junho");
                break;
            case 7:
                System.out.println("o mês é Julho");
                break;
            case 8:
                System.out.println("o mês é agosto");
                break;
            case 9:
                System.out.println("o mês é setembro");
                break;
            case 10:
                System.out.println("o mês é outubro");
                break;
            case 11:
                System.out.println("o mês é novembro");
                break;
            case 12:
                System.out.println("o mês é dezembro");
                break;
            default:
                System.out.println("opção invalida");
                
                
        }
    }
    
}

Maio
Junho
Julho
Agosto
Setembro
Outubro
Novembro
Dezembro