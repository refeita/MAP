package almoxarifado;

public class Material {
    private String nome;
    private double valor;

    public Material(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return this.nome;
    }

    public Double getValor() {
        return this.valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    //Mostra o nome e o preço do material
    public String toString() {
        return "Nome: "+this.nome+", Preço: "+this.valor;
    }
}