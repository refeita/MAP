package controleAcademico.models;

import controleAcademico.auxiliares.Pessoa;

public class Aluno extends Pessoa{

    private String curso;

    public Aluno(String nome, int id, String curso) {
        super(nome, id);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno: " + getNome() + " - Matricula: " + getId();
    }

    
    

}
