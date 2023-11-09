
package vetorex3;


import java.util.Scanner;

public class VetorEx3 {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        double[] media = new double[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe a média do" + i + "aluno");
            media[i] = n.nextInt();
        }
        if (media[i] < 6 || media[i] > 10) {
            System.out.println("Programa Encerrado!!");
        }

    }
}
