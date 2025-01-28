package medium;

import javax.swing.*;

public class Exercicio06_vetor_medium {

    public static void main(String[] args) {

        int numeroFatorialDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro, para calcular o fatorial"));
        int fatorial = numeroFatorialDigitado;
        int [] vetorFatorial = new int[numeroFatorialDigitado];
        for (int i = numeroFatorialDigitado; i >= 1; i--) {
            vetorFatorial[i-1] = i;
        }
        for (int i = numeroFatorialDigitado-1; i >=1; i--) {
            fatorial = fatorial * vetorFatorial[i-1];
        }
        System.out.println("O Fatorial de: "+numeroFatorialDigitado+ " - é igual: "+fatorial);
    }
}
