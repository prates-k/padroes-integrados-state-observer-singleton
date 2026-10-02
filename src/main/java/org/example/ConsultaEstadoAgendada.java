package org.example;

public class ConsultaEstadoAgendada extends ConsultaEstado {

    private ConsultaEstadoAgendada() {}
    private static ConsultaEstadoAgendada instance = new ConsultaEstadoAgendada();
    public static ConsultaEstadoAgendada getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Agendada";
    }

    public boolean confirmar(Consulta consulta) {
        consulta.setEstado(ConsultaEstadoConfirmada.getInstance());
        return true;
    }

    public boolean cancelar(Consulta consulta) {
        consulta.setEstado(ConsultaEstadoCancelada.getInstance());
        return true;
    }
}
