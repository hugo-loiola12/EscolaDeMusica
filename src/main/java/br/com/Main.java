package br.com;

import br.com.curso.Curso;
import br.com.curso.CursoFactory;

public class Main {
    public static void main(String[] args) {

        CursoFactory cursoFactory = new CursoFactory();
        Curso cursoPiano = cursoFactory.criarCurso("CursoDePiano", 60, "Básico");

        System.out.println(cursoPiano.getNome());


    }
}