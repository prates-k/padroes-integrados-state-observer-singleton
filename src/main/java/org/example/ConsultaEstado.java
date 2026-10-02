package org.example;

public abstract class ConsultaEstado {

    public abstract String getNomeEstado();

    public boolean confirmar(Consulta consulta) {
        return false;
    }

    public boolean realizar(Consulta consulta) {
        return false;
    }

    public boolean cancelar(Consulta consulta) {
        return false;
    }
}