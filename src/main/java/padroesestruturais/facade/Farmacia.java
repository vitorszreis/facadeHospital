package padroesestruturais.facade;

public class Farmacia extends Setor {

    private static Farmacia farmacia = new Farmacia();

    private Farmacia() {};

    public static Farmacia getInstancia() {
        return farmacia;
    }
}
