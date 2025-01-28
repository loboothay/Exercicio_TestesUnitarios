package medium;

import javax.swing.*;

public class Exercicio05_vetor_medium {
    public int retornaOmenorNumero(int[] vetorNumeros) {
        int i = 0;
        int menorNumero = 0;

       menorNumero = vetorNumeros[0];
        for (i = 0; i < vetorNumeros.length; i++) {//inico for
            if (vetorNumeros[i] < menorNumero) {
                menorNumero = vetorNumeros[i];
            }

        }// fim for
      return menorNumero;

    }
}
