package padroesestruturais.facade;

public class Paciente {

    public boolean receberAlta() {
        return PacienteFacade.verificarPendenciasAlta(this);
    }
}
