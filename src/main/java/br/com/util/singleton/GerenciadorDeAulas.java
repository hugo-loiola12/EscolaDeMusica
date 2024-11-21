package br.com.util.singleton;

import br.com.util.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeAulas {

    //um atributo global do tipo GerenciadorDeAulas que vai servir para guardar a instancia unica.
    //quando criamos um atributo do tipo de uma classe dizemos que ela pode armazenar uma referencia a um objeto do tipo da classe

    private static GerenciadorDeAulas instanciaUnica;

    //uma lista para guardar os horarios registrados e nao permitir que eles se choquem

    private List<String> agendamentos;

    //Objetos que implementam o padrao de projeto observer
    //essas lista vai receber os objetos que serao notificados

    private List<Observer> observadores;


    //um construtor privado que impede que essas listas sejam instanciadas fora dessa classe
    private GerenciadorDeAulas() {

        //duas listas vazias que vao receber os agendamentos e os orbservadores
        agendamentos = new ArrayList<>();
        observadores = new ArrayList<>();
    }

    //metodo que implementa o singleton
    public static GerenciadorDeAulas getInstanciaUnica(){

        //se nao existir uma instancia ainda ele cria
        //caso exista ele retorna essa instancia para quem chamou o metodo(garantindo o acesso a esse objeto para quem chamou)
        if(instanciaUnica == null){
            instanciaUnica = new GerenciadorDeAulas();
        }

        return instanciaUnica;

    }


    //metodo para adicionar um observador, para alunos e professores matriculados
    public void adicionarObservador(Observer observador){
        observadores.add(observador);
    }


    //metodo que remove um observer caso seja necessario ,um aluno cancelou a incriçao
    public void removerObservador(Observer observador){
        observadores.remove(observador);
    }

    public void notificarObservadores(String mensagem){

        //essa iteraçao percorre a lista observadores e notifica aqueles que tem um observer
        //com uma mensagem que foi passada como um parametro

        for(Observer x : observadores){
            x.atualizacaoPendente(mensagem);
        }


    }

    //metodo responsavel por agendar Aulas para os alunos
    public void agendarAulas(String nomeAluno,String nomeProfessor,String dia,String hora){

        //concatena os atributos dia e hora
        String diaHora = dia + " " + hora;

        //confere se a variavel diahora ja esta na lista agendamentos e se estiver
        //nao insere o horario nem ativa o observer
        if(agendamentos.contains(diaHora)){
            System.out.println("Horario ja ocupado");
        }
        else{
            agendamentos.add(diaHora);
            String mensagem = "Aula marcada para" + nomeAluno + " com " +nomeProfessor + " em " + diaHora;
            System.out.println(mensagem);
            notificarObservadores(mensagem);
        }

    }

    public void cancelarAula(String nomeAluno,String nomeProfessor,String dia,String hora) {

        //concatena os atributos dia e hora
        String diaHora = dia + " " + hora;


        //confere se esse horario esta na lista de horarios e se estiver o remove
        //se nao estiver diz que nao ha horarios para serem removidos
         if (agendamentos.remove(diaHora)) {

             String mensagem = "Aula cancelada no dia " + nomeAluno + " com " + nomeProfessor + " no dia " + diaHora;
             System.out.println(mensagem);
             notificarObservadores(mensagem);
         }
         else{
             System.out.println("Nao ha o que cancelar nesse horario ");
         }

    }
}
