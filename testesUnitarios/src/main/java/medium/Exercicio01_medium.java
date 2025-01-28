package medium;

public class Exercicio01_medium {

    public String verificaParOuImpar(int numero) {

        if (numero % 2 == 0) {
            return ("O Numero: " + numero + " - é Par");
        } else {
            return ("O Numero: " + numero + " - é ímpar");
        }
    }
}
