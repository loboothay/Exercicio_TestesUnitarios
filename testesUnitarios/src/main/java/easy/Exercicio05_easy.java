package easy;

import javax.swing.*;

public class Exercicio05_easy {//Inicio

    public Integer calcularSoma(int primeiroValor, int segundoValor, int terceiroValor) { // inicio main
        int soma = primeiroValor + segundoValor + terceiroValor; // calculo da soma
        return soma;
    }// fim soma

    public Integer calcularSubtracao(int primeiroValor, int segundoValor, int terceiroValor) {
        int subtracao = segundoValor - primeiroValor; // Calculo subtracao
        return subtracao;
    }

    public Integer calcularMultiplicacao(int primeiroValor, int segundoValor, int terceiroValor) {
        int multiplicacao = primeiroValor * segundoValor * terceiroValor;// Calculo multiplicação
        return multiplicacao;
    }

    public Integer calcularMedia(int primeiroValor, int segundoValor, int terceiroValor) {
        int media = calcularMultiplicacao(primeiroValor, segundoValor, terceiroValor) / 3; // Calculo media
        return media;
    }

}//Fim
