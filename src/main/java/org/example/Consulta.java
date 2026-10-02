package org.example;

import java.util.Observable;

public class Consulta extends Observable {

    private ConsultaEstado estado;

    public Consulta() {
        this.estado = ConsultaEstadoAgendada.getInstance();
        CentralDeAgendamentos.getInstance().monitorar(this);
    }

    public void setEstado(ConsultaEstado estado) {
        this.estado = estado;
        setChanged();
        notifyObservers(estado.getNomeEstado());
    }

    public boolean confirmar() {
        return estado.confirmar(this);
    }

    public boolean realizar() {
        return estado.realizar(this);
    }

    public boolean cancelar() {
        return estado.cancelar(this);
    }

    public String getNomeEstado() {
        return estado.getNomeEstado();
    }

    public ConsultaEstado getEstado() {
        return estado;
    }
}
