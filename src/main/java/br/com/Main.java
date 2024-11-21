package br.com;

import br.com.contrato.Curso;
import br.com.util.factory.CursoFactory;
import br.com.util.singleton.GerenciadorDeAulas;

public class Main {
    public static void main(String[] args) {
        // Criando cursos com o Factory
        Curso curso1 = CursoFactory.criarCurso("piano", "Básico", 20);
        Curso curso2 = CursoFactory.criarCurso("violao", "Intermediário", 30);
        Curso curso3 = CursoFactory.criarCurso("canto", "Avançado", 15);

        // Exibindo informações dos cursos
        System.out.println("Curso: " + curso1.getNome() + ", Nível: " + curso1.getNivel() + ", Custo: R$" + curso1.calcularCusto());
        System.out.println("Curso: " + curso2.getNome() + ", Nível: " + curso2.getNivel() + ", Custo: R$" + curso2.calcularCusto());
        System.out.println("Curso: " + curso3.getNome() + ", Nível: " + curso3.getNivel() + ", Custo: R$" + curso3.calcularCusto());

        //testando o singleton

        //como nao podemos intanciar uma classe do pacote singleton nos obtemos a instancia unica do tipo da Classe Gerenciador de aulas


        //esse comando cria um atributo do tipo GerenciadorDeAulas e faz com quque ele receba uma instancia da classe.
        GerenciadorDeAulas gerenciarAulas = GerenciadorDeAulas.getInstance();

        //assim podemos chamar a classe de marcar e desmarcar aulas


        //acessa o atributo gerenciarAulas que contem a unica instancia da classe e acessa o metodo acessar aula
        gerenciarAulas.agendarAula("Joaozin","Julio","12/04","14:30");

        //acessa o atributo gerenciarAulas que contem a unica instancia da classe e acessa o metodo acessar aula
        gerenciarAulas.agendarAula("Clara","Julio","12/04","14:30");








    }
}
