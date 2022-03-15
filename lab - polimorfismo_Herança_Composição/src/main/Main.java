package main;

import java.util.List; // retorna uma lista que não pode ser modificada
import java.util.ArrayList;
import java.util.Map;

import entidades.GloboFilmes;
import exceptions.FilmeNotExistException;

public class Main {
    public static void main(String[] args) throws FilmeNotExistException {
        GloboFilmes globoFilmes = new GloboFilmes();

        //cadastrar filme 1
        globoFilmes.cadastrarFilme("O Auto da Compadecida", 2000, Map.ofEntries(
                //cadastrar Funcionários
                        Map.entry("Guel Arraes", new ArrayList<>(List.of("Diretor","Roteirista"))),
                        Map.entry("Selton Melo", new ArrayList<>(List.of("Ator"))),
                        Map.entry("Denise Fraga", new ArrayList<>(List.of("Ator"))),
                        Map.entry("Félix Monti", new ArrayList<>(List.of("Cinegrafista")))),

                //cadastrar musica:
                new ArrayList<>(List.of("Aboio", "Presepada", "Régia")));

        //cadastrar filme 2
        globoFilmes.cadastrarFilme("O Homem Que Desafiou o Diabo", 2007, Map.ofEntries(
                        Map.entry("Moacyr Góes", new ArrayList<>(List.of("Diretor", "Roteirista"))),
                        Map.entry("Marcos Palmeira", new ArrayList<>(List.of("Ator"))),
                        Map.entry("Lívia Falcão", new ArrayList<>(List.of("Ator"))),
                        Map.entry("Jacques Cheuiche", new ArrayList<>(List.of("Cinegrafista")))),
                new ArrayList<>(List.of("Não grude não", "Sim foi você", "Boi Tungão")));

        printLine();
        //Mostrar informações do filme
        System.out.println(globoFilmes.mostrarInformacoesFilme("O Homem Que Desafiou o Diabo"));
        printLine();
        System.out.println(globoFilmes.mostrarInformacoesFilme("O Auto da Compadecida"));
        //Mostrar informações dos Funcionários
        printLine();
        System.out.println(globoFilmes.mostrarFilmografia("Guel Arraes", "Diretor"));
        printLine();
        System.out.println(globoFilmes.mostrarFilmografia("Selton Melo", "Ator"));
        printLine();
        System.out.printf(globoFilmes.mostrarFilmografia("Moacyr Góes", "Diretor"));
        printLine();

    }
    //usado para organizar o codigo, vai printar "__" onde for chamado
    private static void printLine () {
        System.out.println("_________________________________________________________________________________________");
    }
}
