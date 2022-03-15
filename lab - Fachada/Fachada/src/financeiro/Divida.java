package financeiro;
public class Divida {
    private String nome;
    private double debito;
    private double credito;

    public Divida(String nome, double debito, double credito) {
        this.nome = nome;
        this.debito = debito;
        this.credito = credito;
    }

    //Gets e Sets
    public String getNome() {
        return this.nome;
    }

    public double getDebito() {
        return this.debito;
    }

    public double getCredito() {
        return this.credito;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDebito(double debito) {
        this.debito = debito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
    
    public String toString() {
        //Mostra as dívidas da conta
        return "Conta: " + this.nome + ", Débito: " + this.debito + ", Crédito: " + this.credito;
}
}
