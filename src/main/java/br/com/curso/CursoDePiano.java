package br.com.curso;

import br.com.contrato.Curso;

public class CursoDePiano extends Curso {
    public CursoDePiano(String nivel, int duracao) {
        super("Curso de Piano", nivel, duracao);
    }

    @Override
    public double calcularCusto() {
        return getDuracao() * 50.0; // Exemplo: R$50 por hora.
    }
}

