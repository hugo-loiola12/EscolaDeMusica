package br.com.curso;

import br.com.contrato.Curso;

public class CursoDeTeoriaMusical extends Curso {
    public CursoDeTeoriaMusical(String nivel, int duracao) {
        super("Curso de Teoria Musical", nivel, duracao);
    }

    @Override
    public double calcularCusto() {
        return getDuracao() * 45.0; // Exemplo: R$45 por hora.
    }
}
