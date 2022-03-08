package controleAcademico.models;

import java.util.ArrayList;
import java.util.List;

import controleAcademico.auxiliares.Turma;

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

    //Lista de disciplinas
    public List<Turma> mostrarDisciplinas() {
        System.out.println("Lista de Disciplinas: ");
        if (listaTurmas.isEmpty()) {
            return null;
        }
        return getListaTurmas();

    }

}
