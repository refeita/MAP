package entidades;

import java.util.ArrayList;
import java.util.Map;
import exceptions.FilmeNotExistException;

public class GloboFilmes {
    //Array da classe Filme
    private ArrayList<Filme> filmes;

    public GloboFilmes() {
        this.filmes = new ArrayList<Filme>();
    }
    public ArrayList<Filme> getFilmes() {
        return this.filmes;
    }

    //Teste de excessao caso nao exista o filme
    public Filme getFilme(String nome) throws FilmeNotExistException{

        for (Filme filme : filmes) {
            if (filme.getNome().equals(nome)) {
                return filme;
            }
        }
        throw new FilmeNotExistException(nome);
    }

    public boolean cadastrarFilme(String nome, int ano, Map<String, ArrayList<String>> funcionarios,
                                  ArrayList<String> trilhaSonora) {

        Filme novoFilme = new Filme(nome, ano);

        if (filmes.contains(novoFilme)) {
            return false;
        }

        for (Map.Entry<String, ArrayList<String>> campo : funcionarios.entrySet()) {
            novoFilme.cadastrarFuncionario(campo.getKey(), campo.getValue());
        }

        novoFilme.setTrilhaSonora(trilhaSonora);
        filmes.add(novoFilme);
        return true;
    }

    public String mostrarFilmografia(String nome, String funcao) {
        StringBuilder filmografia = new StringBuilder();
        for (Filme filme : filmes) {
            for (Funcionario funcionario : filme.getFuncionarios()) {
                if (nome.equals(funcionario.getNome())) {
                    for (String func : funcionario.getFuncoes()) {
                        if (func.equals(funcao)) {
                            filmografia.append("Filme: ").append(filme.getNome()).append(", ").append(funcao+": ").append(nome+"\n");
                        }
                    }
                }
            }
        }

        return filmografia.toString();
    }


    public String mostrarInformacoesFilme(String nome) throws FilmeNotExistException {
        return getFilme(nome).toString();
    }
}