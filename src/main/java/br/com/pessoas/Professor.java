package br.com.pessoas;

public class Professor extends Pessoa {

    private final String funcao;
    private final double salario;
    private final String matricula;

    public Professor(String nome, String cpf, String telefone, String email, String endereco, int idade, String funcao, double salario, String matricula) {
        super(nome, cpf, telefone, email, endereco, idade);
        this.funcao = funcao;
        this.salario = salario;
        this.matricula = matricula;
    }

    void agendarAula() {
    }

    void cancelarAula() {
    }

}
