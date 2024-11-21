package br.com.pessoas;

import br.com.util.observer.Observer;

public class Aluno extends Pessoa implements Observer {

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
    public void atualizacaoPendente(String mensagem) {
        System.out.println("Notificação para Aluno " + super.getNome() + ": " + mensagem);
    }
}
