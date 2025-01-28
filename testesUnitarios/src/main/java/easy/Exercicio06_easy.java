package easy;

import javax.swing.*;

public class Exercicio06_easy {//inicio classe

    public String verificarAprovacaoAluno(double primeiraNota, double segundaNota) {// incio main

        double media = (primeiraNota + segundaNota) / 2;

        if (media > 5) {// inicio if
            return "Você está aprovado!!!";
        }// fim if
        if (media == 5) { // incio segundo if
            return "Você está de exame!!!";
        }// fim segundo if
        else { // abertura do else
            return "Você está reprovado!!!";
        } // fim do else
    }
}// fim da classe
