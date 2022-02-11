package example.entidades;
import example.auxiliares.Pessoa;

public class Professor extends Pessoa{

    public Professor(String nome, int id) {
        super(nome, id);
    }

    @Override
    public String toString() {
        return "Professor: " + getNome() + " \t Matricula: " + getId();
    }
}
