//A palavra "extends" estabelece que Gerente é UM funcionário.
//Gerente herda nome, salario, e o metodo trabalhar() de Funcionário.


public class Gerente extends Funcionario {
    //Atributo específico de um Gerente
    private String departamento;

    //Construtor da classe filha
    public Gerente(String nome, double salario, String departamento) {
        //A palavra "super" chama o construtor da classe MÃE (Funcionário).
        //è obrigatória para inicializar os atributos que foram herdados (nome e salário).
        super(nome, salario);
        this.departamento = departamento;
    }

    //Método específico de um gerente
    public void aprovarVerba() {
        System.out.println("O gerente " + this.nome + " do depto " + this.departamento + " aprovou a verba.");

    }

}
