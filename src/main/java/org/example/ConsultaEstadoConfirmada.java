package org.example;

public class ConsultaEstadoConfirmada extends ConsultaEstado {

    private ConsultaEstadoConfirmada() {}
    private static ConsultaEstadoConfirmada instance = new ConsultaEstadoConfirmada();
    public static ConsultaEstadoConfirmada getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Confirmada";
    }

    public boolean realizar(Consulta consulta) {
        consulta.setEstado(ConsultaEstadoRealizada.getInstance());
        return true;
    }

    public boolean cancelar(Consulta consulta) {
        consulta.setEstado(ConsultaEstadoCancelada.getInstance());
        return true;
    }
}