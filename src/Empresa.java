public class Empresa {
    public static void main (String[] args) {
        //Criando um objeto Gerente
        Gerente gerente = new Gerente ("Ana Silva", 7500.0, "Financeiro");

                //Criando um objeto Desenvolvedor
        Desenvolvedor dev = new Desenvolvedor ("João Costa", 5000.0, "Java");

        System.out.println("Dados do Gerente");
        System.out.println("Nome: " + gerente.getNome()); //Get nome e This são fixos, get nome serve para puxar o nome
        System.out.println("Salário: " + gerente.getSalario());
        gerente.trabalhar(); //Método herdado de Funcionario
        gerente.aprovarVerba(); //Método específico de Gerente

        System.out.println("\nDados do Desenvolvedor");
        System.out.println("Nome: " + dev.getNome()); // Método herdado de Funcionário
        System.out.println("Salário: " +dev.getSalario());
        dev.trabalhar(); //Método herdado de Funcionário
        dev.programar(); //Método específico de Desenvolver
    }

}



