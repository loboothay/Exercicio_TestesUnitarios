package exercicios_instancia;

public class Execucao {

    public static void main(String[] args) {
        Exercicio_instancia obj_exercicio_instancia = new Exercicio_instancia();
        System.out.println(obj_exercicio_instancia.pais + " | " + obj_exercicio_instancia.cidade);
        obj_exercicio_instancia.nomeAluno();
        System.out.println(obj_exercicio_instancia.calcularDobro(2));
        System.out.println(obj_exercicio_instancia.exibirNomeDoMedoto());
    }
}
