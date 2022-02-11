package testes;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import example.auxiliares.*;
import example.entidades.*;

public class ControleTeste {
    static ControleAcademico ca;

    @Before
    public void setUp() {

        ca = new ControleAcademico();

		ca.cadastrarTurma("Metodos Avancados de Programacao", "Terca", "11:00");
		ca.cadastrarTurma("Banco de Dados", "Terca", "07:00");
		ca.cadastrarTurma("Redes de Computadores", "Quarta", "11:00");
		ca.cadastrarTurma("Computacao Grafica", "Terca", "18:00");
		ca.cadastrarTurma("Paradigmas de Programacao", "Segunda", "11:00");
		ca.cadastrarTurma("Probabilidade e Estatastica 2", "Terca","09:00");
		ca.cadastrarTurma("Tecnicas de Analises de Algoritmos", "Quarta", "18:00");
		ca.cadastrarTurma("Engenharia de Software 1", "Segunda", "09:00");

		ca.cadastrarProfessores("Sabrina", 101);
		ca.cadastrarProfessores("Fabio", 102);
		ca.cadastrarProfessores("Janderson", 103);
		ca.cadastrarProfessores("Ana Isabella", 104);
		ca.cadastrarProfessores("Paulo", 105);
		ca.cadastrarProfessores("Elaine", 106);
		ca.cadastrarProfessores("Robson", 107);

		ca.adicionarAlunos("Roberto", 192080032, "Computacao");
		ca.adicionarAlunos("Jefferson", 192080016, "Computacao");
		ca.adicionarAlunos("Angelo", 1003, "Computacao");
		ca.adicionarAlunos("Kennedy", 1004, "Computacao");
		ca.adicionarAlunos("Rafaela", 192080393, "Computacao");

		ca.definirProfessorNaDisciplina("Fabio", "Banco de Dados");
		ca.definirProfessorNaDisciplina("Sabrina", "Metodos Avancados de Programacao");
		ca.definirProfessorNaDisciplina("Paulo", "Redes de Computadores");
		ca.definirProfessorNaDisciplina("Janderson", "Paradigmas de Programacao");
		ca.definirProfessorNaDisciplina("Ana Isabella", "Engenharia de Software 1");
		ca.definirProfessorNaDisciplina("Elaine", "Probabilidade e Estatastica 2");
		ca.definirProfessorNaDisciplina("Paulo", "Tecnicas de Analises de Algoritmos");
		ca.definirProfessorNaDisciplina("Robson", "Computacao Grafica");

		ca.cadastrarAlunosNaDisciplina("Roberto", "Banco de Dados");
		ca.cadastrarAlunosNaDisciplina("Roberto", "Metodos Avancados de Programacao");
		ca.cadastrarAlunosNaDisciplina("Roberto", "Redes de Computadores");
		ca.cadastrarAlunosNaDisciplina("Roberto", "Paradigmas de Programacao");
		ca.cadastrarAlunosNaDisciplina("Roberto", "Engenharia de Software 1");
		ca.cadastrarAlunosNaDisciplina("Roberto", "Probabilidade e Estatastica 2");
		ca.cadastrarAlunosNaDisciplina("Roberto", "Tecnicas de Analises de Algoritmos");
		ca.cadastrarAlunosNaDisciplina("Roberto", "Computacao Grafica");
		ca.cadastrarAlunosNaDisciplina("Jefferson", "Banco de Dados");
		ca.cadastrarAlunosNaDisciplina("Jefferson", "Metodos Avancados de Programacao");
		ca.cadastrarAlunosNaDisciplina("Jefferson", "Redes de Computadores");
		ca.cadastrarAlunosNaDisciplina("Jefferson", "Paradigmas de Programacao");
		ca.cadastrarAlunosNaDisciplina("Jefferson", "Engenharia de Software 1");
		ca.cadastrarAlunosNaDisciplina("Jefferson", "Probabilidade e Estatastica 2");
		ca.cadastrarAlunosNaDisciplina("Jefferson", "Tecnicas de Analises de Algoritmos");
		ca.cadastrarAlunosNaDisciplina("Jefferson", "Computacao Grafica");
		ca.cadastrarAlunosNaDisciplina("Angelo", "Banco de Dados");
		ca.cadastrarAlunosNaDisciplina("Angelo", "Metodos Avancados de Programacao");
		ca.cadastrarAlunosNaDisciplina("Angelo", "Redes de Computadores");
		ca.cadastrarAlunosNaDisciplina("Angelo", "Paradigmas de Programacao");
		ca.cadastrarAlunosNaDisciplina("Angelo", "Engenharia de Software 1");
		ca.cadastrarAlunosNaDisciplina("Angelo", "Probabilidade e Estatastica 2");
		ca.cadastrarAlunosNaDisciplina("Angelo", "Tecnicas de Analises de Algoritmos");
		ca.cadastrarAlunosNaDisciplina("Angelo", "Computacao Grafica");
		ca.cadastrarAlunosNaDisciplina("Kennedy", "Banco de Dados");
		ca.cadastrarAlunosNaDisciplina("Kennedy", "Metodos Avancados de Programacao");
		ca.cadastrarAlunosNaDisciplina("Kennedy", "Redes de Computadores");
		ca.cadastrarAlunosNaDisciplina("Kennedy", "Paradigmas de Programacao");
		ca.cadastrarAlunosNaDisciplina("Kennedy", "Engenharia de Software 1");
		ca.cadastrarAlunosNaDisciplina("Kennedy", "Probabilidade e Estatastica 2");
		ca.cadastrarAlunosNaDisciplina("Kennedy", "Tecnicas de Analises de Algoritmos");
		ca.cadastrarAlunosNaDisciplina("Kennedy", "Computacao Grafica");
		ca.cadastrarAlunosNaDisciplina("Rafaela", "Banco de Dados");
		ca.cadastrarAlunosNaDisciplina("Rafaela", "Metodos Avancados de Programacao");
		ca.cadastrarAlunosNaDisciplina("Rafaela", "Redes de Computadores");
		ca.cadastrarAlunosNaDisciplina("Rafaela", "Paradigmas de Programacao");
		ca.cadastrarAlunosNaDisciplina("Rafaela", "Engenharia de Software 1");
		ca.cadastrarAlunosNaDisciplina("Rafaela", "Probabilidade e Estatastica 2");
		ca.cadastrarAlunosNaDisciplina("Rafaela", "Tecnicas de Analises de Algoritmos");
		ca.cadastrarAlunosNaDisciplina("Rafaela", "Computacao Grafica");
    }

