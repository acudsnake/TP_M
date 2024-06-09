package proyecto.maquina;

import GUI.*;
import com.formdev.flatlaf.FlatDarculaLaf;
import clases.*;
import com.formdev.flatlaf.FlatLightLaf;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.UIManager;

public class ProyectoMaquina {
    public static void main(String[] args) {
        //FlatDarculaLaf.setup();
        FlatLightLaf.setup();
        UIManager.put("Button.arc", 15);
        Pantalla inicio = new Pantalla();
        inicio.setVisible(true);
        
    }
    
}
