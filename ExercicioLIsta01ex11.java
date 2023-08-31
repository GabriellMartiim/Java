package exerciciolista01ex11;

import java.util.Scanner;

public class ExercicioLIsta01ex11 {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("informe a cotação do dólar: ");
        float dolar = n.nextFloat();
        System.out.println("informe o valor em Dólares: ");
        float valorEmDolar = n.nextFloat();
       float convertido = dolar*valorEmDolar;
        System.out.println("o valor convertido para real é de: "+convertido);
    }

}
//10.
//Faça um programa que
//✔
//Leia a cotação do dólar
//✔
//Leia um valor em dólares
//✔
//Converta esse valor para Real
//✔
//Mostre o resultado
