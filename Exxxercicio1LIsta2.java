
package exxxercicio1lista2;

import java.util.Scanner;


public class Exxxercicio1LIsta2 {

    
    public static void main(String[] args) {
     Scanner n = new Scanner (System.in);
        System.out.println("informe sua idade:");
        int idade = n.nextInt();
        if(idade <18){
            System.out.println("você é menor de idade");
        }else if(idade >= 18 && idade < 65){
            System.out.println("Maior de idade");
        }else{
            System.out.println("Você é idoso");
         
        }
        
    }
    
}

