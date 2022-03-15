package exceptions;
//Exception para valores da figura geometrica que sejam menores ou iguais a zero
public class ExceptionValorNegativoOuZero extends Exception {
    public ExceptionValorNegativoOuZero(){
        super("O valor deve ser maior que zero!");
    }
}
