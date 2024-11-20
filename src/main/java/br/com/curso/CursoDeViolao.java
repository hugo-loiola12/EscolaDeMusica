package br.com.curso;

import br.com.contrato.Curso;

public class CursoDeViolao extends Curso {
    public CursoDeViolao(String nivel, int duracao) {
        super("Curso de Violão", nivel, duracao);
    }

    @Override
    public double calcularCusto() {
        return getDuracao() * 40.0; // Exemplo: R$40 por hora.
    }
}
