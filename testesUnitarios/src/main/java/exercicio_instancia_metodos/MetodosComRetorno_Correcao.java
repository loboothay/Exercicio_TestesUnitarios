package exercicio_instancia_metodos;

//1- criar uma classe;
//2- criar 5 metodos com retorno:
//3- adicionar uma instrução para retornar o nome do método;
//4- fazer a chamada destes 5 métodos em um main.


public class MetodosComRetorno_Correcao {

    public static String metodoUm() {
        return "metodoUm";
    }

    public static String metodoDois() {
        return "metodoDois";
    }

    public static String metodoTres() {
        return "metodoTres";
    }

    public static String metodoQuatro() {
        return "metodoQuatro";
    }

    public static String metodoCinco() {
        return "metodoCinco";
    }

    public static void main(String[] args) {
        System.out.println(metodoUm());
        System.out.println(metodoCinco());
        System.out.println(metodoQuatro());
        System.out.println(metodoTres());
        System.out.println(metodoDois());
    }
}
