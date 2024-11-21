package br.com.util.singleton;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeAulas {

    //um atributo global do tipo GerenciadorDeAulas que vai servir para guardar a instancia unica
    //quando criamos um atributo do tipo de uma classe dizemos que ela pode armazenar uma referencia a um objeto do tipo da classe
    private static GerenciadorDeAulas instanciaUnica;

    //uma lista para guardar os horarios registrados e nao permitir que eles se choquem
    private List<String> agendamentos = new ArrayList<>();


    //criamos um construtor privado para que nao seja possivel instanciar essa classe fora da classe GerenciadorDeAulas(instancia é exclusiva dessa classe).
    private GerenciadorDeAulas() {
    }




    //precisamos de um metódo estatico,getter(assim nao é preciso instaciar a classe é so chama-la)
    //um getter que so permite uma instancia da classe
    public static GerenciadorDeAulas getInstance(){
        if(instanciaUnica == null){
            instanciaUnica = new GerenciadorDeAulas();
            System.out.println("instancia criada");
        }
        return instanciaUnica;
    }


    //uma classe que cria um horario paraum aluno em algum dia
    public void agendarAula(String nomeAluno,String professor,String diaAula,String horaAula ){

        //juntando informaçoes necessarias para percorrer a lista de agendamentos
        String expecificacao = diaAula + " " + horaAula;

        boolean diaOcupado = false;


        //uma iteraçao que passa por tudo registrado na lista e para se encontrar uma expecificaçao que seja igual
        for(String agendado : agendamentos){
            if(agendado.equals(expecificacao)){


                diaOcupado = true;
                break;
            }
        }

        if(diaOcupado){
            //caso dia ocupado seja verdadeiro

            System.out.format("ja temos uma aula com o professor %s no dia %s as %s\n",nomeAluno,professor,diaAula,horaAula);

        }
        else{
            //caso nao tenha nenhum agendamento semelhante ele adiciona uma nova expecificaçao contendo horario e data a lista "agendamentos"
            agendamentos.add(expecificacao);
            System.out.format("%s marcou aula com o professor %s no dia %s as %s\n",nomeAluno,professor,diaAula,horaAula );


        }

    }

}
