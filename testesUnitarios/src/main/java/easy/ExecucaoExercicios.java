package easy;

import javax.swing.*;

public class ExecucaoExercicios {
    public static void main(String[] args) {
//        Exercicio02_easy exercicio02Easy = new Exercicio02_easy();
//        System.out.println(exercicio02Easy.exibirPalavra("Estudar faz bem"));

//        Exercicio03_easy execicio03_ease = new Exercicio03_easy(); // Instancia da classe.
//        String primeiroValor = JOptionPane.showInputDialog("Digite o primeiro valor");
//        String segundoValor = JOptionPane.showInputDialog("Digite o segundo valor");
//        String texto = execicio03_ease.trocaValoresDigitados(primeiroValor, segundoValor);
//        System.out.println(texto);

//        Exercicio04_easy exercicio04_easy = new Exercicio04_easy();
//        int numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um inteiro"));
//        System.out.println("O dobro do numero que você digitou é: "+ exercicio04_easy.calcularDobro(numeroDigitado)); // Exibe o valor da variavel com o um texto concatenado.

//        int primeiroValor = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero inteiro")); // Leitura do primeiro numero
//        int segundoValor = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero inteiro"));// Leitura do segundo numero
//        int terceiroValor = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro numero inteiro"));// Leitura do terceiro numero
//        Exercicio05_easy exercicio05Easy = new Exercicio05_easy();
//        System.out.println("A soma dos numeros digitados é: " + exercicio05Easy.calcularSoma(primeiroValor, segundoValor, terceiroValor)); // Exibição soma
//        System.out.println("A subtração dos numeros digitados é: " + exercicio05Easy.calcularSubtracao(primeiroValor, segundoValor, terceiroValor)); // Exibição subtração
//        System.out.println("A multiplicação dos numeros digitados é:" + exercicio05Easy.calcularMultiplicacao(primeiroValor, segundoValor, terceiroValor));  // Exibição multiplicação
//        System.out.println("A média dos numeros digitados é:" + exercicio05Easy.calcularMedia(primeiroValor, segundoValor, terceiroValor));  // Exibição media


//        double primeiraNota = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
//        double segundaNota = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));
//        Exercicio06_easy exercicio06Easy = new Exercicio06_easy();
//        System.out.println(exercicio06Easy.verificarAprovacaoAluno(primeiraNota, segundaNota));


//        double salario = Double.parseDouble(JOptionPane.showInputDialog("Digitar Salario"));
//        Exercicio07_easy exercicio07Easy = new Exercicio07_easy();
//        System.out.println("O Inss a ser pago será de: R$" + exercicio07Easy.calcularInns(salario));

//        double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario bruto"));
//        Exercicio08_easy exercicio08Easy = new Exercicio08_easy();
//        Double impostoRenda = exercicio08Easy.calcularIR(salario);
//        System.out.println("O Salario bruto será de: " + salario);
//        System.out.println("O Imposto de renda devido será de: " + impostoRenda);
//        System.out.println("O Salario liquido será de: " + exercicio08Easy.calcularSalarioLiquido(salario,impostoRenda));


//        Exercicio09_easy exercicio09Easy = new Exercicio09_easy();
//        exercicio09Easy.calcularEexibirTabuada(10);

//        double valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor investido"));
//        Exercicio10_1_easy_comWhile exercicio101EasyComWhile = new Exercicio10_1_easy_comWhile();
//        double valorTotal = exercicio101EasyComWhile.calcularInvestimentoJurosSimples(valorInvestimento);
//
//        System.out.println("Valor Investido: " + valorInvestimento);
//        System.out.println("Valor Total: " +valorTotal);
//        System.out.println("Valor de juros acumulado: " +exercicio101EasyComWhile.calcularValorDeJuros(valorTotal, valorInvestimento));

        int numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
        Exercicio11_easy exercicio11Easy = new Exercicio11_easy();
        exercicio11Easy.somaDoisAoNumeroDigitado(numeroDigitado);

    }
}
