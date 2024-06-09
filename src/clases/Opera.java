package clases;
import java.time.LocalDate;
import java.util.ArrayList;

public class Opera {
    private int ID;
    private LocalDate  fechaInicio;
    private LocalDate  fechaFinal;
    private int turno;
    private Maquina maquina;
    private Tecnico tecnico;
    
    public Opera() {
    }

    public Opera(int turno, LocalDate fechaInicio, Maquina maquina, Tecnico tecnico) {
        this.fechaInicio = fechaInicio;
        this.turno = turno;
        this.tecnico=tecnico;
        this.maquina=maquina;
    }
    
    public Opera(int turno, LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
        this.turno = turno;
    }
    
    public Opera(LocalDate fechaInicio, LocalDate fechaFinal, int turno) {
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.turno = turno;
    }
    
    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public Maquina getMaquina() {
        return maquina;
    }

    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    
}
