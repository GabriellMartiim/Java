
package exercicio2lista2;

import java.util.Scanner;


public class Exercicio2LIsta2 {

    
    public static void main(String[] args) {
       Scanner n = new Scanner (System.in);
        System.out.println("informe seu peso: ");
        float peso = n.nextFloat();
        System.out.println("informe sua altura: ");
        float altura = n.nextFloat();
        float formula = peso/altura*altura;
        
        if(formula < 18.5){
            System.out.println("Abaixo do peso");
        }else if(formula >= 18.5 && formula <= 24.9){
            System.out.println("peso normal");
        }else if(formula >= 25.0 && formula <= 29.9){
            System.out.println("sobre peso");
        }else if(formula >= 30.0 && formula <= 34.9){
            System.out.println("Obesidade grau 1");
        }else if(formula >= 35.0 && formula <= 39.9){
            System.out.println("obesidade grau 2");
        }else{
            System.out.println("obesidade grau 3");
        
            
        }
       
    }
    
}
