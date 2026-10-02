package org.example;

public class ConsultaEstadoCancelada extends ConsultaEstado {

    private ConsultaEstadoCancelada() {}
    private static ConsultaEstadoCancelada instance = new ConsultaEstadoCancelada();
    public static ConsultaEstadoCancelada getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Cancelada";
    }
}