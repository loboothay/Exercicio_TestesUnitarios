package exercicio_instancia_metodos;

//1- Criar uma classe;
//2- Criar 5 metodos com retorno, recebendo parametros:
//3- Criar 5 metodos sem retorno, recebendo parametros:
// 4- Exibir o valor do(s) parametros enviados;
//5- Fazer a chamada destes 10 métodos em um main.


public class MetodosComParametros {

    public static void metodoUmSemRetorno(String nome){
        System.out.println(nome);
    }

    public static String metodoUmComRetorno(String nome){
        return "O parametro enviado é: "+nome;
    }

    public static void main(String[] args) {
        metodoUmSemRetorno("Flavio");
        System.out.println(metodoUmComRetorno("Adriana"));
    }

}
