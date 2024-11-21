package br.com.util.factory;

import br.com.contrato.Curso;
import br.com.curso.CursoDeCanto;
import br.com.curso.CursoDePiano;
import br.com.curso.CursoDeTeoriaMusical;
import br.com.curso.CursoDeViolao;

public class CursoFactory {


    public static Curso criarCurso(String tipoCurso, String nivel, int duracao) {
        return switch (tipoCurso.toLowerCase()) {
            case "piano" -> new CursoDePiano(nivel, duracao);
            case "violao" -> new CursoDeViolao(nivel, duracao);
            case "canto" -> new CursoDeCanto(nivel, duracao);
            case "teoria musical" -> new CursoDeTeoriaMusical(nivel, duracao);
            default -> throw new IllegalArgumentException("Tipo de curso inválido: " + tipoCurso);
        };
    }
}

