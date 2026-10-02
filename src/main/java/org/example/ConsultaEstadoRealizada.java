package org.example;

public class ConsultaEstadoRealizada extends ConsultaEstado {

    private ConsultaEstadoRealizada() {}
    private static ConsultaEstadoRealizada instance = new ConsultaEstadoRealizada();
    public static ConsultaEstadoRealizada getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Realizada";
    }
}
