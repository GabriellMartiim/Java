
package exercicio6calculadora;

import java.util.Scanner;


public class Exercicio6Calculadora {

    public static void main(String[] args) {
        Scanner n = new Scanner (System.in);
        System.out.println("Escolha uma das opeções abaixo ");
        System.out.println("\n[1] - soma");
        System.out.println("\n[2] - subtração");
        System.out.println("\n[3] - multiplicação");
        System.out.println("\n[4] - divisão");
        System.out.println("Escolha: ");
        byte opcao = n.nextByte();
        switch(opcao){
            case 1:
                System.out.println("informe dois valores:");
                float valor1 = n.nextFloat();
                float valor2 = n.nextFloat();
                System.out.println("A soma dos dois valores é de:"+valor1+valor2);
            break;
            case 2:
                System.out.println("informe dois valores:");
                float val1 = n.nextFloat();
                float val2 = n.nextFloat();
                System.out.println("A subtração dos dois valores é de: "+(val1-val2));
            break;
            case 3:
                System.out.println("informe dois valores abaixo:");
                float v1 = n.nextFloat();
                float v2 = n.nextFloat();
                System.out.println("A multiplicaçao dos dois valores é de:"+(v1*v2));
                break;
            case 4:
                System.out.println("informe dois valores abaixo: ");
                float nu1 = n.nextFloat();
                float nu2 = n.nextFloat();
                if(nu2 == 0){
                System.out.println("valor invalido");
                }else{
                    System.out.println("A divisão dos dois valroes é de:"+(nu1/nu2));
                    break;
                    
                  
                   
                }
        
    }
    

    }
}
