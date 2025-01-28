package easy;

import javax.swing.*;

public class Exercicio10_1_easy_comWhile {// incio classe

    public double calcularInvestimentoJurosSimples(double valorInvestimento) {// inico main

        double taxaJuros = 0.12;
        int tempoInvestido = 10;
        double taxaJurosTotal = 0.0;

        for (int i = 1; i <= tempoInvestido; i++) {
            taxaJurosTotal = taxaJurosTotal + taxaJuros;
        }
        double valorTotal = (valorInvestimento * taxaJurosTotal) + valorInvestimento;

        return valorTotal;
    }// fim

    public double calcularValorDeJuros(double valorTotal, double valorInvestimento){
        return (valorTotal - valorInvestimento);
    }

}// fim da classe
