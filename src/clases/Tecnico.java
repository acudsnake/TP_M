package clases;
import java.time.LocalDate;
import java.util.ArrayList;

public class Tecnico {
    private String nombre;
    private String apellido;
    private int DNI;
    private String contacto;
    private LocalDate fechaNacimiento;
    int ID;
    private ArrayList<Maquina> maquinas; //0...*
    private Opera opera;

    public Tecnico() {
    }
    
    public Tecnico(String nombre, String apellido,int DNI, String contacto, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.DNI = DNI;
        this.contacto = contacto;
    }

    public ArrayList<Maquina> getMaquinas() {
        return maquinas;
    }

    public void setMaquinas(ArrayList<Maquina> maquinas) {
        this.maquinas = maquinas;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public Opera getOpera() {
        return opera;
    }

    public void setOpera(Opera opera) {
        this.opera = opera;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    
}
