package clases;

import java.util.ArrayList;

public class Planta {
    private int id;
    private String color;
    private int superficie;
    private ArrayList<Maquina> maquina; //0..*
    private ArrayList<Proceso> proceso; //0..*

    public Planta() {

    }

    public Planta( String color, int superficie) {
        this.color = color;
        this.superficie = superficie;
    }
    
    
  

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public ArrayList<Maquina> getMaquina() {
        return maquina;
    }

    public void setMaquina(ArrayList<Maquina> maquina) {
        this.maquina = maquina;
    }

    public ArrayList<Proceso> getProceso() {
        return proceso;
    }

    public void setProceso(ArrayList<Proceso> proceso) {
        this.proceso = proceso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
