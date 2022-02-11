package example.entidades;

import java.util.ArrayList;
import java.util.List;

import example.auxiliares.Turma;

public class ControleAcademico{

    private List<Aluno> listaAlunos;
    private List<Professor> professoresCadastrados;
    private List<Turma> listaTurmas;
    
    public ControleAcademico() {
        listaTurmas = new ArrayList<>();
        listaAlunos = new ArrayList<>();
        professoresCadastrados = new ArrayList<>();
    }

    public List<Professor> getListaProfessores(){
        return professoresCadastrados;
    }

    public List<Aluno> getListaAlunos(){
        return listaAlunos;
    }

    public List<Turma> getListaTurmas(){
        return listaTurmas;
    }

    public void getHorarioProfessor(String nome){
        List<Turma> turmas = new ArrayList<>();
        for(Professor professor : professoresCadastrados){
            if(professor.getNome().equals(nome)){
                for(Turma turma : listaTurmas){
                    if(turma.getProfessor().equals(professor)){
                        turmas.add(turma);
                    }
                }
            }
        }
        
        for(Turma turma : turmas){
            if(turma == null){
                continue;
            } else{
                System.out.println(turma.getHorario());
            }
        }
    }

    public void getHorarioAluno(String nome){
        List<Turma> turmas = new ArrayList<>();
        for(Aluno aluno : listaAlunos){
            if(aluno.getNome().equals(nome)){
                for(Turma turma : listaTurmas){
                    turmas.add(turma);
                }
            }
        }

        for(Turma turma : turmas){
            if(turma == null){
                continue;
            } else{
                System.out.println(turma.getHorario());
            }
        }
    }

    public Professor getProfessor(String nome) {

        for (Professor professor : professoresCadastrados) {
            if (professor.getNome().equals(nome)) {
                return professor;
            }
        }
        return null;

    }

    public Aluno getAluno(String nome) {

        for (Aluno aluno : listaAlunos) {
            if (aluno.getNome().equals(nome)) {
                return aluno;
            }
        }
        return null;

    }

    public boolean cadastrarTurma(String nome, String dia, String hora) {

        Turma turma = new Turma(nome, dia, hora);

        if (listaTurmas.contains(turma)) {
            return false;
        }
        listaTurmas.add(turma);
        return true;

    }
   //cadastrar um professor
    public boolean cadastrarProfessores(String nome, int id) {
        Professor professor = new Professor(nome, id);

        if (professoresCadastrados.contains(professor)) {
            return false;
        }
        professoresCadastrados.add(professor);
        return true;
    }
    //cadastrar aluno
    public boolean adicionarAlunos(String nome, int matricula, String curso) {
        Aluno aluno = new Aluno(nome, matricula, curso);

        if (listaAlunos.contains(aluno)) {
            return false;
        }
        listaAlunos.add(aluno);
        return true;
    }
    //cadastrar aluno na disciplina
    public boolean cadastrarAlunosNaDisciplina(String nomeAluno, String nomeDisciplina) {

        Turma turma = buscaTurmaPeloNome(nomeDisciplina);
        for (Aluno alunofor : listaAlunos) {
            if (alunofor.getNome().equals(nomeAluno)) {
                if(alunofor.adicionarDisciplina(turma)){
                    if(turma.adicionarAlunoNaLista(alunofor)){
                        return true;

                    }

                }
            }
        }
        return false;

    }
    //buscar lista da turma da disciplina
    public Turma buscaTurmaPeloNome(String nome) {

        for (Turma turma : listaTurmas) {
            if (turma.getDisciplina().getNome().equals(nome)) {
                return turma;
            }
        }
        return null;
    }
    //atribuir um professor a disciplina
    public boolean definirProfessorNaDisciplina(String nomeProfessor, String nomeDisciplina) {

        Turma disciplina = buscaTurmaPeloNome(nomeDisciplina);
        if (buscaTurmaPeloNome(nomeDisciplina) != null) {
            if(disciplina.getProfessor()!=null){
                return false;
            }
            for (Professor professor : professoresCadastrados) {
                if (professor.getNome().equals(nomeProfessor)) {
                    if(professor.adicionarDisciplina(disciplina)){
                        disciplina.setProfessor(professor);
                        return true;
                    }
                }
            }
        }
        
        return false;
    }

}
