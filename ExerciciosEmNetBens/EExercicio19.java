
package eexercicio19;

import java.util.Scanner;


public class EExercicio19 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int serie, AlunosporTurma, diferenca;

        System.out.print("Informe o número de alunos na série: ");
        serie = scanner.nextInt();

        AlunosporTurma = serie / 3;
        diferenca = serie % 3;

        if (diferenca == 0) {
            System.out.println("\nO número de alunos em cada turma é de: " + AlunosporTurma);
        } else {
            System.out.println("\nO número de alunos em cada turma é de: " + AlunosporTurma);
            System.out.println("O número extra de alunos é de: " + diferenca);
    }
    }
}
