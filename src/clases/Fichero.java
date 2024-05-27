package clases;
import static clases.Fichero.DATA_SEPARATOR;
import static clases.Fichero.pathCurrent;
import static clases.Fichero.pathPlantas;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Fichero {
    public static final String DATA_SEPARATOR = ",";
    public static final String pathCurrent = System.getProperty("user.dir");
    public static final String pathMaquinas = pathCurrent + File.separator + "src/data/Maquinas.txt";
    public static final String pathOperas = pathCurrent + File.separator + "src/data/Opera.txt";
    public static final String pathPlantas = pathCurrent + File.separator + "src/data/Planta.txt";
    public static final String pathProcesos = pathCurrent + File.separator + "src/data/Procesos.txt";    
    public static final String pathTecnicos = pathCurrent + File.separator + "src/data/Tecnicos.txt";
    public static final String pathPlantasProcesos = pathCurrent + File.separator + "src/data/PlantasProcesos.txt";
    public static final String pathPlantasMaquinas = pathCurrent + File.separator + "src/data/PlantasMaquinas.txt";
    
    public static void crear_TODOS_TXT() {
        File file0 = new File(pathMaquinas);
        File file1 = new File(pathOperas);
        File file2 = new File(pathPlantas);
        File file3 = new File(pathProcesos);
        File file4 = new File(pathTecnicos);
        File file5 = new File(pathPlantasProcesos);
        File file6 = new File(pathPlantasMaquinas);
        try {
            file0.createNewFile();
            file1.createNewFile();
            file2.createNewFile();
            file3.createNewFile();
            file4.createNewFile();
            file5.createNewFile();
        } catch (IOException e) {
            System.err.println("Error al crear el archivo: " + e.getMessage());
        }
    }
   
    public static void Eliminar_ficheros(){
        new File(pathMaquinas).delete();            
        new File(pathOperas).delete();   
        new File(pathPlantas).delete();   
        new File(pathProcesos).delete();   
        new File(pathTecnicos).delete();
        new File(pathPlantasProcesos).delete();
        new File(pathPlantasMaquinas).delete();
    }
    
    public static int obtenerSiguenteCodigo(String filePath) {
        // Esta función calcula el siguiente código (identificador) para un nuevo dato en un fichero
        String linea;
        int max = 0;
        int actual = 0;
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                while ((linea = reader.readLine()) != null) {
                    String[] datos = linea.split(DATA_SEPARATOR);
                    actual = Integer.valueOf(datos[0]);
                    if (actual > max)
                        max = actual;
                }
                return max + 1;
            } catch (IOException e) {
                e.printStackTrace();
            }
        return -1;
    }
    
    //--------------------------------------PLANTAS------------------------------------------//
    public static void guardar_planta(Planta planta){
            int id=Fichero.obtenerSiguenteCodigo(pathPlantas);
            planta.setId(id);
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(pathPlantas, true))) {
                    writer.write(planta.getId() + DATA_SEPARATOR + planta.getColor() + DATA_SEPARATOR + planta.getSuperficie()+ DATA_SEPARATOR + "\n");
            }
            catch (IOException e) {
                System.out.println("Error" + e.getMessage());
            }
        }
   
    public static ArrayList<Planta> leerTodaslasPlantas(){
        ArrayList<Planta> lista_plantas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(pathPlantas))) {
            String linea;
            while ((linea = br.readLine()) != null){
                String[] datos = linea.split(DATA_SEPARATOR);
                Planta planta= new Planta(datos[1],Integer.parseInt(datos[2]));
                planta.setId(Integer.parseInt(datos[0]));
                lista_plantas.add(planta);
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        return lista_plantas;
    }

    public static void eliminarPlanta(Planta p){
        String pathTemp = pathCurrent + File.separator + "src/data/temp.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(pathPlantas));
            BufferedWriter writer = new BufferedWriter(new FileWriter(pathTemp))){
            String linea;
            String[] datos;
            while ((linea = reader.readLine()) != null) {
                datos = linea.split(DATA_SEPARATOR);
                if(!(Integer.parseInt(datos[0])==p.getId())){
                        writer.write(linea);
                        writer.newLine();
                        
                    }
            } 
        } catch (IOException e) {
            e.printStackTrace();
        }
        File originalFile = new File(pathPlantas);
        File temporalFile = new File(pathTemp);
        originalFile.delete();
        temporalFile.renameTo(originalFile);
    }
    
    public static void modificarPlanta(Planta p_antigua, Planta p_nueva){
       String pathTemp = pathCurrent + File.separator + "src/data/temp.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(pathPlantas));
            BufferedWriter writer = new BufferedWriter(new FileWriter(pathTemp))){
            String linea;
            String[] datos;
            String lineaNueva = p_antigua.getId() + DATA_SEPARATOR + p_nueva.getColor() + DATA_SEPARATOR + p_nueva.getSuperficie();
            
            while ((linea = reader.readLine()) != null) {
                datos = linea.split(DATA_SEPARATOR);
                if(Integer.parseInt(datos[0])==p_antigua.getId()){
                        writer.write(lineaNueva);
                        writer.newLine();
                    }
                else{
                    writer.write(linea);
                    writer.newLine();
                }
                    
            } 
        } catch (IOException e) {
            e.printStackTrace();
        }
        File originalFile = new File(pathPlantas);
        File temporalFile = new File(pathTemp);
        originalFile.delete();
        temporalFile.renameTo(originalFile);     
    }
  