    @Test
    public void testGetAllTurmas() {
        List<Turma> caTurmas = new ArrayList<>();
        //testa o cadastro de turma
        caTurmas.add(new Turma("Metodos Avancados de Programacao", "Segunda", "9:00"));
        caTurmas.add(new Turma("Banco de Dados", "Segunda", "7:00"));
        caTurmas.add(new Turma("Redes", "Terca", "11:00"));
        caTurmas.add(new Turma("APS", "Quarta", "7:00"));
        caTurmas.add(new Turma("Calculo 3", "Sexta", "7:00"));

        assertEquals(caTurmas.getClass(), ca.getListaTurmas().getClass());
    }

    @Test
    //testa a quantidade de turmas
    public void testGetTotalTurmas() {
        assertEquals(8, ca.getListaTurmas().size());
    }

    @Test
    public void testGetTurmaPeloNome() {
        assertEquals("Metodos Avancados de Programacao", ca.buscaTurmaPeloNome("Metodos Avancados de Programacao").getDisciplina().getNome());
    }

    @Test
    public void testGetTurmaPorId() {
        assertEquals("Banco de Dados", ca.getListaTurmas().get(1).getDisciplina().getNome());
    }


    @Test
    public void testAddTurma() {
        ca.cadastrarTurma("Paradigmas de Programacao", "Quinta", "18:00");
        assertEquals("Paradigmas de Programacao", ca.buscaTurmaPeloNome("Paradigmas de Programacao").getDisciplina().getNome());               
    }


    @Test
    public void testGetAlunoPorNome() {
        assertEquals("Roberto", ca.getAluno("Roberto").getNome());
    }

    @Test
    public void testGetAlunoPorId() {
        assertEquals(192080016, ca.getAluno("Jefferson").getId());
    }

    @Test
    public void testGetAlunoPorIndex() {
        assertEquals("Angelo", ca.getListaAlunos().get(2).getNome());
    }

    @Test
    public void testTotalAlunosTurmas() {
    	//verifica quantidade de alunos matriculado na disciplina
        assertEquals(5, ca.buscaTurmaPeloNome("Redes de Computadores").quantidadeAlunos());
    }

    @Test
    public void testGetAllAlunos() {

        List<Aluno> caAlunos = new ArrayList<>();

        caAlunos.add(new Aluno("Roberta", 111, "Computacao"));
        caAlunos.add(new Aluno("Josenelle", 222, "Computacao"));
        caAlunos.add(new Aluno("Joy", 333, "Computacao"));
        caAlunos.add(new Aluno("Eva", 444, "Quimica"));
        caAlunos.add(new Aluno("Pedro", 555, "Matematica"));
        caAlunos.add(new Aluno("Henrique", 666, "Fisica"));

        assertEquals(caAlunos.getClass(), ca.getListaAlunos().getClass());
    }

    @Test
    public void testAddAluno() {
        ca.adicionarAlunos("Novo Aluno", 1006 , "Filosofia");
        assertEquals("Novo Aluno", ca.getAluno("Novo Aluno").getNome());
    }

     @Test
    public void testGetProfessorPorNome() {
        assertEquals("Sabrina", ca.getProfessor("Sabrina").getNome());
    }

    @Test
    public void testGetProfessorPorId() {
        assertEquals(102, ca.getProfessor("Fabio").getId());
    }

    @Test
    public void testGetProfessorPorIndex() {
        assertEquals("Janderson", ca.getListaProfessores().get(2).getNome());
    }

    @Test
    public void testGetAllProfessor() {

        List<Professor> caProfessores = new ArrayList<>();

        caProfessores.add(new Professor("Sabrina", 123));
        caProfessores.add(new Professor("Fabio", 456));
        caProfessores.add(new Professor("Janderson", 789));
        caProfessores.add(new Professor("Luciana", 1011));
        caProfessores.add(new Professor("Maxuel", 1314));

        assertEquals(caProfessores.getClass(), ca.getListaProfessores().getClass());
    }

    @Test
    public void testAddProfessor() {
        ca.cadastrarProfessores("Novo Professor", 1516);
        assertEquals("Novo Professor", ca.getProfessor("Novo Professor").getNome());
    }

}