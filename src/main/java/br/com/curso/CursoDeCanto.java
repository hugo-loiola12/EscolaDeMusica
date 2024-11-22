package br.com.curso;

// Importa a classe 'Curso' do pacote 'br.com.contrato'. A classe 'Curso' é a classe base,
// e 'CursoDeCanto' irá herdar seus atributos e métodos.
import br.com.contrato.Curso;

// Classe 'CursoDeCanto' herda da classe abstrata 'Curso'. Isso significa que ela
// vai fornecer uma implementação concreta para o método abstrato 'calcularCusto()'.
public class CursoDeCanto extends Curso {

    // Construtor da classe 'CursoDeCanto'. Ele chama o construtor da classe pai ('Curso')
    // para inicializar o nome como "Curso de Canto", e recebe o nível e a duração
    // do curso que são passados ao construtor da classe mãe.
    public CursoDeCanto(String nivel, int duracao) {
        super("Curso de Canto", nivel, duracao); // Chama o construtor da classe 'Curso' com os parâmetros
    }

    // Implementação do método abstrato 'calcularCusto' da classe 'Curso'.
    // Esse método calcula o custo do curso de canto com base na duração e no custo por hora.
    @Override
    public double calcularCusto() {
        // Cálculo do custo: multiplica a duração do curso pelo preço por hora (R$60).
        // Ou seja, o custo do curso de canto é determinado pela duração em horas
        // multiplicada por R$60.
        return getDuracao() * 60.0; // Exemplo: R$60 por hora.
    }
}
