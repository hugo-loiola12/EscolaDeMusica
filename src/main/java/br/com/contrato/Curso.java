package br.com.contrato;

public abstract class Curso {
    private final String nome;
    private final String nivel; // Básico, Intermediário, Avançado
    private final int duracao; // Em horas

    public Curso(String nome, String nivel, int duracao) {
        this.nome = nome;
        this.nivel = nivel;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public String getNivel() {
        return nivel;
    }

    public int getDuracao() {
        return duracao;
    }

    public abstract double calcularCusto(); // Método abstrato para personalizar o custo.
}

