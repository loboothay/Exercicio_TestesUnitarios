package medium;

public class Exercicio04_medium {
    public void multiplicaAteMilIteracoes() {

        int multiplicacao = 1;

        for (int i = 1; i <= 1000; i++) {
            multiplicacao = i * multiplicacao;
            System.out.println(i +" X " + multiplicacao +" = " +multiplicacao);
            if (multiplicacao >= 1000) {
                multiplicacao = 1;
            }
        }

        System.out.println("Fim das multiplicações");
    }
}
