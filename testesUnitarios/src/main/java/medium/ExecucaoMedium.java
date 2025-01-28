package medium;

public class ExecucaoMedium {
    public static void main(String[] args) {
//
//        Exercicio01_medium exercicio01Medium = new Exercicio01_medium();
//        int numero = 1;
//        System.out.println(exercicio01Medium.verificaParOuImpar(numero));

//        double valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor de investimento"));
//        Exercicio02_medium exercicio02Medium = new Exercicio02_medium();
//        double valorTotal = exercicio02Medium.calcularInvstimentoJurosCompostos(valorInvestimento);
//
//        System.out.println("O Valor investido foi de R$ " + valorInvestimento);
//        System.out.println("O Valor total com juros foi de R$ " + valorTotal);
//        System.out.println("O Valor de juros foi de R$ " + exercicio02Medium.calcularValorDosJuros(valorTotal, valorInvestimento));

//        Exercicio03_medium exercicio03Medium = new Exercicio03_medium();
//        exercicio03Medium.somaAteMil();

//        Exercicio04_medium exercicio04Medium = new Exercicio04_medium();
//        exercicio04Medium.multiplicaAteMilIteracoes();

//        int [] vetorNumeros = {2,3,5,8,5};
//        Exercicio05_vetor_medium exercicio05_medium = new Exercicio05_vetor_medium();
//        System.out.println("O menor numero do vetor é: "+exercicio05_medium.retornaOmenorNumero(vetorNumeros));

//        int numeroFatorialDigitado = 10;
//        Exercicio06_repeticao_medium exercicio06Medium = new Exercicio06_repeticao_medium();
//        System.out.println("O Fatorial do numero digitado é: " +exercicio06Medium.calculaFatorial(numeroFatorialDigitado) );

//        Exericio07_08_medium exericio0708Medium = new Exericio07_08_medium();
//        exericio0708Medium.exibirMesesDoAno();

//        String[] nomeAlunos = {"Flavio", "Adriana", "Valeria", "Jessé", "Adnys"};
//        Exercicio09_medium exercicio09Medium = new Exercicio09_medium();
//        int[] numeroAlunos = exercicio09Medium.atribuirNumeracaoAlunos(nomeAlunos);
//        exercicio09Medium.exibirNomeENumeracao(nomeAlunos, numeroAlunos);

        int elemento = 10;
        Exercicio10_medium exercicio10Medium = new Exercicio10_medium();
        int[] vetorFibonacci = exercicio10Medium.calcularFibonacci(elemento);
        exercicio10Medium.exibirVetor(vetorFibonacci);

    }
}
