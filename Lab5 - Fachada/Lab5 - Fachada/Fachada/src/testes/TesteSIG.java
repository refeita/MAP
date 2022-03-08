package testes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.time.LocalDateTime;

import sig.SIG;
import administrativo.Agenda;
import controleAcademico.exceptions.AlunoException;
import controleAcademico.exceptions.ProfessorException;
import controleAcademico.exceptions.TurmaException;
import infraEstrutura.exceptions.SalaException;
public class TesteSIG {
    private static SIG sig;
    private static Agenda agenda;

    @BeforeAll
    public static void startUp() {
        sig = new SIG();
        agenda = new Agenda();
    }
    /*Teste para agendar Entrevista da diretoria, vai agendar uma Entrevista da Diretoria, depois vai tentar
    agendar novamente no mesmo horario,
    e depois vai puxar a reunião agendada*/
    @Test
    public void testAgendarEntrevistaDaDiretoria(){
        assertTrue(agenda.agendarEntrevista(LocalDateTime.of(2022, 3, 9, 12, 0, 0)));
        assertFalse(agenda.agendarEntrevista(LocalDateTime.of(2022, 3, 9, 12, 0, 0)));
        assertTrue(agenda.getEntrevistas().contains(LocalDateTime.of(2022, 3, 9, 12, 0, 0)));
    }

    /*Teste para agendar Reunião da diretoria, vai agendar uma reunião da Diretoria, depois vai tentar
    agendar novamente no mesmo horario,
    e depois vai puxar a reunião agendada*/
    @Test
    public void testAgendarReuniaoDaDiretoria(){
        assertTrue(agenda.agendarReuniao(LocalDateTime.of(2022, 3, 8, 11, 0, 0)));
        assertFalse(agenda.agendarReuniao(LocalDateTime.of(2022, 3, 8, 11, 0, 0)));
        assertTrue(agenda.getReunioes().contains(LocalDateTime.of(2022, 3, 8, 11, 0, 0)));
    }

    //Teste cadastrar dívida
    @Test
    public void testCadastrarDivida() {
        //credito para pagar as contas
        assertTrue(sig.getFinanceiro().cadastrarDivida("Pagar as contas", 0.00, 5000.00));
    }

    //Teste para cadastrar um funcionário
    @Test
    public void testCadastrarFuncionario() {
        assertTrue(sig.getFinanceiro().cadastrarFuncionario("João", 2000.00));
        assertFalse(sig.getFinanceiro().cadastrarFuncionario("João", 2000.00));
    }
    @Test
    public void testCadastrarFuncionario2() {
        assertTrue(sig.getFinanceiro().cadastrarFuncionario("Noel", 3000.00));
        assertFalse(sig.getFinanceiro().cadastrarFuncionario("Noel", 3000.00));
    }

    //Teste para cadastrar Professor
    @Test
    public void testCadastrarProfessor() throws ProfessorException {
        assertTrue(sig.getControleAcademico().cadastrarProfessores("Sabrina", 123, 5.0));
        assertTrue(sig.getControleAcademico().cadastrarProfessores("Fabio", 456, 5.0));
    }
    //Verifica se já existe um professor com esse nome
    @Test
    public void testCadastrarProfessorIgual() throws ProfessorException {
        assertTrue(sig.getControleAcademico().cadastrarProfessores("Paulo", 789, 2.0));
        assertEquals(sig.getControleAcademico().getProfessor("Paulo").getNome(), "Paulo");
    }

    //Teste para Cadastrar Turma
    @Test
    public void testCadastrarTurmas() throws TurmaException {
        assertTrue(sig.getControleAcademico().cadastrarTurma("Metodos Avançados de Programação", "Terça", "11:00"));
        assertTrue(sig.getControleAcademico().cadastrarTurma("Banco de Dados", "Terça", "7:00"));
    }
    //Verifica se já existe uma turma com esse nome
    @Test
    public void testCadastrarTurmasIgual() throws TurmaException {
        assertTrue(sig.getControleAcademico().cadastrarTurma("Redes", "Quarta", "11:00"));
        assertEquals(sig.getControleAcademico().buscarTurma("Redes").getDisciplina().getNome(), "Redes");
    }

    //Teste para Cadastrar Aluno
    @Test
    public void testCadastrarAluno() throws AlunoException {
        assertTrue(sig.getControleAcademico().adicionarAlunos("Jefferson", 1, "Computação"));
		assertTrue(sig.getControleAcademico().adicionarAlunos("Rafaela", 2, "Computação"));
    }
    //Verifica se já existe um aluno com esse nome
    @Test
    public void testCadastrarAlunoIgual() throws AlunoException {
        assertTrue(sig.getControleAcademico().adicionarAlunos("Aluno Teste", 3, "Computação"));
        assertEquals(sig.getControleAcademico().getAluno("Aluno Teste").getNome(), "Aluno Teste");
    }

    //Teste para materias cadastrados
    @Test
    public void testMateriaisCadastro(){
        assertTrue(sig.getAlmoxarifado().cadastrarMaterial("Lápis", 2.00));
        assertTrue(sig.getAlmoxarifado().cadastrarMaterial("Cartolina", 33.95));
        assertTrue(sig.getAlmoxarifado().comprarMaterial("Computador", 3000.00));
    }

    //Teste para salas cadastradas
    @Test
    public void testSalas() throws TurmaException, SalaException {
        assertTrue(sig.getInfraEstrutura().cadastrarSala(101, "A - CCT", true));
        assertTrue(sig.getInfraEstrutura().cadastrarSala(103, "B - CCT", true));
        assertTrue(sig.getInfraEstrutura().cadastrarSala(104, "C - CCT", true));
    }
    //Teste cadastrar disciplina na sala
    @Test
    public void testSalaDisciplina() throws TurmaException, SalaException {
        sig.getControleAcademico().cadastrarTurma("Banco de Dados", "Terça", "7:00");
        assertTrue(sig.getInfraEstrutura().reservarSala(sig.getControleAcademico().buscarTurma("Banco de Dados"), 104, "C - CCT"));
        assertFalse(sig.getInfraEstrutura().reservarSala(sig.getControleAcademico().buscarTurma("Banco de Dados"), 104, "C - CCT"));
    }
    @Test
    public void testSalaDisponivel() throws TurmaException, SalaException {
        assertTrue(sig.getInfraEstrutura().getSala(101, "A - CCT").getDisponivel());
        assertTrue(sig.getInfraEstrutura().getSala(103, "B - CCT").getDisponivel());
        assertFalse(sig.getInfraEstrutura().getSala(104, "C - CCT").getDisponivel());
    }
}