//--------------------------------------MAQUINAS--------------------------------------------//

    public static ArrayList<Maquina> leerMaquinas(){
        ArrayList<Maquina> lista_maquinas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(pathMaquinas))) {
            String linea;
            while ((linea = br.readLine()) != null){
                String[] datos = linea.split(DATA_SEPARATOR);
                Maquina maquina= new Maquina(datos[1], datos[2], Integer.parseInt(datos[3]), datos[4]);
                maquina.setID(Integer.parseInt(datos[0]));
                maquina.setPlantaId(Integer.parseInt(datos[5]));
                lista_maquinas.add(maquina);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lista_maquinas;
    }
    
    public static void guardarMaquina(Maquina maquina){
        int id = Fichero.obtenerSiguenteCodigo(pathMaquinas);
        maquina.setID(id);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(pathMaquinas, true))) {
                writer.write(maquina.getID() + DATA_SEPARATOR
                           + maquina.getMarca() + DATA_SEPARATOR
                           + maquina.getModelo() + DATA_SEPARATOR 
                           + maquina.getNumero() + DATA_SEPARATOR
                           + maquina.getEstado() + "\n");
        }
        catch (IOException e) {
            System.out.println("Error" + e.getMessage());
        }
    }
    
    public static void guardarPlantaMaquina(Planta planta, Maquina maquina){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(pathPlantasMaquinas, true))) {
            writer.write(planta.getId() + DATA_SEPARATOR + maquina.getID() + "\n");
        }
        catch (IOException e) {
            System.out.println("Error" + e.getMessage());
        }
    }
    
    public static void eliminarMaquina(Maquina m){
        String pathTemp = pathCurrent + File.separator + "src/data/temp.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(pathMaquinas));
            BufferedWriter writer = new BufferedWriter(new FileWriter(pathTemp))){
            String linea;  
            String[] datos;
            while ((linea = reader.readLine()) != null) {
                datos = linea.split(DATA_SEPARATOR); //maquina
                if(!(Integer.parseInt(datos[0])==m.getID())){
                        writer.write(linea);
                        writer.newLine();
                    }
            } 
        } catch (IOException e) {
            e.printStackTrace();
        }   
        File originalFile = new File(pathMaquinas);
        File temporalFile = new File(pathTemp);
        originalFile.delete();
        temporalFile.renameTo(originalFile);
        
    }


