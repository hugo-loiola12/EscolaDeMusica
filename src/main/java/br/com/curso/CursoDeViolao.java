package br.com.curso;

// Importa a classe 'Curso' do pacote 'br.com.contrato'. A classe 'Curso' é a classe base
// para os tipos de cursos, e 'CursoDeViolao' vai herdar seus atributos e métodos.
import br.com.contrato.Curso;

// A classe 'CursoDeViolao' herda da classe abstrata 'Curso'. Isso significa que ela
// herda os atributos e métodos da classe 'Curso' e fornece uma implementação específica
// para calcular o custo de um curso de violão.
public class CursoDeViolao extends Curso {

    // Construtor da classe 'CursoDeViolao'. O nome do curso é fixo como "Curso de Violão",
    // mas o nível e a duração do curso são passados como parâmetros ao construtor da classe pai.
    public CursoDeViolao(String nivel, int duracao) {
        super("Curso de Violão", nivel, duracao); // Chama o construtor da classe 'Curso' com o nome fixo "Curso de Violão"
    }

    // Implementação do método abstrato 'calcularCusto' da classe 'Curso'.
    // Este método calcula o custo do curso de violão com base na duração do curso
    // e no valor por hora, que é definido aqui como R$40.
    @Override
    public double calcularCusto() {
        // Cálculo do custo: multiplica a duração do curso pelo preço por hora (R$40).
        // Ou seja, o custo do curso de violão é determinado pela duração em horas
        // multiplicada por R$40.
        return getDuracao() * 40.0; // Exemplo: R$40 por hora.
    }
}

