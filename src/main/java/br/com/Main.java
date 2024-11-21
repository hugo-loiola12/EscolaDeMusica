package br.com;

import br.com.contrato.Curso;
import br.com.pessoas.Aluno;
import br.com.util.factory.CursoFactory;
import br.com.util.observer.Observer;
import br.com.util.singleton.GerenciadorDeAulas;

public class Main {
    public static void main(String[] args) {


        Curso curso1 = CursoFactory.criarCurso("piano", "Básico", 20);
        Curso curso2 = CursoFactory.criarCurso("violao", "Intermediário", 30);
        Curso curso3 = CursoFactory.criarCurso("canto", "Avançado", 15);


        System.out.println("Curso: " + curso1.getNome() + ", Nível: " + curso1.getNivel() + ", Custo: R$" + curso1.calcularCusto());
        System.out.println("Curso: " + curso2.getNome() + ", Nível: " + curso2.getNivel() + ", Custo: R$" + curso2.calcularCusto());
        System.out.println("Curso: " + curso3.getNome() + ", Nível: " + curso3.getNivel() + ", Custo: R$" + curso3.calcularCusto());


        Observer aluno1 = new Aluno("João", "Rua 1", 18, 20000031);
        Observer aluno2 = new Aluno("Maria", "Rua 2", 20, 20000032);


        GerenciadorDeAulas gerenciador = GerenciadorDeAulas.getInstanciaUnica();


        gerenciador.adicionarObservador(aluno1);
        gerenciador.adicionarObservador(aluno2);


        System.out.println("\nAgendando a primeira aula...");
        gerenciador.agendarAulas("João", "Professor A", "2024-11-22", "10:00");


        System.out.println("\nAgendando a segunda aula...");
        gerenciador.agendarAulas("Maria", "Professor B", "2024-11-22", "14:00");


        System.out.println("\nTentando agendar uma aula em um horário já ocupado...");
        gerenciador.agendarAulas("João", "Professor A", "2024-11-22", "10:00");


        System.out.println("\nCancelando a aula...");
        gerenciador.cancelarAula("João", "Professor A", "2024-11-22", "10:00");


        System.out.println("\nTentando cancelar uma aula inexistente...");
        gerenciador.cancelarAula("Maria", "Professor B", "2024-11-22", "16:00");
    }
}
