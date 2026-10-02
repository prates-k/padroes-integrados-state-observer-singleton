package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsultaTest {

    Consulta consulta;

    @BeforeEach
    void setUp() {
        consulta = new Consulta();
    }

    @Test
    void deveIniciarComoAgendada() {
        assertEquals("Agendada", consulta.getNomeEstado());
    }

    @Test
    void deveConfirmarConsultaAgendada() {
        assertTrue(consulta.confirmar());
        assertEquals("Confirmada", consulta.getNomeEstado());
    }

    @Test
    void naoDeveRealizarConsultaAgendadaSemConfirmar() {
        assertFalse(consulta.realizar());
        assertEquals("Agendada", consulta.getNomeEstado());
    }

    @Test
    void deveCancelarConsultaAgendada() {
        assertTrue(consulta.cancelar());
        assertEquals("Cancelada", consulta.getNomeEstado());
    }

    @Test
    void deveRealizarConsultaConfirmada() {
        consulta.confirmar();
        assertTrue(consulta.realizar());
        assertEquals("Realizada", consulta.getNomeEstado());
    }

    @Test
    void deveCancelarConsultaConfirmada() {
        consulta.confirmar();
        assertTrue(consulta.cancelar());
        assertEquals("Cancelada", consulta.getNomeEstado());
    }

    @Test
    void naoDeveAlterarConsultaRealizada() {
        consulta.confirmar();
        consulta.realizar();
        assertFalse(consulta.confirmar());
        assertFalse(consulta.cancelar());
        assertEquals("Realizada", consulta.getNomeEstado());
    }

    @Test
    void naoDeveAlterarConsultaCancelada() {
        consulta.cancelar();
        assertFalse(consulta.confirmar());
        assertFalse(consulta.realizar());
        assertEquals("Cancelada", consulta.getNomeEstado());
    }
}
