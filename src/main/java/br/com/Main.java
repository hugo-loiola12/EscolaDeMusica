package br.com;

import br.com.contrato.Curso;                // Importa a classe 'Curso', que é a classe base para os cursos.
import br.com.pessoas.Aluno;                // Importa a classe 'Aluno', que representa um aluno.
import br.com.util.factory.CursoFactory;    // Importa a 'CursoFactory', que cria instâncias de cursos.
import br.com.util.observer.Observer;       // Importa a interface 'Observer', que permite que objetos sejam notificados sobre mudanças.
import br.com.util.singleton.GerenciadorDeAulas; // Importa a classe 'GerenciadorDeAulas', que gerencia o agendamento de aulas.

public class Main {
    // Método principal (main) que será executado quando o programa iniciar.
    public static void main(String[] args) {

        // Criação de três cursos diferentes utilizando a fábrica (CursoFactory).
        Curso curso1 = CursoFactory.criarCurso("piano", "Básico", 20);       // Cria um curso de piano, nível Básico, 20 horas de duração.
        Curso curso2 = CursoFactory.criarCurso("violao", "Intermediário", 30); // Cria um curso de violão, nível Intermediário, 30 horas de duração.
        Curso curso3 = CursoFactory.criarCurso("canto", "Avançado", 15);     // Cria um curso de canto, nível Avançado, 15 horas de duração.

        // Imprime informações sobre os cursos criados: nome, nível e custo (calculado pelo método calcularCusto()).
        System.out.println("Curso: " + curso1.getNome() + ", Nível: " + curso1.getNivel() + ", Custo: R$" + curso1.calcularCusto());
        System.out.println("Curso: " + curso2.getNome() + ", Nível: " + curso2.getNivel() + ", Custo: R$" + curso2.calcularCusto());
        System.out.println("Curso: " + curso3.getNome() + ", Nível: " + curso3.getNivel() + ", Custo: R$" + curso3.calcularCusto());

        // Criação de dois alunos. Ambos são objetos da classe Aluno, que implementa a interface Observer.
        Observer aluno1 = new Aluno("João", "Rua 1", 18, 20000031);   // Cria um aluno com nome João, endereço "Rua 1", idade 18, matrícula 20000031.
        Observer aluno2 = new Aluno("Maria", "Rua 2", 20, 20000032);  // Cria um aluno com nome Maria, endereço "Rua 2", idade 20, matrícula 20000032.

        // Criação do gerenciador de aulas (GerenciadorDeAulas) utilizando o padrão Singleton.
        GerenciadorDeAulas gerenciador = GerenciadorDeAulas.getInstanciaUnica();  // Obtém a única instância do GerenciadorDeAulas.

        // Adiciona os alunos como observadores no gerenciador de aulas.
        gerenciador.adicionarObservador(aluno1);  // Adiciona o aluno 'João' como observador.
        gerenciador.adicionarObservador(aluno2);  // Adiciona o aluno 'Maria' como observador.

        // Imprime que a primeira aula está sendo agendada.
        System.out.println("\nAgendando a primeira aula...");
        // Agendando uma aula para João com o Professor A no dia 2024-11-22 às 10:00.
        gerenciador.agendarAulas("João", "Professor A", "2024-11-22", "10:00");

        // Imprime que a segunda aula está sendo agendada.
        System.out.println("\nAgendando a segunda aula...");
        // Agendando uma aula para Maria com o Professor B no dia 2024-11-22 às 14:00.
        gerenciador.agendarAulas("Maria", "Professor B", "2024-11-22", "14:00");

        // Imprime que está tentando agendar uma aula em um horário já ocupado.
        System.out.println("\nTentando agendar uma aula em um horário já ocupado...");
        // Tentando agendar uma aula para João novamente no dia 2024-11-22 às 10:00, o que já está agendado.
        gerenciador.agendarAulas("João", "Professor A", "2024-11-22", "10:00");

        // Imprime que está cancelando uma aula.
        System.out.println("\nCancelando a aula...");
        // Cancelando a aula de João com o Professor A no dia 2024-11-22 às 10:00.
        gerenciador.cancelarAula("João", "Professor A", "2024-11-22", "10:00");

        // Imprime que está tentando cancelar uma aula inexistente.
        System.out.println("\nTentando cancelar uma aula inexistente...");
        // Tentando cancelar uma aula para Maria com o Professor B no dia 2024-11-22 às 16:00, mas não existe.
        gerenciador.cancelarAula("Maria", "Professor B", "2024-11-22", "16:00");
    }
}
