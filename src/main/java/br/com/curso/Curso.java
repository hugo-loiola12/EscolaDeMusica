package br.com.curso;

public class Curso {

    private String nome;
    private int duracao;
    private String nivel;

    public Curso(String nome, int duracao, String nivel) {
        this.nome = nome;
        this.duracao = duracao;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}
