package example.main;

import example.entidades.ControleAcademico;

public class Main {
	public static void main(String[] args) throws Exception {

		// criacao do controle academico

		ControleAcademico ca = new ControleAcademico();
    	//adicionar alunos
		ca.adicionarAlunos("Roberto", 192080032, "Computacao"); //primeiro o nome, a matricula e depois o curso que faz
		ca.adicionarAlunos("Jefferson", 192080016, "Computaca");
		ca.adicionarAlunos("Angelo", 1003, "Computacao");
		ca.adicionarAlunos("Kennedy", 1004, "Computacao");
		ca.adicionarAlunos("Rafaela", 192080393, "Computacao");

        //adicionar professores
		ca.cadastrarProfessores("Sabrina", 101);
		ca.cadastrarProfessores("Fabio", 102);
		ca.cadastrarProfessores("Janderson", 103);
		ca.cadastrarProfessores("Ana Isabella", 104);
		ca.cadastrarProfessores("Paulo", 105);
		ca.cadastrarProfessores("Elaine", 106);
		ca.cadastrarProfessores("Robson", 107);
		
        //adicionar disciplinas
		ca.cadastrarTurma("Metodos Avancados de Programacao", "Terca", "11:00");
		ca.cadastrarTurma("Banco de Dados", "Terca", "07:00");
		ca.cadastrarTurma("Redes de Computadores", "Quarta", "11:00");
		ca.cadastrarTurma("Computacao Grafica", "Terca", "18:00");
		ca.cadastrarTurma("Paradigmas de Programacao", "Segunda", "11:00");
		ca.cadastrarTurma("Probabilidade e Estatastica 2", "Terca","09:00");
		ca.cadastrarTurma("Tecnicas de Analises de Algoritmos", "Quarta", "18:00");
		ca.cadastrarTurma("Engenharia de Software 1", "Segunda", "09:00");
		
        //associar discplina aos professores
		ca.definirProfessorNaDisciplina("Fabio", "Banco de Dados");
		ca.definirProfessorNaDisciplina("Sabrina", "Metodos Avancados de Programacao");
		ca.definirProfessorNaDisciplina("Paulo", "Redes de Computadores");
		ca.definirProfessorNaDisciplina("Janderson", "Paradigmas de Programacao");
		ca.definirProfessorNaDisciplina("Ana Isabella", "Engenharia de Software 1");
		ca.definirProfessorNaDisciplina("Elaine", "Probabilidade e Estatastica 2");
		ca.definirProfessorNaDisciplina("Paulo", "Tecnicas de Analises de Algoritmos");
		ca.definirProfessorNaDisciplina("Robson", "Computacao Grafica");
		
        //MATRICULANDO ALUNOS nas disciplinas
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
		ca.cadastrarAlunosNaDisciplina("Rafaela", "Banco de Dados");
		ca.cadastrarAlunosNaDisciplina("Rafaela", "Metodos Avancados de Programacao");
		ca.cadastrarAlunosNaDisciplina("Rafaela", "Redes de Computadores");
		ca.cadastrarAlunosNaDisciplina("Rafaela", "Paradigmas de Programacao");
		ca.cadastrarAlunosNaDisciplina("Rafaela", "Engenharia de Software 1");
		ca.cadastrarAlunosNaDisciplina("Rafaela", "Probabilidade e Estatastica 2");
		ca.cadastrarAlunosNaDisciplina("Rafaela", "Tecnicas de Analises de Algoritmos");
		ca.cadastrarAlunosNaDisciplina("Rafaela", "Computacao Grafica");
		ca.cadastrarAlunosNaDisciplina("Agelo", "Banco de Dados");
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

        //Mostrar disciplina que o professor ministra
        printLine();
		System.out.println("Quais disciplinas o professor esta ministrando?");
		System.out.println(ca.getProfessor("Fabio").toString());
		System.out.println(ca.getProfessor("Fabio").getRdm().mostrarDisciplinas());
		//System.out.println(ca.getProfessor("Sabrina").toString());
		//System.out.println(ca.getProfessor("Sabrina").getRdm().mostrarDisciplinas() + "\n");
		//System.out.println(ca.getProfessor("Janderson").toString());
		//System.out.println(ca.getProfessor("Janderson").getRdm().mostrarDisciplinas() + "\n");
		//System.out.println(ca.getProfessor("Robson").toString());
		//System.out.println(ca.getProfessor("Robson").getRdm().mostrarDisciplinas() + "\n");
		//System.out.println(ca.getProfessor("Paulo").toString());
		//System.out.println(ca.getProfessor("Paulo").getRdm().mostrarDisciplinas() + "\n");
		//System.out.println(ca.getProfessor("Elaine").toString());
		//System.out.println(ca.getProfessor("Elaine").getRdm().mostrarDisciplinas() + "\n");
		//System.out.println(ca.getProfessor("Ana Isabella").toString());
		//System.out.println(ca.getProfessor("Ana Isabella").getRdm().mostrarDisciplinas() + "\n");
        printLine();

        //Mostra o horario do professor
		System.out.println("Qual o horario de um professor ?\n");
		System.out.println(ca.getProfessor("Fabio"));
		ca.getHorarioProfessor("Fabio");
		//System.out.println(ca.getProfessor("Sabrina"));
		//ca.getHorarioProfessor("Sabrina");
		//System.out.println(ca.getProfessor("Janderson"));
		//ca.getHorarioProfessor("Janderson");
		//System.out.println(ca.getProfessor("Robson"));
		//ca.getHorarioProfessor("Robson");
		//System.out.println(ca.getProfessor("Paulo"));
		//ca.getHorarioProfessor("Paulo");
		//System.out.println(ca.getProfessor("Elaine"));
		//ca.getHorarioProfessor("Elaine");
		//System.out.println(ca.getProfessor("Ana Isabella"));
		//ca.getHorarioProfessor("Ana Isabella");
        printLine();
        
        //Mostra os alunos matriculados em determinada disciplina
		System.out.println("Quais os alunos est�o matriculados na disciplina ?");
		System.out.println(ca.buscaTurmaPeloNome("Metodos Avancados de Programacao").toString());
        System.out.println(ca.buscaTurmaPeloNome("Metodos Avancados de Programacao").mostrarAlunos() + "\n");
		//System.out.println(ca.buscaTurmaPeloNome("Banco de Dados").toString());
        //System.out.println(ca.buscaTurmaPeloNome("Banco de Dados").mostrarAlunos() + "\n");
        //System.out.println(ca.buscaTurmaPeloNome("Redes de Computadores").toString());
        //System.out.println(ca.buscaTurmaPeloNome("Redes de Computadores").mostrarAlunos() + "\n");
        //System.out.println(ca.buscaTurmaPeloNome("Engenharia de Software 1").toString());
        //System.out.println(ca.buscaTurmaPeloNome("Engenharia de Software 1").mostrarAlunos() + "\n");
        //System.out.println(ca.buscaTurmaPeloNome("Computacao Grafica").toString());
        //System.out.println(ca.buscaTurmaPeloNome("Computacao Grafica").mostrarAlunos() + "\n");
        //System.out.println(ca.buscaTurmaPeloNome("Paradigmas de Programação").toString());
        //System.out.println(ca.buscaTurmaPeloNome("Paradigmas de Programação").mostrarAlunos() + "\n");
        //System.out.println(ca.buscaTurmaPeloNome("Probabilidade e Estatastica 2").toString());
        //System.out.println(ca.buscaTurmaPeloNome("Probabilidade e Estatastica 2").mostrarAlunos() + "\n");
        //System.out.println(ca.buscaTurmaPeloNome("Tecnicas de Analises de Algoritmos").toString());
        //System.out.println(ca.buscaTurmaPeloNome("Tecnicas de Analises de Algoritmos").mostrarAlunos() + "\n");
        printLine();
        
        //Mostra a quantidade de alunos matriculados em cada disciplina
		System.out.println("Qual a quantidade de alunos matriculados na disciplina ?");
		System.out.println(ca.buscaTurmaPeloNome("Metodos Avancados de Programacao").toString());
		System.out.println("Quantidade de Alunos: "+ ca.buscaTurmaPeloNome("Metodos Avancados de Programacao").quantidadeAlunos());
		//System.out.println(ca.buscaTurmaPeloNome("Banco de Dados").toString());
		//System.out.println("Quantidade de Alunos: " + ca.buscaTurmaPeloNome("Banco de Dados").quantidadeAlunos());
		//System.out.println(ca.buscaTurmaPeloNome("Redes de Computadores").toString());
		//System.out.println("Quantidade de Alunos: " + ca.buscaTurmaPeloNome("Redes de Computadores").quantidadeAlunos());
		//System.out.println(ca.buscaTurmaPeloNome("Engenharia de Software 1").toString());
		//System.out.println("Quantidade de Alunos: " + ca.buscaTurmaPeloNome("Engenharia de Software 1").quantidadeAlunos());
		//System.out.println(ca.buscaTurmaPeloNome("Computacao Grafica").toString());
		//System.out.println("Quantidade de Alunos: " + ca.buscaTurmaPeloNome("Computacao Grafica").quantidadeAlunos());
		//System.out.println(ca.buscaTurmaPeloNome("Paradigmas de Programacao").toString());
		//System.out.println("Quantidade de Alunos: " + ca.buscaTurmaPeloNome("Paradigmas de Programacao").quantidadeAlunos());
		//System.out.println(ca.buscaTurmaPeloNome("Probabilidade e Estatastica 2").toString());
		//System.out.println("Quantidade de Alunos: " + ca.buscaTurmaPeloNome("Probabilidade e Estatastica 2").quantidadeAlunos());
		//System.out.println(ca.buscaTurmaPeloNome("Tecnicas de Analises de Algoritmos").toString());
		//System.out.println("Quantidade de Alunos: " + ca.buscaTurmaPeloNome("Tecnicas de Analises de Algoritmos").quantidadeAlunos());
        printLine();
        
        //Mostra em quais discplinas o aluno esta matriculado
		System.out.println("Quais as disciplinas de um aluno ?");
		System.out.println(ca.getAluno("Roberto").toString());
		System.out.println(ca.getAluno("Roberto").getRdm().mostrarDisciplinas());
		//System.out.println(ca.getAluno("Jefferson").toString());
		//System.out.println(ca.getAluno("Jefferson").getRdm().mostrarDisciplinas());
		//System.out.println(ca.getAluno("Rafaela").toString());
		//System.out.println(ca.getAluno("Rafaela").getRdm().mostrarDisciplinas());
		//System.out.println(ca.getAluno("Angelo").toString());
		//System.out.println(ca.getAluno("Angelo").getRdm().mostrarDisciplinas());
		//System.out.println(ca.getAluno("Kennedy").toString());
		//System.out.println(ca.getAluno("Kennedy").getRdm().mostrarDisciplinas());
        printLine();

        //Mostra o horario do aluno
		System.out.println("Quais os horarios de um aluno ?");
		System.out.println(ca.getAluno("Roberto").toString());
		ca.getHorarioAluno("Roberto");
		//System.out.println(ca.getAluno("Jefferson").toString());
		//ca.getHorarioAluno("Jefferson");
		//System.out.println(ca.getAluno("Rafaela").toString());
		//ca.getHorarioAluno("Rafaela");
		//System.out.println(ca.getAluno("Angelo").toString());
		//ca.getHorarioAluno("Angelo");
		//System.out.println(ca.getAluno("Kennedy").toString());
		//ca.getHorarioAluno("Kennedy");
        printLine();
        
	}
		//usado para organizar o codigo, vai printar "__" onde for chamado
		private static void printLine(){
		System.out.println("___________________________________________________________________________________");
		
	}
}