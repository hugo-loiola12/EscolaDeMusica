package br.com.pessoas;

// Importa a interface 'Observer' do pacote 'br.com.util.observer'. A interface 'Observer'
// faz parte do padrão de projeto Observer, que permite que objetos observadores (como o aluno)
// sejam notificados sobre mudanças em objetos observados (como uma turma, curso, ou outro objeto de interesse).
import br.com.util.observer.Observer;

// A classe 'Aluno' estende a classe 'Pessoa' e implementa a interface 'Observer'.
// Isso significa que ela herda os atributos e comportamentos de 'Pessoa' e também implementa
// a funcionalidade de receber notificações, como definido pelo padrão de projeto Observer.
public class Aluno extends Pessoa implements Observer {

    // Atributo específico da classe 'Aluno' que armazena a matrícula do aluno.
    // Isso pode ser utilizado para identificar o aluno de forma única.
    private int matricula;

    // Construtor da classe 'Aluno'. Ele inicializa os atributos da classe pai 'Pessoa'
    // e também inicializa o atributo 'matricula', que é específico para os alunos.
    public Aluno(String nome, String endereco, int idade, int matricula) {
        // Chama o construtor da classe 'Pessoa' para inicializar os atributos 'nome', 'endereco' e 'idade'.
        super(nome, endereco, idade);
        // Inicializa o atributo 'matricula' com o valor passado como parâmetro.
        this.matricula = matricula;
    }

    // Método getter para o atributo 'matricula'. Retorna o número de matrícula do aluno.
    public int getMatricula() {
        return matricula;
    }

    // Método setter para o atributo 'matricula'. Permite alterar o número de matrícula do aluno.
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    // Implementação do método da interface 'Observer', que é chamado quando uma atualização pendente ocorre.
    // Neste caso, a atualização é uma notificação que será impressa na tela.
    @Override
    public void atualizacaoPendente(String mensagem) {
        // Imprime uma mensagem para notificar o aluno sobre a atualização. O nome do aluno é obtido
        // pela chamada ao método 'getNome()' da classe pai 'Pessoa', e a mensagem é passada como parâmetro.
        System.out.println("Notificação para Aluno " + super.getNome() + ": " + mensagem);
    }
}

