package br.com.util.observer;

//criando uma interface que vai servir para notificar acaso haja uma mudança
//no agendamentos de aulas ou noticações de mudanças de
//horários
public interface Observer {

    //um metodo que recebe como parametro uma mensagem caso aconteça um agendamento de aulas ou noticações de mudanças de
    ////horários
    void atualizacaoPendente(String mensagem);

}
