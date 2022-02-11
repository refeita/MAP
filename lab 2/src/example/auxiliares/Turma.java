package example.auxiliares;

import java.util.ArrayList;
import java.util.List;

import example.entidades.*;

public class Turma {

    private Professor professor;
    private List<Aluno> alunosDisciplina = new ArrayList<Aluno>();
    private Disciplina disciplina;

    public Turma(String nome, String dia, String hora) {
        this.disciplina = new Disciplina(nome, dia, hora);
    }

    public Professor getProfessor() {
        return professor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public List<Aluno> getAlunosDisciplina() {
        return alunosDisciplina;
    }

    public void setAlunosDisciplina(List<Aluno> alunosDisciplina) {
        this.alunosDisciplina = alunosDisciplina;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getHorario(){
        return disciplina.getHorarioString();
    }
    
    //MÉTODOS
    public List<Aluno> mostrarAlunos() {
        System.out.println("Lista de alunos da Turma: ");
        return alunosDisciplina;
    }

    public int quantidadeAlunos() {
        return alunosDisciplina.size();
    }

    public boolean adicionarAlunoNaLista(Aluno a) {
        return alunosDisciplina.add(a);
    }

    public String toString(){
        return this.disciplina.toString();
    }
  
}
