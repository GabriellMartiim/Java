
package exerciciolista01ex04;

import java.util.Scanner;


public class ExercicioLista01ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner n = new Scanner (System.in);
        System.out.println("informe seu salario  mensal:");
        float salarioMensal = n.nextFloat();
        System.out.println("informe quantas horas você trabalha por mês: ");
        float horasTrabalhadasMes = n.nextFloat();
        float valorHora = salarioMensal/horasTrabalhadasMes;
        System.out.println("o valor que você recebe por hora é de: "+valorHora);
    }
    
}
  //**Scanner n = new Scanner (System.in);
      //  float salarioMensal = 3000f;
       // float horasTrabalhadasMes = 160f;
        //float valorHora = salarioMensal/horasTrabalhadasMes;
       // System.out.println("O valor que o funcionario recebe por hora é de : "+valorHora);
        