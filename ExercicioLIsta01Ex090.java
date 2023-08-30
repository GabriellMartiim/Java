
package exerciciolista01ex090;

import java.util.Scanner;

public class ExercicioLIsta01Ex090 {

    
    public static void main(String[] args) {
        Scanner n = new Scanner (System.in);
        System.out.println("o primeiro valor corresponde a quantidade de pontos do líder do campeonato:");
        int pontosDolider = n.nextInt();
        System.out.println("informe um valor do time lanterno: ");
        int pontosDotime = n.nextInt();
        int vitoria = (pontosDolider-pontosDotime)/3 ;
        System.out.println("Para que o time lanterna venha a utrapassar: "+vitoria);
        
    }
    
}
