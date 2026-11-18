package padroesestruturais.facade;

public class PacienteFacade {

    public static boolean verificarPendenciasAlta(Paciente paciente) {
        if (Farmacia.getInstancia().verificarPacienteComPendencia(paciente)) {
            return false;
        }
        if (Laboratorio.getInstancia().verificarPacienteComPendencia(paciente)) {
            return false;
        }
        if (Faturamento.getInstancia().verificarPacienteComPendencia(paciente)) {
            return false;
        }
        return true;
    }
}
