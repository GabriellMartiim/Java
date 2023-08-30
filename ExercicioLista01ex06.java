
package exerciciolista01ex06;

import java.util.Scanner;


public class ExercicioLista01ex06 {

    
    public static void main(String[] args) {
        Scanner n = new Scanner (System.in);
     
        int media1 = (8+9+7)/3;
        System.out.println("a média dos números 8, 9 e 7 é de: "+media1);
        int media2 = (4+5+6)/3;
        System.out.println(" média dos números 4, 5 e 6 é de: "+media2);
        int somamedia = (media1+media2);
        System.out.println("A soma das duas médias acima é de: "+media1+media2);
        int mediamedia = (8+9+7+4+5+6)/6;
        System.out.println("A média das médias é de: "+mediamedia);
    }
    
}
//a média dos números 8, 9 e 7.
//✔ a média dos números 4, 5 e 6.
//✔ a soma das duas médias.
//✔ a média das médias.