//-----------------------------------PLANTAS_PROCESOS--------------------------------------------//

    public static void guardarPlantasProcesos(ArrayList<Planta> plantas, Proceso proceso){
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(pathPlantasProcesos, true))) {
                for(int i=0; i<plantas.size(); i++){
                    writer.write(plantas.get(i).getId() + DATA_SEPARATOR + proceso.getID() + "\n");
                }
            }
            catch (IOException e) {
                System.out.println("Error" + e.getMessage());
            }
        }
    
    public static void eliminarPlantas_Procesos(Planta p){
        String pathTemp = pathCurrent + File.separator + "src/data/temp.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(pathPlantasProcesos));
            BufferedWriter writer = new BufferedWriter(new FileWriter(pathTemp))){
            String linea;
            String[] datos;
            while ((linea = reader.readLine()) != null) {
                datos = linea.split(DATA_SEPARATOR);
                if(!(Integer.parseInt(datos[0])==p.getId())){
                        writer.write(linea);
                        writer.newLine();
                        
                    }
            } 
        } catch (IOException e) {
            e.printStackTrace();
        }
        File originalFile = new File(pathPlantasProcesos);
        File temporalFile = new File(pathTemp);
        originalFile.delete();
        temporalFile.renameTo(originalFile);
    }

    public static void eliminarPlantas_Procesos(Proceso p){
        String pathTemp = pathCurrent + File.separator + "src/data/temp.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(pathPlantasProcesos));
            BufferedWriter writer = new BufferedWriter(new FileWriter(pathTemp))){
            String linea;
            String[] datos;
            while ((linea = reader.readLine()) != null) {
                datos = linea.split(DATA_SEPARATOR);
                if(!(Integer.parseInt(datos[1])==p.getID())){
                        writer.write(linea);
                        writer.newLine();
                        
                    }
            } 
        } catch (IOException e) {
            e.printStackTrace();
        }
        File originalFile = new File(pathPlantasProcesos);
        File temporalFile = new File(pathTemp);
        originalFile.delete();
        temporalFile.renameTo(originalFile);
    }
    
    public static Boolean verificar_si_proceso_esta_asignado(Proceso p){
            try (BufferedReader br = new BufferedReader(new FileReader(pathPlantasProcesos))) {
                String linea;
                while ((linea = br.readLine()) != null){
                    String[] datos = linea.split(DATA_SEPARATOR);
                    linea= br.readLine();
                    if(Integer.parseInt(datos[1])==p.getID()){
                    return true;
                    }
                        
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return false;
        }
    
    
//--------------------------------------PROCESOS--------------------------------------------//

    public static void guardarProceso(Proceso proceso){
            int id=Fichero.obtenerSiguenteCodigo(pathProcesos);
            proceso.setID(id);
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(pathProcesos, true))) {
                    writer.write(proceso.getID()+ DATA_SEPARATOR + proceso.getNombre() + DATA_SEPARATOR + proceso.getComplejidad() + DATA_SEPARATOR + "\n");
            }
            catch (IOException e) {
                System.out.println("Error" + e.getMessage());
            }
        }
    
    public static ArrayList<Proceso> leerProcesos(){
            ArrayList<Proceso> lista_procesos = new ArrayList<>();
            try (BufferedReader br = new BufferedReader(new FileReader(pathProcesos))) {
                String linea;
                while ((linea = br.readLine()) != null){
                    String[] datos = linea.split(DATA_SEPARATOR);
                    Proceso proceso= new Proceso(datos[1], datos[2]);
                    proceso.setID(Integer.parseInt(datos[0]));
                    lista_procesos.add(proceso);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return lista_procesos;
        }
    
    public static void eliminarProceso(Proceso p){
        String pathTemp = pathCurrent + File.separator + "src/data/temp.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(pathProcesos));
            BufferedWriter writer = new BufferedWriter(new FileWriter(pathTemp))){
            String linea;
            String[] datos;
            while ((linea = reader.readLine()) != null) {
                datos = linea.split(DATA_SEPARATOR);
                if(!(Integer.parseInt(datos[0])==p.getID())){
                        writer.write(linea);
                        writer.newLine();
                    }
            } 
        } catch (IOException e) {
            e.printStackTrace();
        }
        File originalFile = new File(pathProcesos);
        File temporalFile = new File(pathTemp);
        originalFile.delete();
        temporalFile.renameTo(originalFile);
    }
     
    public static void modificarProceso(Proceso p_antigua, Proceso p_nueva){
       String pathTemp = pathCurrent + File.separator + "src/data/temp.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(pathProcesos));
            BufferedWriter writer = new BufferedWriter(new FileWriter(pathTemp))){
            String linea;
            String[] datos;
            String lineaNueva = p_antigua.getID()+ DATA_SEPARATOR + p_nueva.getNombre()+ DATA_SEPARATOR + p_nueva.getComplejidad();
            
            while ((linea = reader.readLine()) != null) {
                datos = linea.split(DATA_SEPARATOR);
                if(Integer.parseInt(datos[0])==p_antigua.getID()){
                        writer.write(lineaNueva);
                        writer.newLine();
                    }
                else{
                    System.out.print("se edito");
                    writer.write(linea);
                    writer.newLine();
                }
                    
            } 
        } catch (IOException e) {
            e.printStackTrace();
        }
        File originalFile = new File(pathProcesos);
        File temporalFile = new File(pathTemp);
        originalFile.delete();
        temporalFile.renameTo(originalFile);     
    } 

}
     
    

