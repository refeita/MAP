package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import entidades.Filme;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;
import java.util.List;

public class TesteFilme {
    public Filme filme1;

    @Before
    public void start() {
        Filme filme = new Filme("O Auto da Compadecida", 2000);
    }

    @Test
    //Teste para Cadastrar Funcionário no filme
    public void testeCadastrarFuncionario() {
        Filme filme = new Filme("O Auto da Compadecida", 2000);
        assertTrue(filme.cadastrarFuncionario("Selton Melo", new ArrayList<>(List.of("Ator"))));
        assertFalse(filme.cadastrarFuncionario("Selton Melo", new ArrayList<>(List.of("Ator"))));
    }
}
