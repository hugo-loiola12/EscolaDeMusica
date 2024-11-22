package br.com.util.factory;

// Importação das classes necessárias para criar os objetos de curso.
import br.com.contrato.Curso;                // Importa a classe abstrata 'Curso' que é a base para todos os tipos de cursos.
import br.com.curso.CursoDeCanto;            // Importa a classe 'CursoDeCanto', que representa um curso específico.
import br.com.curso.CursoDePiano;            // Importa a classe 'CursoDePiano', que representa um curso específico.
import br.com.curso.CursoDeTeoriaMusical;   // Importa a classe 'CursoDeTeoriaMusical', que representa um curso específico.
import br.com.curso.CursoDeViolao;          // Importa a classe 'CursoDeViolao', que representa um curso específico.

// Classe 'CursoFactory', responsável por criar instâncias de cursos com base no tipo de curso fornecido.
public class CursoFactory {

    // Método estático 'criarCurso'. Este método recebe o tipo do curso (como uma string), o nível e a duração
    // e cria uma instância do curso correspondente.
    public static Curso criarCurso(String tipoCurso, String nivel, int duracao) {
        // Usa a expressão switch (ou switch expression) para selecionar o tipo de curso
        // e retornar uma instância da classe correspondente.
        return switch (tipoCurso.toLowerCase()) { // Converte 'tipoCurso' para minúsculo para tornar a verificação insensível a maiúsculas/minúsculas.
            case "piano" -> new CursoDePiano(nivel, duracao);                  // Se 'tipoCurso' for "piano", cria um 'CursoDePiano'.
            case "violao" -> new CursoDeViolao(nivel, duracao);                // Se 'tipoCurso' for "violão", cria um 'CursoDeViolao'.
            case "canto" -> new CursoDeCanto(nivel, duracao);                  // Se 'tipoCurso' for "canto", cria um 'CursoDeCanto'.
            case "teoria musical" -> new CursoDeTeoriaMusical(nivel, duracao); // Se 'tipoCurso' for "teoria musical", cria um 'CursoDeTeoriaMusical'.
            default -> throw new IllegalArgumentException("Tipo de curso inválido: " + tipoCurso); // Se o tipo não for reconhecido, lança uma exceção.
        };
    }
}


