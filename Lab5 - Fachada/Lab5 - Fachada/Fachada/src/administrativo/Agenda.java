package administrativo;

import java.util.ArrayList;
import java.time.LocalDateTime;

public class Agenda {
    //Data na ordem: year-month-day-hour-minute-second
    private ArrayList<LocalDateTime> reunioes;
    private ArrayList<LocalDateTime> entrevistas;

    public Agenda() {
        this.reunioes = new ArrayList<>();
        this.entrevistas = new ArrayList<>();
    }

    //Gets e Sets----------------------------------------------------------------
    public ArrayList<LocalDateTime> getReunioes() {
        return this.reunioes;
    }

    public ArrayList<LocalDateTime> getEntrevistas() {
        return this.entrevistas;
    }

    public void setReunioes(ArrayList<LocalDateTime> reunioes){
        this.reunioes = reunioes;
    }

    public void setEntrevistas(ArrayList<LocalDateTime> entrevistas){
        this.entrevistas = entrevistas;
    }
    //-----------------------------------------------------------------------------

    //Agenda reuniao com a diretoria caso horario disponivel
    public boolean agendarReuniao(LocalDateTime dataDaReuniao) {
        for (LocalDateTime date : reunioes) {
            if(date.isEqual(dataDaReuniao)){
                return false;
            }
        }
        this.reunioes.add(dataDaReuniao);
        return true;
    }

    //Agenda entrevista caso horario disponivel
    public boolean agendarEntrevista(LocalDateTime dataDaEntrevista) {
        for (LocalDateTime date : entrevistas) {
            if(date.isEqual(dataDaEntrevista)){
                return false;
            }
        }
        this.entrevistas.add(dataDaEntrevista);
        return true;
    }

    //Lista de reunioes
    public String mostrarReunioesDiretoria(){
        StringBuilder novaReuniao = new StringBuilder();

        for (LocalDateTime date : reunioes) {
            novaReuniao.append("Data: " +date.getDayOfMonth() +"/"+ date.getMonthValue()+"/"+ date.getYear() + " - Horario: "+ date.getHour()+":"+ date.getMinute()).append("\n");
        }
        return novaReuniao.toString();
    }

    //Lista de entrevistas
    public String mostrarEntrevistas() {
        StringBuilder entrevistasDiretoria = new StringBuilder();

        for (LocalDateTime date : entrevistas) {
            entrevistasDiretoria.append("Data: " +date.getDayOfMonth() +"/"+ date.getMonthValue()+"/"+ date.getYear() + " - Horario: "+ date.getHour()+":"+ date.getMinute()).append("\n");
        }
        return entrevistasDiretoria.toString();
    }
}
