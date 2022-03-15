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
public class TesteException{
    private static SIG sig;
    private static Agenda agenda;

    @BeforeAll
    public static void startUp() {
        sig = new SIG();
        agenda = new Agenda();
    }
    //Testes de exceção:
    @Test
    public void testProfessorException(){ //para professor não cadastrado
        assertThrows(ProfessorException.class, () -> {
            sig.getControleAcademico().getProfessor("Professor não existe");
        });
    }
    @Test
    public void testAlunoException(){  //para aluno não cadastrado
        assertThrows(AlunoException.class, () -> {
            sig.getControleAcademico().getAluno("Aluno não existe");
        });
    }

    @Test
    public void testTurmaException() { //para Professor não cadastrado na turma
        assertThrows(TurmaException.class, () -> {
            sig.getControleAcademico().definirProfessorNaDisciplina("Fabio", "Turma não existe");
        });
    }
    @Test
    public void testTurmaException2() { //Teste para turma não cadastrada
        assertThrows(TurmaException.class, () -> {
            sig.getControleAcademico().buscarTurma("Teste turma não existe");
        });
    }
    @Test
    public void testTurmaException3() { //para Aluno não cadastrado na turma
        assertThrows(TurmaException.class, () -> {
            sig.getControleAcademico().cadastrarAlunosNaDisciplina("Aluno Teste", "Turma não existe");

        });
    }
}
