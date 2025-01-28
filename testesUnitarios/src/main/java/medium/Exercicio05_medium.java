package medium;

import javax.swing.*;

public class Exercicio05_medium {

    public static void main(String[] args) {
        int i = 1;
        int numeroDigitado = 0;
        int menorNumero = 0;

        while (i <= 5) {
            numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro:"));
            System.out.println(numeroDigitado);
            if (numeroDigitado < menorNumero || i == 1) {
                menorNumero = numeroDigitado;
            }
            i++;
        }
        System.out.println("O menor numero digitado é: " + menorNumero);
    }

    public void menorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++) {

            int numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
            if (numeroDigitado < menorNumero) {
                menorNumero = numeroDigitado;
            }
        }
        System.out.println("O menor numero será: "+menorNumero);
    }
}
