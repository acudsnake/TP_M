package clases;

import java.util.ArrayList;


public class Maquina {
    private int ID;
    private String marca;
    private String modelo;
    private int numero;
    private String estado;
    //private Planta planta; //1
    private int planta; //1
    private Opera opera;

    public Maquina( ) {
    }
    
    public Maquina(String marca, String modelo, int numero, String estado) {
        this.marca = marca;
        this.modelo = modelo;
        this.numero = numero;
        this.estado = estado;
    }
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }
 
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Opera getOpera() {
        return opera;
    }

    public void setOpera(Opera opera) {
        this.opera = opera;
    }

   /*public Planta getPlanta() {
        return planta;
    }

    public void setPlanta(Planta planta) {
        this.planta = planta;
    }
*/

    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }


    }


    
    

