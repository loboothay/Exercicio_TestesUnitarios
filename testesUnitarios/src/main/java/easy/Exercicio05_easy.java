package easy;

import javax.swing.*;

public class Exercicio05_easy {//Inicio

    public long calcularSoma(long primeiroValor, long segundoValor, long terceiroValor) { // inicio main
        long soma = primeiroValor + segundoValor + terceiroValor; // calculo da soma
        return soma;
    }// fim soma

    public long calcularSubtracao(long primeiroValor, long segundoValor, long terceiroValor) {
        long subtracao = segundoValor - primeiroValor; // Calculo subtracao
        return subtracao;
    }

    public long calcularMultiplicacao(long primeiroValor, long segundoValor, long terceiroValor) {
        long multiplicacao = primeiroValor * segundoValor * terceiroValor;// Calculo multiplicação
        return multiplicacao;
    }

    public long calcularMedia(long primeiroValor, long segundoValor, long terceiroValor) {
        long media = calcularMultiplicacao(primeiroValor, segundoValor, terceiroValor) / 3; // Calculo media
        return media;
    }

}//Fim
