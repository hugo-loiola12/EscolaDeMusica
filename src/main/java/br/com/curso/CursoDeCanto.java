package br.com.curso;

import br.com.contrato.Curso;

public class CursoDeCanto extends Curso {
    public CursoDeCanto(String nivel, int duracao) {
        super("Curso de Canto", nivel, duracao);
    }

    @Override
    public double calcularCusto() {
        return getDuracao() * 60.0; // Exemplo: R$60 por hora.
    }
}
