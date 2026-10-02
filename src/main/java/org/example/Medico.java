package org.example;

import java.util.Observable;
import java.util.Observer;

public class Medico implements Observer {

    private String nome;
    private String ultimaNotificacao;

    public Medico(String nome) {
        this.nome = nome;
    }

    public void acompanhar(Consulta consulta) {
        consulta.addObserver(this);
    }

    public void update(Observable consulta, Object novoEstado) {
        this.ultimaNotificacao = this.nome + ": consulta alterada para " + novoEstado;
    }

    public String getUltimaNotificacao() {
        return ultimaNotificacao;
    }
}
