package br.com;

import br.com.contrato.Curso;
import br.com.util.factory.CursoFactory;

public class Main {
    public static void main(String[] args) {
        // Criando cursos com o Factory
        Curso curso1 = CursoFactory.criarCurso("piano", "Básico", 20);
        Curso curso2 = CursoFactory.criarCurso("violao", "Intermediário", 30);
        Curso curso3 = CursoFactory.criarCurso("canto", "Avançado", 15);

        // Exibindo informações dos cursos
        System.out.println("Curso: " + curso1.getNome() + ", Nível: " + curso1.getNivel() + ", Custo: R$" + curso1.calcularCusto());
        System.out.println("Curso: " + curso2.getNome() + ", Nível: " + curso2.getNivel() + ", Custo: R$" + curso2.calcularCusto());
        System.out.println("Curso: " + curso3.getNome() + ", Nível: " + curso3.getNivel() + ", Custo: R$" + curso3.calcularCusto());
    }
}
