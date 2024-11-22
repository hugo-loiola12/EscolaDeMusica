package br.com.contrato;

// Classe abstrata 'Curso', que serve como base para outras classes que representam cursos específicos.
// Como é uma classe abstrata, ela não pode ser instanciada diretamente, apenas herdada.
public abstract class Curso {

    // Atributos privados que representam características do curso
    private final String nome;   // Nome do curso (por exemplo, "Java Básico")
    private final String nivel;  // Nível do curso (por exemplo, "Básico", "Intermediário", "Avançado")
    private final int duracao;   // Duração do curso em horas (por exemplo, 40 horas)

    // Construtor da classe, que é utilizado para inicializar os atributos de um novo curso
    // O modificador 'final' nos parâmetros significa que o valor desses atributos não pode ser alterado após a inicialização
    public Curso(String nome, String nivel, int duracao) {
        this.nome = nome;       // Inicializa o atributo 'nome' com o valor passado no construtor
        this.nivel = nivel;     // Inicializa o atributo 'nivel' com o valor passado no construtor
        this.duracao = duracao; // Inicializa o atributo 'duracao' com o valor passado no construtor
    }

    // Método getter que retorna o nome do curso
    public String getNome() {
        return nome; // Retorna o valor do atributo 'nome'
    }

    // Método getter que retorna o nível do curso
    public String getNivel() {
        return nivel; // Retorna o valor do atributo 'nivel'
    }

    // Método getter que retorna a duração do curso em horas
    public int getDuracao() {
        return duracao; // Retorna o valor do atributo 'duracao'
    }

    // Método abstrato que precisa ser implementado nas classes que herdam de 'Curso'
    // Esse método será utilizado para calcular o custo de um curso, mas a forma de cálculo pode variar
    // de acordo com o tipo de curso.
    public abstract double calcularCusto(); // Declaração do método abstrato, sem implementação aqui.
}


