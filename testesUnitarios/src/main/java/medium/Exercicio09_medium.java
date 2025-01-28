package medium;

import javax.swing.*;
import java.util.Random;

public class Exercicio09_medium {

    public void exibirNomeENumeracao(String [] nomeAlunos, int [] numeroAlunos) {
        if (nomeAlunos[0] == null || nomeAlunos[0].isEmpty()) {
            System.out.println("Não há alunos para serem mostrados");
        } else {
            for (int i = 0; i < nomeAlunos.length; i++) {
                System.out.println("Nome do Aluno: " + nomeAlunos[i] + " - Número: " + numeroAlunos[i]);
            }
        }
    }

    public int [] atribuirNumeracaoAlunos(String[] nomeAlunos) {
        int []numeroAlunos = new int[nomeAlunos.length];
        Random random = new Random();
        for (int i = 0; i < nomeAlunos.length; i++) {
            numeroAlunos[i] = random.nextInt(100);
        }
        return numeroAlunos;
    }
}
