import easy.Exercicio02_easy;
import easy.Exercicio03_easy;
import easy.Exercicio04_easy;
import easy.Exercicio05_easy;
import org.junit.Assert;
import org.junit.Test;

public class TestesUnitariosEasy {
    @Test
    public void TesteUnitarioEx2_TestePalavraDigitada(){
        Exercicio02_easy exercicio02Easy = new Exercicio02_easy();
        String palavraDigitada = "Teste Unitário Exercício 2";
        Assert.assertEquals("Você digitou: " + palavraDigitada, exercicio02Easy.exibirPalavra(palavraDigitada));
    }

    @Test
    public void TesteUnitarioEx3_TrocaDeValoresDigitados(){
        Exercicio03_easy exercicio03Easy = new Exercicio03_easy();
        String primeiroValor = "Oi eu sou a primeiro valor";
        String segundoValor = "Oi eu sou a segundo valor";
        String mensagemTrocada = "Primeiro valor:" + segundoValor + " | Segundo valor: " + primeiroValor;
        Assert.assertEquals(mensagemTrocada, exercicio03Easy.trocaValoresDigitados(primeiroValor, segundoValor));
    }

    @Test
    public void TesteUnitarioEx4_CalculaDobro(){
        Exercicio04_easy exercicio04Easy = new Exercicio04_easy();
        long numeroDigitado = 2;
        long numeroDobrado = 4;
        Assert.assertEquals(numeroDobrado, exercicio04Easy.calcularDobro(numeroDigitado));
    }

    @Test
    public void TesteUnitarioEx5_CalcularSoma(){
        Exercicio05_easy exercicio05Easy = new Exercicio05_easy();
        long primeiroValor = 1;
        long segundoValor = 2;
        long terceiroValor = 3;

        Assert.assertEquals(6, exercicio05Easy.calcularSoma(primeiroValor, segundoValor, terceiroValor));
    }

    @Test
    public void TesteUnitarioEx5_CalculaSubtracao(){
        Exercicio05_easy exercicio05Easy = new Exercicio05_easy();
        long primeiroValor = 1;
        long segundoValor = 2;

        Assert.assertEquals(1, exercicio05Easy.calcularSubtracao(primeiroValor, segundoValor, 0));
    }

    @Test
    public void TesteUnitarioEx5_CalcularMultiplicacao(){
        Exercicio05_easy exercicio05Easy = new Exercicio05_easy();
        long primeiroValor = 1;
        long segundoValor = 2;
        long terceiroValor = 3;

        Assert.assertEquals(6, exercicio05Easy.calcularMultiplicacao(primeiroValor, segundoValor, terceiroValor));
    }

    @Test
    public void TesteUnitarioEx5_CalcularMedia(){
        Exercicio05_easy exercicio05Easy = new Exercicio05_easy();
        long primeiroValor = 6;
        long segundoValor = 6;
        long terceiroValor = 6;

        Assert.assertEquals(72, exercicio05Easy.calcularMedia(primeiroValor, segundoValor, terceiroValor));
    }
}
