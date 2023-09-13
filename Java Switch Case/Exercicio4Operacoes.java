/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio4operacoes;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Exercicio4Operacoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner n = new Scanner (System.in);
        System.out.println("Escolha uma opção de baixo");
        System.out.println("\n[1] - soma");
        System.out.println("\n[2] - multiplicação");
        System.out.println("\n[3] - finalizar");
        byte opcao = n.nextByte();
        switch(opcao){
            case 1:
                System.out.println("informe dois valores:");
                 float  valor1 = n.nextFloat();
                 float valor = n.nextFloat();
                 System.out.println("a soma dos dois valores é de:"+(valor+valor1));
                   break;
            case 2:
                System.out.println("informe dois valores:");
                float val1 = n.nextFloat();
                float val = n.nextFloat();
                System.out.println("a multplicação dos dois valores é de:"+(val1*val));
                break;
            case 3:
                System.out.println("volte sempre!");
              break;
            default :
                System.out.println("opção invalida");
                
        }
    }
    
}




