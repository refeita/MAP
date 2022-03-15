package example.auxiliares;

public class Horario {
    private String dia;
    private String horario;

    public Horario(){

    }
    public Horario(String dia, String horario) {
        this.dia = dia;
        this.horario = horario;
    }
    //get e set
    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String toString() {
        return dia + ": " + horario;
    }

}
