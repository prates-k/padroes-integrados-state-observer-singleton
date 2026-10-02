package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CentralDeAgendamentosTest {

    @BeforeEach
    void setUp() {
        CentralDeAgendamentos.getInstance().limparHistorico();
    }

    @Test
    void deveGarantirMesmaInstancia() {
        CentralDeAgendamentos instancia1 = CentralDeAgendamentos.getInstance();
        CentralDeAgendamentos instancia2 = CentralDeAgendamentos.getInstance();
        assertSame(instancia1, instancia2);
    }

    @Test
    void deveRegistrarMudancaDeEstadoNoHistorico() {
        Consulta consulta = new Consulta();
        consulta.confirmar();

        assertEquals(1, CentralDeAgendamentos.getInstance().getHistorico().size());
        assertEquals("Consulta alterada para Confirmada", CentralDeAgendamentos.getInstance().getHistorico().get(0));
    }

    @Test
    void deveRegistrarMultiplasConsultasNoMesmoHistorico() {
        Consulta consulta1 = new Consulta();
        Consulta consulta2 = new Consulta();

        consulta1.confirmar();
        consulta2.cancelar();

        assertEquals(2, CentralDeAgendamentos.getInstance().getHistorico().size());
    }
}