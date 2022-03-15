package infraEstrutura.exceptions;

public class SalaException extends Exception {
    public SalaException() {
        super("Sala não existe");
    }
}
