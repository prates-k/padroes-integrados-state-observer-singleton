package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class CentralDeAgendamentos implements Observer {

    private CentralDeAgendamentos() {}
    private static CentralDeAgendamentos instance = new CentralDeAgendamentos();
    public static CentralDeAgendamentos getInstance() {
        return instance;
    }

    private List<String> historico = new ArrayList<>();

    public void monitorar(Consulta consulta) {
        consulta.addObserver(this);
    }

    public void update(Observable consulta, Object novoEstado) {
        historico.add("Consulta alterada para " + novoEstado);
    }

    public List<String> getHistorico() {
        return historico;
    }

    public void limparHistorico() {
        historico.clear();
    }
}
