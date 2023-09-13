
package exerciciovogal2;

import java.util.Scanner;


public class ExercicioVogal2 {

   
    public static void main(String[] args) {
        Scanner n = new Scanner (System.in);
        System.out.println("informe uma vogal A,E,I,O,U:");
        char vogal = n.next().charAt(0);
        
        if(vogal == 'A'){
            System.out.println("\nA vogal subsequente é 'E'");
        }else if(vogal == 'E'){
            System.out.println("\nA vogal subsequente é 'I'");
        }else if(vogal == 'I'){
            System.out.println("\nA vogal subsequente é 'O'");
        }else if(vogal == 'O'){
            System.out.println("\nA vogal subsequente é 'U'");
        }else if(vogal == 'U'){
            System.out.println("\nA vogal subsequente é 'A'");
        }else{
            System.out.println("invalido");
        
            

    }

   
    }
    
}
