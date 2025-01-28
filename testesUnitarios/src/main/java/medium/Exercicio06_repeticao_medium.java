package medium;

import javax.swing.*;

public class Exercicio06_repeticao_medium {

    public int calculaFatorial(int numeroFatorialDigitado) {

        for (int i = numeroFatorialDigitado; i > 1; i--) {
            numeroFatorialDigitado = numeroFatorialDigitado * (i - 1);
        }
        if (numeroFatorialDigitado == 0) {
            System.out.println("O Fatorial do numero digitado é: 1");
        }
        return numeroFatorialDigitado;
    }
}
