package br.com.pessoas;

import br.com.contrato.Agendamento;

public class Aluno extends Pessoa implements Agendamento {

    private int matricula;

    public Aluno(String nome, String endereco, int idade, int matricula) {
        super(nome, endereco, idade);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public void agendarAula() {

    }

    @Override
    public void cancelarAula() {

    }

    public void inscreverCurso() {
    }

    public void cancelarInscricao() {
    }
}
