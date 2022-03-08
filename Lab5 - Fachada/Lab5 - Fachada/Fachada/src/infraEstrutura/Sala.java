package infraEstrutura;

public class Sala {
    private int numero;
    private String bloco;
    private boolean disponivel;

    public Sala(int numero, String bloco, boolean disponivel) {
        this.numero = numero;
        this.bloco = bloco;
        this.disponivel = disponivel;
    }
    
    public int getNumero() {
        return this.numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBloco() {
        return this.bloco;
    }
    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public boolean getDisponivel() {
        return this.disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return new StringBuilder()
            .append("Sala: ")
            .append(this.numero)
            .append(", Disponibilidade: ")
            .append(this.disponivel)
            .toString();
    }
}

