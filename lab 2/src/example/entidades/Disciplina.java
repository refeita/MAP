package example.entidades;

import example.auxiliares.Horario;

public class Disciplina {

    private String nome;
    private Horario horario;

    public Disciplina(String nome, String dia, String hora) {
        this.nome = nome;
        this.horario = new Horario(dia, hora);
    }

    public Horario getHorario() {
        return horario;
    }

    public String getHorarioString(){
        return horario.toString();
    }

    public String getNome() {
        return nome;
    }

    public String toString() {
        return "\nDisciplina: " + getNome() + "\t" + getHorario().toString();
    }

    
}
