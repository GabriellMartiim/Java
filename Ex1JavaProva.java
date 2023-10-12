package ex1javaprova;

import java.util.Scanner;

public class Ex1JavaProva {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int contador = 0, n1, soma = 0;
        float numero;
        System.out.println("\nInforme 10 valores inteiros");
        while (contador < 10){
        contador++;
        System.out.println("Informe " + contador +"º número inteiro:");
        n1 = n.nextInt();
        soma = n1 + soma;
    }
        System.out.println("A soma dos"+contador+"números informados é: "+soma+" ");
    }   
}

   
    
