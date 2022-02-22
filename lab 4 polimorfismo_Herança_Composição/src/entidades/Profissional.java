package entidades;

import java.util.ArrayList;

public class Profissional implements Funcionario {
    private String nome;
    private ArrayList<String> funcoes;
    
    public Profissional(String nome, ArrayList<String> funcoes) {
        this.nome = nome;
        this.funcoes = funcoes;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public ArrayList<String> getFuncoes() {
        return this.funcoes;
    }
    
    public void setFuncoes(ArrayList<String> funcoes) {
        this.funcoes = funcoes;
    }
}
