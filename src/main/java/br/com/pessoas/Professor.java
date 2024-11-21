package br.com.pessoas;

import br.com.util.observer.Observer;

public class Professor extends Pessoa implements Observer {

    private String funcao;
    private double salario;
    private int matricula;

    public Professor(String nome, String cpf, int idade, String funcao, double salario, int matricula) {
        super(nome, cpf, idade);
        this.funcao = funcao;
        this.salario = salario;
        this.matricula = matricula;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }


    @Override
    public void atualizacaoPendente(String mensagem) {
        System.out.println("Notificaçao para Professor" + super.getNome() + ": " + mensagem);
    }
}
