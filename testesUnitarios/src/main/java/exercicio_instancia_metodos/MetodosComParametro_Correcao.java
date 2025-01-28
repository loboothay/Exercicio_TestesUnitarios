package exercicio_instancia_metodos;

//1- Criar uma classe;
//
//2- Criar 5 metodos com retorno, recebendo parametros:
//
//        3- Criar 5 metodos sem retorno, recebendo parametros:
//
//        4- Exibir o valor do(s) parametros enviados;
//
//5- Fazer a chamada destes 10 métodos em um main.


public class MetodosComParametro_Correcao {

    public static String metodoUmComRetorno(String parametro) {
        return parametro;
    }

    public static String metodoDoisComRetorno(String parametro) {
        return parametro;
    }

    public static String metodoTresComRetorno(String parametro) {
        return parametro;
    }

    public static String metodoQuatroComRetorno(String parametro) {
        return parametro;
    }

    public static String metodoCincoComRetorno(String parametro) {
        return parametro;
    }

    public static void metodoUmSemRetorno(String parametro) {
        System.out.println(parametro);
    }

    public static void metodoDoisSemRetorno(String parametro) {
        System.out.println(parametro);
    }

    public static void metodoTresSemRetorno(String parametro) {
        System.out.println(parametro);
    }

    public static void metodoQuatroSemRetorno(String parametro) {
        System.out.println(parametro);
    }

    public static void metodoCincoSemRetorno(String parametro) {
        System.out.println(parametro);
    }

    public static void main(String[] args) {
        System.out.println(metodoUmComRetorno("Flavio"));
        System.out.println(metodoDoisComRetorno("Adriana"));
        System.out.println(metodoTresComRetorno("Adnys"));
        System.out.println(metodoQuatroComRetorno("Jessé"));
        System.out.println(metodoCincoComRetorno("Valeria"));

        metodoUmSemRetorno("Flavio - 1");
        metodoDoisSemRetorno("Adriana - 2");
        metodoTresSemRetorno("Adnys - 3");
        metodoQuatroSemRetorno("Jessé - 4");
        metodoCincoSemRetorno("Valeria - 5");



    }


}
