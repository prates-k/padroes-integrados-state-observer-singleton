package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificacaoTest {

    @Test
    void deveNotificarPacienteEMedicoAoConfirmar() {
        Consulta consulta = new Consulta();
        Paciente paciente = new Paciente("Ana");
        Medico medico = new Medico("Dr. Carlos");

        paciente.acompanhar(consulta);
        medico.acompanhar(consulta);

        consulta.confirmar();

        assertEquals("Ana: consulta alterada para Confirmada", paciente.getUltimaNotificacao());
        assertEquals("Dr. Carlos: consulta alterada para Confirmada", medico.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarQuemNaoAcompanha() {
        Consulta consulta = new Consulta();
        Paciente paciente = new Paciente("Ana");

        consulta.confirmar();

        assertNull(paciente.getUltimaNotificacao());
    }
}
