package br.com.pessoas;

import br.com.contrato.Agendamento;

public class Professor extends Pessoa implements Agendamento {

    private final String funcao;
    private final double salario;
    private final String matricula;

    public Professor(String nome, String cpf, int idade, String funcao, double salario, String matricula) {
        super(nome, cpf, idade);
        this.funcao = funcao;
        this.salario = salario;
        this.matricula = matricula;
    }

    @Override
    public void agendarAula() {
    }

    @Override
    public void cancelarAula() {
    }
}
