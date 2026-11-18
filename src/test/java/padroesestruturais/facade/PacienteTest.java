package padroesestruturais.facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PacienteTest {

    @Test
    void deveRetornarPendenciaFarmaciaAlta() {
        Paciente paciente = new Paciente();
        Farmacia.getInstancia().addPacientePendente(paciente);

        assertEquals(false, paciente.receberAlta());
    }

    @Test
    void deveRetornarPendenciaLaboratorioAlta() {
        Paciente paciente = new Paciente();
        Laboratorio.getInstancia().addPacientePendente(paciente);

        assertEquals(false, paciente.receberAlta());
    }

    @Test
    void deveRetornarPendenciaFaturamentoAlta() {
        Paciente paciente = new Paciente();
        Faturamento.getInstancia().addPacientePendente(paciente);

        assertEquals(false, paciente.receberAlta());
    }

    @Test
    void deveRetornarPacienteSemPendenciaAlta() {
        Paciente paciente = new Paciente();

        assertEquals(true, paciente.receberAlta());
    }

}
