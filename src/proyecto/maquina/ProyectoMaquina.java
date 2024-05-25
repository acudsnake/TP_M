package proyecto.maquina;

import GUI.*;
import clases.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class ProyectoMaquina {
    public static void main(String[] args) {
        //debemos realizar varios test para ver si los ficheros guardan y cargan bien
        //Fichero.crear_TODOS_TXT();
        Pantalla inicio = new Pantalla();
        inicio.setVisible(true);
        
        /*Planta p=new Planta("Azul", 222);
        Planta p2=new Planta("Rojo", 11);
        ArrayList<Maquina> m= new ArrayList<>();
        ArrayList<Proceso> proc= new ArrayList<>();
        Maquina ma1= new Maquina("Marca1", "MOO0", 473, "Nueva");
        Maquina ma2= new Maquina("Marca2", "MIII1", 777, "Vieja");
        
        m.add(ma1); 
        p.setMaquina(m);
        p.setProceso(proc);
        Fichero.guardar_planta(p);
        
        m.add(ma2);
        p2.setMaquina(m);
        p2.setProceso(proc);
        Fichero.guardar_planta(p2);
        
        */
        
        /*
        ArrayList<Maquina> m= new ArrayList<>();
        ArrayList<Tecnico> t= new ArrayList<>();
        Maquina ma1= new Maquina("Marca1", "MOO0", 473, "Nueva");
        Maquina ma2= new Maquina("Marca2", "MIII1", 777, "Vieja");
        m.add(ma1); m.add(ma2);
        LocalDate fecha_i = LocalDate.of(2003, 2, 11);
        LocalDate fecha_f = LocalDate.of(2024, 2, 11);
        Opera op= new Opera(fecha_i, fecha_f, 1);
        op.setMaquina(m);
        op.setTecnico(t);
        Fichero.guardar_Opera(op);*/
        //Fichero.leerTodaslasPlantas_consola();
        
        
        
    }
    
}
