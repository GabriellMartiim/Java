import java.util.Scanner;

public class VetorEx1 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int[] numero = new int[10];
        int Maiornumero = Integer.MIN_VALUE;
        int Menornumero = Integer.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
            System.out.println("Informe o " + (i + 1) + "º valor inteiro:");
            numero[i] = n.nextInt();

            if (numero[i] > Maiornumero) {
                Maiornumero = numero[i];
            }

            if (numero[i] < Menornumero) {
                Menornumero = numero[i];
            }
        }

        System.out.println("O maior número é: " + Maiornumero);
        System.out.println("O menor número é: " + Menornumero);
    }
}