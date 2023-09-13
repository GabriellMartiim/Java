
package exercicio8positivo;

import java.util.Scanner;


public class Exercicio8Positivo {

    
    public static void main(String[] args) {
       Scanner n = new Scanner (System.in);
        System.out.println("informe um numero inteiro: ");
        int valor1 = n.nextInt();
        if(valor1 > 0){
            System.out.println("Positivo");
        }else if(valor1 < 0){
            System.out.println("Negativo");
        }else{
            
            System.out.println("o valor é '0'");
        }
        }
       
    }
    

