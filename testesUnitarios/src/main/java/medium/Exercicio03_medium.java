package medium;

public class Exercicio03_medium {
    public void somaAteMil() {
        int soma = 0;
        int limite = 1500;
        for (int i = 0; i <= 1000; i++) {
            soma = i + soma;
            System.out.println("Iteração : " + i + " | Soma: " + soma);
            if (soma >= limite) {
                break;
            }
        }

        System.out.println("Limite Atingido!!!");
    }
}
