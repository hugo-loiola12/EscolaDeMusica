package br.com.pessoas;

// Importa a interface 'Observer' do pacote 'br.com.util.observer'. A interface 'Observer'
// faz parte do padrão de projeto Observer, permitindo que o objeto 'Professor' seja notificado
// sobre mudanças em objetos observados.
import br.com.util.observer.Observer;

// A classe 'Professor' estende a classe 'Pessoa' e implementa a interface 'Observer'.
// Isso significa que o professor herda os atributos e métodos de 'Pessoa' e implementa
// o comportamento de receber notificações de eventos como definido pelo padrão Observer.
public class Professor extends Pessoa implements Observer {

    // Atributos privados da classe 'Professor'. Eles representam informações específicas de um professor.
    private String funcao;   // Função do professor (ex: "Professor de Matemática").
    private double salario;  // Salário do professor.
    private int matricula;   // Número de matrícula do professor.

    // Construtor da classe 'Professor'. Ele inicializa os atributos da classe pai 'Pessoa'
    // e também os atributos específicos da classe 'Professor'.
    public Professor(String nome, String cpf, int idade, String funcao, double salario, int matricula) {
        // Chama o construtor da classe pai 'Pessoa' para inicializar os atributos 'nome', 'cpf' e 'idade'.
        super(nome, cpf, idade);
        // Inicializa os atributos específicos da classe 'Professor'.
        this.funcao = funcao;
        this.salario = salario;
        this.matricula = matricula;
    }

    // Métodos getter e setter para o atributo 'funcao'. Permite acessar e modificar a função do professor.
    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    // Métodos getter e setter para o atributo 'salario'. Permite acessar e modificar o salário do professor.
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Métodos getter e setter para o atributo 'matricula'. Permite acessar e modificar o número de matrícula do professor.
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    // Implementação do método da interface 'Observer'. Este método é chamado para notificar o professor sobre uma atualização.
    @Override
    public void atualizacaoPendente(String mensagem) {
        // Imprime uma mensagem de notificação para o professor com o nome do professor
        // e a mensagem recebida como parâmetro.
        System.out.println("Notificação para Professor " + super.getNome() + ": " + mensagem);
    }
}
