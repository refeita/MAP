package main;

import java.time.LocalDateTime;
import controleAcademico.exceptions.AlunoException;
import controleAcademico.exceptions.ProfessorException;
import controleAcademico.exceptions.TurmaException;
import sig.SIG;

public class Main {

    public static void main(String[] args) throws TurmaException, AlunoException, ProfessorException {
        // sistema de informação geral (SIG)
        SIG sig = new SIG();

        //Reunioes e entrevistas com diretoria
        printLine();
        System.out.println("\nSUBSISTEMA ADMINISTRATIVO\n");

        //agendar reunião
        System.out.println("Reuniões agendadas com a diretoria");
        sig.getAdministrativo().agendarReuniaoDaDiretoria(LocalDateTime.of(2022, 3, 8, 11, 0, 0));
        sig.getAdministrativo().agendarReuniaoDaDiretoria(LocalDateTime.of(2022, 3, 10, 11, 0, 0));
        System.out.println(sig.getAdministrativo().reunioesAgendadasDiretoria());

        //agendar entrevista
        System.out.println("Agenda de entrevitas da diretoria");
        sig.getAdministrativo().agendarEntrevista(LocalDateTime.of(2022, 3, 9, 12, 0, 0));
        sig.getAdministrativo().agendarEntrevista(LocalDateTime.of(2022, 3, 12, 18, 30, 0));
        System.out.println(sig.getAdministrativo().entrevistasAgendadas());

        //__________________________________________________________________________________________________________
        //Balanco de contas e folha de pagamento
        printLine();
        System.out.println("SUBSISTEMA FINANCEIRO\n");

        //cadastrar dívida
        System.out.println("Balanço das Contas");
        sig.getFinanceiro().cadastrarDivida("Internet", 129.00, 0.00);
        sig.getFinanceiro().cadastrarDivida("Àgua", 900.00, 0.00);
        sig.getFinanceiro().cadastrarDivida("Luz", 450.00, 0.00);

        System.out.println(sig.getFinanceiro().mostrarBalanco());

        //cadastrar funcionario e seu salario
        System.out.println("Folha de Pagamentos");
        sig.getFinanceiro().cadastrarFuncionario("José", 1222.00);
        sig.getFinanceiro().cadastrarFuncionario("Maria", 2500.00);

        System.out.println(sig.getFinanceiro().mostrarFolhaDePagamentos());

        //Alocação por disciplina, tempo de casa
        printLine();
        System.out.println("SUBSISTEMA PROFESSORES\n");
        System.out.println("Professores:");

        //Definindo subsistema__________________________________________________________________________________________________________
        //Cadastrando turma, horario e professor(com ID e tempo de cada)
        sig.getControleAcademico().cadastrarTurma("Metodos Avançados de Programação", "Terça", "11:00");
        sig.getControleAcademico().cadastrarTurma("Banco de Dados", "Terça", "7:00");
        sig.getControleAcademico().cadastrarTurma("Redes", "Quarta", "11:00");
        //cadastrar professor
        sig.getControleAcademico().cadastrarProfessores("Sabrina", 123, 5.0);
        sig.getControleAcademico().cadastrarProfessores("Fabio", 456, 5.0);
        sig.getControleAcademico().cadastrarProfessores("Paulo", 789, 2.0);

        //Cadastrar professor na disciplina
        sig.getControleAcademico().definirProfessorNaDisciplina("Fabio", "Banco de Dados");
        sig.getControleAcademico().definirProfessorNaDisciplina("Sabrina", "Metodos Avançados de Programação");
        sig.getControleAcademico().definirProfessorNaDisciplina("Paulo", "Redes");
        //________________________________________________________________________________________________________________________________

        //Lista de professores
        System.out.println(sig.getControleAcademico().getListaProfessores());

        //Tempo de casa
        System.out.println("\nTempo de casa dos professores: ");
        System.out.println("Sabrina: " + sig.getControleAcademico().getProfessor("Sabrina").getTempoDeCasa());
        System.out.println("Fabio: " + sig.getControleAcademico().getProfessor("Fabio").getTempoDeCasa());
        System.out.println("Paulo: " + sig.getControleAcademico().getProfessor("Paulo").getTempoDeCasa());
        //RDM (Professor e sua lista de disciplinas)
        System.out.println("");
        System.out.println("\nRDM dos Professores: ");
        System.out.println(sig.getControleAcademico().getProfessor("Fabio").toString());
        System.out.println(sig.getControleAcademico().getProfessor("Fabio").getRdm().mostrarDisciplinas() + "\n");
        System.out.println(sig.getControleAcademico().getProfessor("Sabrina").toString());
        System.out.println(sig.getControleAcademico().getProfessor("Sabrina").getRdm().mostrarDisciplinas() + "\n");
        System.out.println(sig.getControleAcademico().getProfessor("Fabio").toString());
        System.out.println(sig.getControleAcademico().getProfessor("Fabio").getRdm().mostrarDisciplinas() + "\n");

        //________________________________________________________________________________________________________________________________
        //Historico e RDM
        printLine();
        System.out.println("SUBSISTEMA ALUNOS\n");
        System.out.println("Alunos");

        //Adicionar aluno
        sig.getControleAcademico().adicionarAlunos("Jefferson", 1, "Computação");
        sig.getControleAcademico().adicionarAlunos("Rafaela", 2, "Computação");

        //Adicionar aluno na(s) disciplinas
        sig.getControleAcademico().cadastrarAlunosNaDisciplina("Jefferson", "Banco de Dados");
        sig.getControleAcademico().cadastrarAlunosNaDisciplina("Jefferson", "Metodos Avançados de Programação");
        sig.getControleAcademico().cadastrarAlunosNaDisciplina("Rafaela", "Banco de Dados");
        sig.getControleAcademico().cadastrarAlunosNaDisciplina("Rafaela", "Metodos Avançados de Programação");

        System.out.println(sig.getControleAcademico().getAluno("Jefferson").toString());
        System.out.println(sig.getControleAcademico().getAluno("Jefferson").getRdm().mostrarDisciplinas() + "\n");
        System.out.println(sig.getControleAcademico().getAluno("Rafaela").toString());
        System.out.println(sig.getControleAcademico().getAluno("Rafaela").getRdm().mostrarDisciplinas() + "\n");

        //________________________________________________________________________________________________________________________________
        //Estoque e pedido de compra
        printLine();
        System.out.println("SUBSISTEMA ALMOXARIFADO\n");
        System.out.println("Materiais: ");

        //cadastrar material
        sig.getAlmoxarifado().cadastrarMaterial("Lápis", 2.00);
        sig.getAlmoxarifado().cadastrarMaterial("Cartolina", 33.95);
        sig.getAlmoxarifado().comprarMaterial("Computador", 3000.00);

        System.out.println(sig.getAlmoxarifado().mostrarEstoque());

        //________________________________________________________________________________________________________________________________
        //Alocação de salas
        printLine();
        System.out.println("SUBSISTEMA INFRAESTRUTURA\n");
        System.out.println("Salas");

        //cadastrar sala
        sig.getInfraEstrutura().cadastrarSala(101, "A - CCT", true);
        sig.getInfraEstrutura().cadastrarSala(103, "B - CCT", true);
        sig.getInfraEstrutura().cadastrarSala(104, "C - CCT", true);

        //Lista todas as salas
        System.out.println(sig.getInfraEstrutura().mostrarSalas());
        //reservar sala
        sig.getInfraEstrutura().reservarSala(sig.getControleAcademico().buscarTurma("Banco de Dados"), 103, "B - CCT");

        //Apenas as salas disponíveis
        System.out.println("Salas disponíveis");
        System.out.println(sig.getInfraEstrutura().listarSalasDisponiveis());

    }
    //usado para organizar o codigo, vai printar "__" onde for chamado
    private static void printLine (){
        System.out.println("_________________________________________________________________________________________");
    }
}

