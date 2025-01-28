package exercicios_instancia;

//Exercícios instância de classe:
//  1- Criar um pacote e uma classe(sem metodo main);
//2- Criar 3 metodos;
//3- Criar 2 variaveis(pode ser String);
//4- Criar Classe Execucao.java
//5- Criar Metodo main, na classe Execucao.java;
//6- Instanciar a classe criada anteriormente;
//Ex: public Classe obj_nomeDoObjeto= new Classe();
//
//7- Exibir o valor das variáveis;
//	(obj_nomeDoObjeto.nomeDaVariavel);
//        8- Executar todos os métodos da classe criada, no metodo main da classe Execucao.
//        obj_Modelagem.metodo1();
//	obj_Modelagem.metodo2();
//obj_Modelagem.metodo3();

public class Exercicio_instancia {

    String cidade = "Fatima";
    String pais = "Brasil";


    public void nomeAluno() {
        System.out.println("Flavio");
    }

    public int calcularDobro(int numero) {
        return numero * 2;
    }

    public String exibirNomeDoMedoto(){
        return  "exibirNomeDoMedoto";
    }
}
