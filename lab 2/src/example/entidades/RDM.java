package example.entidades;

import java.util.ArrayList;
import java.util.List;

import example.auxiliares.Turma;

public class RDM {

    private List<Turma> listaTurmas = new ArrayList<Turma>();

    public List<Turma> getListaTurmas() {
        return listaTurmas;
    }

    public void setListaTurmas(List<Turma> listaTurmas) {
        this.listaTurmas = listaTurmas;
    }

    public boolean adicionarDisciplinaRDM(Turma turma) {

        if (listaTurmas.contains(turma)) {
            return false;
        }
        listaTurmas.add(turma); // DISCIPLINA ADICIONADA!
        return true;
    }
    //Mostrar as discplinas
    public List<Turma> mostrarDisciplinas() {
        System.out.println("Lista de Disciplinas: ");
        if (listaTurmas.isEmpty()) {
            return null;
        }
        return getListaTurmas();
    }
}
