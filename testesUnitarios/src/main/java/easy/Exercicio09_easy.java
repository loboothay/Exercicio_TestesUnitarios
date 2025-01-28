package easy;

import javax.swing.*;

public class Exercicio09_easy {// incio classe

    public void calcularEexibirTabuada( int numeroDigitado) {//incio main

        if (numeroDigitado <= 0 || numeroDigitado > 10) {
            System.out.println("Numero invalido!!!");
        } else {
            for (int i = 1; i <= 10; i++) {
                System.out.println(numeroDigitado + " X " + i + " = " + (numeroDigitado * i));
            }
        }
    }//fim main
}//fim classe
