
public class Main {

    public static void main(String[] args) {

        //  Criação de Variáveis:
        int idade = 17; // Um número inteiro representando a idade de uma pessoa.
        double altura = 1.90; // Um número decimal representando a altura.
        String nome = "Felipe"; // Uma string representando o nome da pessoa.
        boolean estudante = true; // Uma variável booleana para indicar se a pessoa é estudante.

        // 4. Operações Simples:
        int idadeDois = 30; // Uma segunda idade para soma
        int somaIdades = idade + idadeDois; // Soma das idades

        double alturaDuplicada = altura * 2; // Multiplicação da altura por 2

        String saudacao = "Olá, " + nome + "!"; // Concatenação de nome com saudação

        //  Exibição de Resultados:
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Nome: " + nome);
        System.out.println("Estudante: " + estudante);

        System.out.println("Soma das idades: " + somaIdades);
        System.out.println("Altura duplicada: " + alturaDuplicada + " metros");
        System.out.println(saudacao);
    }
}