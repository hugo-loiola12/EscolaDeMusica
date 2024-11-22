package br.com.curso;

// Importa a classe 'Curso' do pacote 'br.com.contrato'. A classe 'Curso' é a classe base
// para os tipos de cursos, e 'CursoDePiano' vai herdar seus atributos e métodos.
import br.com.contrato.Curso;

// A classe 'CursoDePiano' é uma subclasse da classe abstrata 'Curso'.
// Isso significa que ela herda os atributos e métodos da classe 'Curso',
// mas fornece uma implementação específica para calcular o custo de um curso de piano.
public class CursoDePiano extends Curso {

    // Construtor da classe 'CursoDePiano'. O nome do curso é fixo ("Curso de Piano"),
    // mas o nível e a duração do curso são passados como parâmetros ao construtor da classe pai.
    public CursoDePiano(String nivel, int duracao) {
        super("Curso de Piano", nivel, duracao); // Chama o construtor da classe 'Curso' com o nome fixo "Curso de Piano"
    }

    // Implementação do método abstrato 'calcularCusto' da classe 'Curso'.
    // Este método calcula o custo do curso de piano com base na duração e no custo por hora.
    @Override
    public double calcularCusto() {
        // Cálculo do custo: multiplica a duração do curso pelo preço por hora (R$50).
        // Ou seja, o custo do curso de piano é determinado pela duração em horas
        // multiplicada por R$50.
        return getDuracao() * 50.0; // Exemplo: R$50 por hora.
    }
}

