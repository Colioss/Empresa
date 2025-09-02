//Desenvolvedor também herda de Funcionário

public class Desenvolvedor extends Funcionario {
// Atributo específico de um Desenvolvedor
private String linguagem;

public Desenvolvedor(String nome, double salario, String linguagem) {
    //Chamando o construtor da superclasse Funcionário
    super(nome, salario);
    this.linguagem = linguagem;

}

//Método específico de um Desenvolvedor
    public void programar() {
        System.out.println("O dev " + this.nome + " está programando em " + this.linguagem + ".");

    }

}
