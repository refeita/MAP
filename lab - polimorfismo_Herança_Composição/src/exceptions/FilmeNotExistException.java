package exceptions;
public class FilmeNotExistException extends Exception{
    public FilmeNotExistException(String nome) {
        super("Filme: "+nome +" não existe", new Throwable("filme incorreto ou não existe"));
    }
}
