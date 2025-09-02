public class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    //Método comum a todos os funcionários
    public void trabalhar() {
        System.out.println(this.nome + " está trabalhando.");

    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

}
