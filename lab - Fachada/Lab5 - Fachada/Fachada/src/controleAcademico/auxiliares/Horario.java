package controleAcademico.auxiliares;

public class Horario {
    private String dia;
    private String horarioE;

    public Horario(){
    }

    public Horario(String dia, String horarioE) {
        this.dia = dia;
        this.horarioE = horarioE;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHorarioE() {
        return horarioE;
    }

    public void setHorarioE(String horarioE) {
        this.horarioE = horarioE;
    }

    public String toString() {
        return "Dia: " + dia + " ||Horario: " + horarioE ;
    }

}
