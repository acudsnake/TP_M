package proyecto.maquina;
import GUI.*;
import clases.*;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;

public class Main {
    public static void main(String[] args) {
        //FlatDarculaLaf.setup();
        Fichero.verificarOCrearArchivos();
        FlatLightLaf.setup();
        UIManager.put("Button.arc", 15);
        Pantalla inicio = new Pantalla();
        inicio.setVisible(true);
        
    }
    
}
