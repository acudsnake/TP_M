package clases;

import java.util.ArrayList;

public class Proceso {
    private int ID;
    private String nombre;
    private String complejidad;
    private ArrayList<Planta> planta; //1..*

    public Proceso() {
    }
    
    public Proceso(String nombre, String complejidad) {
        this.nombre = nombre;
        this.complejidad = complejidad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComplejidad() {
        return complejidad;
    }

    public void setComplejidad(String complejidad) {
        this.complejidad = complejidad;
    }

    public ArrayList<Planta> getPlanta() {
        return planta;
    }

    public void setPlanta(ArrayList<Planta> planta) {
        this.planta = planta;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }


    
    
    
}
