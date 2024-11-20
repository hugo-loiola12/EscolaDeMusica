package br.com.curso;

public class CursoFactory {
    public Curso criarCurso(String nomeCurso, int duracao, String nivel) {
        return new Curso(nomeCurso, duracao, nivel);
    }

}
