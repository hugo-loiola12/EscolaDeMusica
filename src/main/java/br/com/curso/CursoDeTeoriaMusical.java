package br.com.curso;

// Importa a classe 'Curso' do pacote 'br.com.contrato'. A classe 'Curso' é a classe base,
// e 'CursoDeTeoriaMusical' vai herdar seus atributos e métodos para definir o comportamento
// específico de um curso de teoria musical.
import br.com.contrato.Curso;

// A classe 'CursoDeTeoriaMusical' herda da classe abstrata 'Curso'. Isso significa que ela
// herda os atributos e métodos da classe 'Curso' e fornece uma implementação específica
// para calcular o custo de um curso de teoria musical.
public class CursoDeTeoriaMusical extends Curso {

    // Construtor da classe 'CursoDeTeoriaMusical'. O nome do curso é fixo como "Curso de Teoria Musical",
    // mas o nível e a duração do curso são passados como parâmetros para o construtor da classe pai.
    public CursoDeTeoriaMusical(String nivel, int duracao) {
        super("Curso de Teoria Musical", nivel, duracao); // Chama o construtor da classe 'Curso'
    }

    // Implementação do método abstrato 'calcularCusto' da classe 'Curso'.
    // Este método calcula o custo do curso de teoria musical com base na duração do curso
    // e no valor por hora, que é definido aqui como R$45.
    @Override
    public double calcularCusto() {
        // Cálculo do custo: multiplica a duração do curso pelo preço por hora (R$45).
        // Ou seja, o custo do curso de teoria musical é determinado pela duração em horas
        // multiplicada por R$45.
        return getDuracao() * 45.0; // Exemplo: R$45 por hora.
    }
}

