package administrativo;

import java.time.LocalDateTime;

//(reuniões agendadas com a diretoria, entrevistas);
public class AdministrativoFachada {
    private Agenda agenda;

    public AdministrativoFachada() {
        this.agenda = new Agenda();
    }

    public Agenda getAgenda(){
        return this.agenda;
    }
    
    public void setAgenda(Agenda agenda){
        this.agenda = agenda;
    }


    public boolean agendarReuniaoDaDiretoria(LocalDateTime dataDaReuniao) {
        return this.agenda.agendarReuniao(dataDaReuniao);
    }

    public boolean agendarEntrevista(LocalDateTime dataDaEntrevista) {
        return this.agenda.agendarEntrevista(dataDaEntrevista);
    }

    public String reunioesAgendadasDiretoria(){
        return this.agenda.mostrarReunioesDiretoria();
    }

    public String entrevistasAgendadas() {
        return this.agenda.mostrarEntrevistas();
    }
}
