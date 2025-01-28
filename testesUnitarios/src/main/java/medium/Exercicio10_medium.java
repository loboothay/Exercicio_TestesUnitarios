package medium;

import javax.swing.*;

public class Exercicio10_medium {
    public int[] calcularFibonacci(int elemento) {
        int [] vetorFibonacci = new int [elemento];
        vetorFibonacci[0] = 0;
        vetorFibonacci[1] = 1;
        for (int i = 2; i < vetorFibonacci.length; i++) {
            vetorFibonacci[i] = vetorFibonacci[i-1] + vetorFibonacci[i-2];
        }
        return vetorFibonacci;
    }
    public void exibirVetor(int[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
