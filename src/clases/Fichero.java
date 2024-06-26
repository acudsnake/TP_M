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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.function.Predicate;

public class Fichero {
    public static final String DATA_SEPARATOR = ",";
    public static final String pathCurrent = System.getProperty("user.dir");
    public static final String pathMaquinas = pathCurrent + File.separator + "src/data/Maquinas.txt";
    public static final String pathOperas = pathCurrent + File.separator + "src/data/Operas.txt";
    public static final String pathPlantas = pathCurrent + File.separator + "src/data/Plantas.txt";
    public static final String pathProcesos = pathCurrent + File.separator + "src/data/Procesos.txt";    
    public static final String pathTecnicos = pathCurrent + File.separator + "src/data/Tecnicos.txt";
    public static final String pathPlantasProcesos = pathCurrent + File.separator + "src/data/PlantasProcesos.txt";
    public static final String pathPlantasMaquinas = pathCurrent + File.separator + "src/data/PlantasMaquinas.txt";
    public static final String pathMaquinasTecnicos = pathCurrent + File.separator + "src/data/MaquinasTecnicos.txt";
    
    //-------------------------------------FICHEROS-----------------------------------------//
    
    public static void crear_TODOS_TXT() {
        File file0 = new File(pathMaquinas);
        File file1 = new File(pathOperas);
        File file2 = new File(pathPlantas);
        File file3 = new File(pathProcesos);
        File file4 = new File(pathTecnicos);
        File file5 = new File(pathPlantasProcesos);
        File file6 = new File(pathPlantasMaquinas);
        File file7 = new File(pathMaquinasTecnicos);
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
        new File(pathMaquinasTecnicos).delete();
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
    
    
    public static void verificarOCrearArchivos() {
        String[] paths = {
            pathMaquinas,
            pathOperas,
            pathPlantas,
            pathProcesos,
            pathTecnicos,
            pathPlantasProcesos,
            pathPlantasMaquinas,
            pathMaquinasTecnicos
        };
        for (String path : paths) {
            File file = new File(path);
            if (!file.exists()) {
                try {
                    // Crear directorio si no existe
                    File parentDir = file.getParentFile();
                    if (!parentDir.exists()) {
                        parentDir.mkdirs();
                    }
                    // Crear archivo
                    if (file.createNewFile()) {
                        System.out.println("Archivo creado: " + path);
                    } else {
                        System.out.println("No se pudo crear el archivo: " + path);
                    }
                } catch (IOException e) {
                    System.err.println("Error al crear el archivo: " + path);
                    e.printStackTrace();
                }
            } else {
                System.out.println("El archivo ya existe: " + path);
            }
        }

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
   
    public static ArrayList<Planta> leerPlantas(){
        ArrayList<Planta> lista_plantas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(pathPlantas))) {
            String linea;
            while ((linea = br.readLine()) != null){
                String[] datos = linea.split(DATA_SEPARATOR);
                Planta planta= new Planta(datos[1],Integer.parseInt(datos[2]));
                planta.setId(Integer.parseInt(datos[0]));
                
                //Busca las maquinas que tiene asignada esa planta
                ArrayList<Maquina> lista_maquinas= new ArrayList();
                lista_maquinas=Fichero.retornarMaquinasdePlanta(planta);
                planta.setMaquina(lista_maquinas);
                
                //Busca los procesos que tiene asignada esa planta
                ArrayList<Proceso> lista_procesos= new ArrayList();
                lista_procesos=Fichero.retornarProcesosdePlanta(planta);
                planta.setProceso(lista_procesos);
                
                
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
  
    public static Planta buscarPlanta(int ID){
        Planta p= new Planta();
        ArrayList<Maquina> maquinas= new ArrayList();
        ArrayList<Proceso> procesos= new ArrayList();
        
        try (BufferedReader br = new BufferedReader(new FileReader(pathPlantas))) {
            String linea;
            while ((linea = br.readLine()) != null){
                String[] datos = linea.split(DATA_SEPARATOR);
                if(Integer.parseInt(datos[0])==ID){
                    p.setColor(datos[1]);
                    p.setSuperficie(Integer.parseInt(datos[2]));
                    p.setId(Integer.parseInt(datos[0]));
                    
                    maquinas=Fichero.retornarMaquinasdePlanta(p);
                    p.setMaquina(maquinas);
                    
                    procesos=Fichero.retornarProcesosdePlanta(p);
                    p.setProceso(procesos);
                    return p;
             }
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    //--------------------------------------MAQUINAS--------------------------------------------//
    
    private static void eliminarLineaEnArchivo(String pathOriginal, Predicate<String> criterio) {
        String pathTemp = pathCurrent + File.separator + "src/data/temp.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(pathOriginal)); 
                BufferedWriter writer = new BufferedWriter(new FileWriter(pathTemp))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                // Mientras no sea la linea que queremos eliminar,
                // copiara todas las lineas al archivo temporal.
                if (!criterio.test(linea)) {
                    writer.write(linea);
                    writer.newLine();
                }
            } 
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Elimina el archivo original y usa el del archivo temporal
        File originalFile = new File(pathOriginal);
        File temporalFile = new File(pathTemp);
        originalFile.delete();
        temporalFile.renameTo(originalFile);
    }
    
    private static void modificarLineaEnArchivo(String pathOriginal, Predicate<String> criterio, String lineaNueva) {
        String pathTemp = pathCurrent + File.separator + "src/data/temp.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(pathOriginal));
            BufferedWriter writer = new BufferedWriter(new FileWriter(pathTemp))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                // Si el criterio coincide con la línea actual, se escribe la línea modificada
                if (criterio.test(linea)) {
                    writer.write(lineaNueva);
                    writer.newLine();
                } else {
                    // Si no coincide, se copia la línea tal como está
                    writer.write(linea);
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Elimina el archivo original y utiliza el archivo temporal
        File originalFile = new File(pathOriginal);
        File temporalFile = new File(pathTemp);
        originalFile.delete();
        temporalFile.renameTo(originalFile);
    }
   
    // TODO: usar Optional para evitar usar NULL
    public static Planta buscarPlantaAsignada(Maquina maquina) {
        try (BufferedReader br = new BufferedReader(new FileReader(pathPlantasMaquinas))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(DATA_SEPARATOR);
                if (Integer.parseInt(datos[1]) == maquina.getID()) {
                    return buscarPlanta(Integer.parseInt(datos[0]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
}
    
    public static ArrayList<Maquina> leerMaquinas() {
        ArrayList<Maquina> maquinas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(pathMaquinas))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(DATA_SEPARATOR);
                Maquina m = new Maquina(datos[1], datos[2], Integer.parseInt(datos[3]), datos[4]);
                m.setID(Integer.parseInt(datos[0]));

                // Buscar la planta asignada a esta maquina
                Planta p = buscarPlantaAsignada(m);
                
                // Si la encontro, cargarla en la maquina.
                if (p != null) {
                    m.setPlanta(p);
                    //m.setPlanta(p.getId());
                }
                
                ArrayList<Tecnico> t= new ArrayList<>();
                t=Fichero.retornarTecnicosAsignados(Integer.parseInt(datos[0]));
                m.setTecnicos(t);
                
                maquinas.add(m);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return maquinas;
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
    
    // Este metodo modifica los campos antiguos por los nuevos en el archivo de Maquinas.txt
    // Tambien modifica el archivo PlantasMaquinas.txt si el usuario quiere
    // asignar la maquina a otra planta.
    // Duda: Una maquina rota se le puede quitar la asignacion de la maquina a la planta?
    public static void modificarMaquina(Maquina antigua, Maquina nueva) {
        // Linea que va a contener la nueva maquina
        // Por obvias razones, la id anterior debemos mantenerla.
        String lineaNueva = antigua.getID() + DATA_SEPARATOR 
                + nueva.getMarca() + DATA_SEPARATOR 
                + nueva.getModelo() + DATA_SEPARATOR
                + nueva.getNumero() + DATA_SEPARATOR
                + nueva.getEstado();
        
        // Codigo para modificar la maquina antigua por la nueva de Maquinas.txt
        Predicate<String> criterio = linea -> {
            String[] datos = linea.split(DATA_SEPARATOR);
            int idMaquina = Integer.parseInt(datos[0]);
            return idMaquina == antigua.getID();
        };
        
        modificarLineaEnArchivo(pathMaquinas, criterio, lineaNueva);
        
        // Verificar por si acaso el usuario no selecciono ninguna planta a asignar.
        if (nueva.getPlanta() == null) {
            throw new IllegalArgumentException("Error: Una maquina no puede existir sin una planta asignada.");
        }
        
        // Codigo para modificar la asociacion de la planta y la maquina
        lineaNueva = nueva.getPlanta().getId() + DATA_SEPARATOR + antigua.getID();
        
        criterio = linea -> {
            String[] datos = linea.split(DATA_SEPARATOR);
            int idMaquina = Integer.parseInt(datos[1]);
            return idMaquina == antigua.getID();
        };
        
        
        modificarLineaEnArchivo(pathPlantasMaquinas, criterio, lineaNueva);
    }
    
    // Eliminar maquina por ID
    // Nota: Si la maquina esta asignada a una planta, esta asociacion sera eliminada
    // TODO: faltaria eliminar la asociacion del tecnico con la maquina por el opera
    // Deberia uasr un Optional para el Planta para evitar chequear por null
    public static void eliminarMaquina(int id) {
        Maquina m = buscarMaquina(id);
        Planta p = m.getPlanta();
        
        // Codigo para eliminar la maquina de Maquinas.txt
        Predicate<String> criterio = linea -> {
            String[] datos = linea.split(DATA_SEPARATOR);
            int idMaquina = Integer.parseInt(datos[0]);
            return idMaquina == m.getID();
        };
        
        eliminarLineaEnArchivo(pathMaquinas, criterio);
        
        // Si hay una planta asignada a esta maquina, la eliminara.
        // De lo contrario, no pasara nada.
        eliminarAsociacionPlantaMaquina(m);
        // TODO: eliminarAsociacionMaquinaTecnico();
        
    }
    
    public static void eliminarMaquina(Maquina m) {
        eliminarMaquina(m.getID());
    }
    
    // Este metodo busca en el archivo PlantasMaquinas.txt la linea que contenga
    // la asociacion de la maquina con la planta y elimina la linea.
    public static void eliminarAsociacionPlantaMaquina(Maquina m) {
        Predicate<String> criterio = linea -> {
            String[] datos = linea.split(DATA_SEPARATOR);
            int idMaquina = Integer.parseInt(datos[1]);
            return idMaquina == m.getID();
        };
        
        eliminarLineaEnArchivo(pathPlantasMaquinas, criterio);
    }    

    public static Maquina buscarMaquina(int ID){
        Maquina m= new Maquina();
        try (BufferedReader br = new BufferedReader(new FileReader(pathMaquinas))) {
            String linea;
            while ((linea = br.readLine()) != null){
                String[] datos = linea.split(DATA_SEPARATOR);
                if(Integer.parseInt(datos[0])==ID){
                    m= new Maquina(datos[1], datos[2], Integer.parseInt(datos[3]), datos[4]);
                    m.setID(ID);
                    //ArrayList<Tecnico> tecnicos= new ArrayList();
                    
                    //m.setPlanta();
                    return m;
             }
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.print("error");
        return m;
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
                    
                    //Buscar las Plantas que tienen asignadas este proceso
                    ArrayList<Planta> lista_plantas= new ArrayList<>();
                    lista_plantas= Fichero.retornarPlantasdeProceso(proceso);
                    proceso.setPlanta(lista_plantas);
                    
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

    public static Proceso buscarProceso(int ID){
        try (BufferedReader br = new BufferedReader(new FileReader(pathProcesos))) {
            String linea;
            while ((linea = br.readLine()) != null){
                String[] datos = linea.split(DATA_SEPARATOR);
                if(Integer.parseInt(datos[0])==ID){
                    Proceso proceso= new Proceso(datos[1], datos[2]);
                    proceso.setID(Integer.parseInt(datos[0]));
                    return proceso;
             }
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    //-------------------------------------TECNICOS-----------------------------------------//
    
    public static ArrayList<Tecnico> leerTecnicos(){
        ArrayList<Tecnico> lista_tecnicos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(pathTecnicos))) {
            String linea;
            while ((linea = br.readLine()) != null){
                String[] datos = linea.split(DATA_SEPARATOR);
                int dia = Integer.parseInt(datos[5]);
                int mes = Integer.parseInt(datos[6]);
                int año = Integer.parseInt(datos[7]);
                LocalDate fecha = LocalDate.of(año, mes, dia);

                Tecnico tecnico= new Tecnico(datos[1], datos[2], Integer.parseInt(datos[3]), datos[4], fecha);
                tecnico.setID(Integer.parseInt(datos[0]));
                
                //Consultar si tecnico debe tener un arraylist de maquinas
                
                lista_tecnicos.add(tecnico);
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lista_tecnicos;
    }
    
    public static void guardarTecnico(Tecnico tecnico){
            int id=Fichero.obtenerSiguenteCodigo(pathTecnicos);
            tecnico.setID(id);
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(pathTecnicos, true))) {
                    writer.write(tecnico.getID()+ DATA_SEPARATOR + 
                            tecnico.getNombre() + DATA_SEPARATOR + 
                            tecnico.getApellido() + DATA_SEPARATOR + 
                            tecnico.getDNI()+ DATA_SEPARATOR + 
                            tecnico.getContacto() + DATA_SEPARATOR + 
                            tecnico.getFechaNacimiento().getDayOfMonth() + DATA_SEPARATOR +  
                            tecnico.getFechaNacimiento().getMonthValue() + DATA_SEPARATOR +  
                            tecnico.getFechaNacimiento().getYear() + DATA_SEPARATOR + 
                            "\n");
            }
            catch (IOException e) {
                System.out.println("Error" + e.getMessage());
            }
        }
    
    public static void eliminarTecnico(Tecnico tecnico){
        String pathTemp = pathCurrent + File.separator + "src/data/temp.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(pathTecnicos));
            BufferedWriter writer = new BufferedWriter(new FileWriter(pathTemp))){
            String linea;
            String[] datos;
            while ((linea = reader.readLine()) != null) {
                datos = linea.split(DATA_SEPARATOR);
                if(!(Integer.parseInt(datos[0])==tecnico.getID())){
                        writer.write(linea);
                        writer.newLine();
                    }
            } 
        } catch (IOException e) {
            e.printStackTrace();
        }
        File originalFile = new File(pathTecnicos);
        File temporalFile = new File(pathTemp);
        originalFile.delete();
        temporalFile.renameTo(originalFile);
    }
     
    public static void modificarTecnico(Tecnico t_antigua, Tecnico t_nueva){
       String pathTemp = pathCurrent + File.separator + "src/data/temp.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(pathTecnicos));
            BufferedWriter writer = new BufferedWriter(new FileWriter(pathTemp))){
            String linea;
            String[] datos;
            String lineaNueva = t_antigua.getID()+ DATA_SEPARATOR + t_nueva.getNombre() + DATA_SEPARATOR + 
                            t_nueva.getApellido() + DATA_SEPARATOR + 
                            t_nueva.getDNI()+ DATA_SEPARATOR + 
                            t_nueva.getContacto() + DATA_SEPARATOR + 
                            t_nueva.getFechaNacimiento().getDayOfMonth() + DATA_SEPARATOR +  
                            t_nueva.getFechaNacimiento().getMonthValue() + DATA_SEPARATOR +  
                            t_nueva.getFechaNacimiento().getYear();
            
            while ((linea = reader.readLine()) != null) {
                datos = linea.split(DATA_SEPARATOR);
                if(Integer.parseInt(datos[0])==t_antigua.getID()){
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
        File originalFile = new File(pathTecnicos);
        File temporalFile = new File(pathTemp);
        originalFile.delete();
        temporalFile.renameTo(originalFile);     
    } 
    
    public static Tecnico buscarTecnico(int ID){
        Tecnico tecnico= new Tecnico();
        try (BufferedReader br = new BufferedReader(new FileReader(pathTecnicos))) {
            String linea;
            while ((linea = br.readLine()) != null){
                String[] datos = linea.split(DATA_SEPARATOR);
                if(Integer.parseInt(datos[0])==ID){
                    int dia = Integer.parseInt(datos[5]);
                    int mes = Integer.parseInt(datos[6]);
                    int año = Integer.parseInt(datos[7]);
                    LocalDate fecha = LocalDate.of(año, mes, dia);
                    tecnico.setNombre(datos[1]);
                    tecnico.setApellido(datos[2]);
                    tecnico.setDNI(Integer.parseInt(datos[3]));
                    tecnico.setContacto(datos[4]);
                    tecnico.setFechaNacimiento(fecha);
                    tecnico.setID(Integer.parseInt(datos[0]));
                    
                    ArrayList<Maquina> maquinas= new ArrayList();
                    maquinas= Fichero.retornarMaquinasAsignadas(tecnico);
                    
                    tecnico.setMaquinas(maquinas);
                    return tecnico;
             }
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        return tecnico;
    }
    //-------------------------------------OPERAS------------------------------------------//
    //fix
    public static void guardarOpera(Opera opera){
            int id=Fichero.obtenerSiguenteCodigo(pathOperas);
            opera.setID(id);
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(pathOperas, true))) {     
                    writer.write(
                            opera.getID() + DATA_SEPARATOR + //0
                            opera.getMaquina().getID()+ DATA_SEPARATOR + //1     
                            opera.getTecnico().getID()+ DATA_SEPARATOR + //2
                            opera.getTurno() + DATA_SEPARATOR + //3
                            opera.getFechaInicio().getDayOfMonth() + DATA_SEPARATOR +  //4
                            opera.getFechaInicio().getMonthValue() + DATA_SEPARATOR + //5
                            opera.getFechaInicio().getYear()+ DATA_SEPARATOR +  //6
                            "\n");
            }
            catch (IOException e) {
                System.out.println("Error" + e.getMessage());
            }
        }
    //fix
    public static Opera buscarOpera(int ID){
        try (BufferedReader br = new BufferedReader(new FileReader(pathOperas))) {
            String linea;
            while ((linea = br.readLine()) != null){
                String[] datos = linea.split(DATA_SEPARATOR);
                if(Integer.parseInt(datos[0])==ID){
                    LocalDate fecha = LocalDate.of(Integer.parseInt(datos[6]), Integer.parseInt(datos[5]), Integer.parseInt(datos[4]));
                    Maquina m= new Maquina(); 
                    m=Fichero.buscarMaquina(Integer.parseInt(datos[1]));
                    Tecnico t= new Tecnico();
                    t=Fichero.buscarTecnico(Integer.parseInt(datos[2]));
                    Opera opera= new Opera(Integer.parseInt(datos[3]), fecha,m,t);
                    opera.setID(Integer.parseInt(datos[0]));
                    return opera;
             }
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static void eliminarOpera(Opera opera){
        String pathTemp = pathCurrent + File.separator + "src/data/temp.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(pathOperas));
            BufferedWriter writer = new BufferedWriter(new FileWriter(pathTemp))){
            String linea;
            String[] datos;
            while ((linea = reader.readLine()) != null) {
                datos = linea.split(DATA_SEPARATOR);
                if(!(Integer.parseInt(datos[0])==opera.getID())){
                        writer.write(linea);
                        writer.newLine();
                    }
            } 
        } catch (IOException e) {
            e.printStackTrace();
        }
        File originalFile = new File(pathOperas);
        File temporalFile = new File(pathTemp);
        originalFile.delete();
        temporalFile.renameTo(originalFile);
    }
    //fix
    public static void FinalizarOpera(Opera opera){
        String pathTemp = pathCurrent + File.separator + "src/data/temp.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(pathOperas));
            BufferedWriter writer = new BufferedWriter(new FileWriter(pathTemp))){
            String linea;
            String[] datos;
            LocalDate fechaActual = LocalDate.now();
            int dia = fechaActual.getDayOfMonth();
            int mes = fechaActual.getMonthValue();
            int año = fechaActual.getYear();
            
            String lineaNueva=
                    opera.getID()+DATA_SEPARATOR + 
                    opera.getMaquina().getID()+DATA_SEPARATOR + 
                    opera.getTecnico().getID()+DATA_SEPARATOR + 
                    opera.getTurno() + DATA_SEPARATOR +     
                    opera.getFechaInicio().getDayOfMonth() + DATA_SEPARATOR +         
                    opera.getFechaInicio().getMonthValue() + DATA_SEPARATOR +               
                    opera.getFechaInicio().getYear()+ DATA_SEPARATOR +        
                    dia +DATA_SEPARATOR + mes +DATA_SEPARATOR + año;
            while ((linea = reader.readLine()) != null) {
                datos = linea.split(DATA_SEPARATOR);
                if(!(Integer.parseInt(datos[0])==opera.getID())){
                        writer.write(linea);
                        writer.newLine();
                    }
                else{
                    writer.write(lineaNueva);
                    writer.newLine();
                }
                    
            } 
        } catch (IOException e) {
            e.printStackTrace();
        }
        File originalFile = new File(pathOperas);
        File temporalFile = new File(pathTemp);
        originalFile.delete();
        temporalFile.renameTo(originalFile);
    }
    
    public static Opera buscarOpera(int ID_t, int ID_m){
        Opera opera= new Opera();
        try (BufferedReader br = new BufferedReader(new FileReader(pathOperas))) {
            String linea;
            while ((linea = br.readLine()) != null){
                String[] datos = linea.split(DATA_SEPARATOR);
                if(datos.length==7 && Integer.parseInt(datos[1])==ID_m && Integer.parseInt(datos[2])==ID_t){
                    LocalDate fecha = LocalDate.of(Integer.parseInt(datos[6]), Integer.parseInt(datos[5]), Integer.parseInt(datos[4]));
                    Maquina m= new Maquina(); 
                    m=Fichero.buscarMaquina(Integer.parseInt(datos[1]));
                    Tecnico t= new Tecnico();
                    t=Fichero.buscarTecnico(Integer.parseInt(datos[2]));
                    opera.setTurno(Integer.parseInt(datos[3]));
                    opera.setFechaInicio(fecha);
                    opera.setMaquina(m);
                    opera.setTecnico(t);
                    opera.setID(Integer.parseInt(datos[0]));
                    return opera;
             }
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        return opera;
    }
    //fix
    public static ArrayList<Maquina> retornarMaquinasNOAsignadas(Tecnico tecnico){
         ArrayList<Maquina> lista_m= Fichero.leerMaquinas();
         ArrayList<Maquina> lista_m_ya_asignadas= new ArrayList<>();
         try (BufferedReader br = new BufferedReader(new FileReader(pathOperas))) {
             String linea;
             while ((linea = br.readLine()) != null){
                 String[] datos = linea.split(DATA_SEPARATOR);
                    if(datos.length==7  && Integer.parseInt(datos[2])==tecnico.getID()){
                        Maquina maquina= new Maquina();
                        maquina=Fichero.buscarMaquina(Integer.parseInt(datos[1]));
                        lista_m_ya_asignadas.add(maquina);
                    }
                 
                  
             }
         } 
         catch (IOException e) {
             e.printStackTrace();
         }
        ArrayList<Maquina> lista_final = new ArrayList<>();
        /*for(int i=0; i<lista_m_ya_asignadas.size(); i++){
            Boolean sel=false;
            for(int i2=0; i2<lista_m.size(); i2++){
                 if(lista_m.get(i2).getID()==lista_m_ya_asignadas.get(i).getID())
                    sel=true;
            }
            System.out.print(sel + "\n");
            if(sel==false)
                lista_final.add(lista_m_ya_asignadas.get(i)); System.out.print(" Se guardo \n");
         }*/
         
         
       
        for (Maquina maquina : lista_m) {
            boolean isAssigned = false;
            for (Maquina assignedMaquina : lista_m_ya_asignadas) {
                if (maquina.getID() == assignedMaquina.getID()) {
                    isAssigned = true;
                    break;
                }
            }
            if (!isAssigned) {
                lista_final.add(maquina);
            }
        }
         return lista_final;
     }
    //fix
    public static ArrayList<Maquina> retornarMaquinasAsignadas(Tecnico tecnico){
         ArrayList<Maquina> lista= new ArrayList<>();
         System.out.print(tecnico.getID() + "\n");
         try (BufferedReader br = new BufferedReader(new FileReader(pathOperas))) {
             String linea;
             while ((linea = br.readLine()) != null){
                 String[] datos = linea.split(DATA_SEPARATOR);
                 if(datos.length==7 && Integer.parseInt(datos[2])==tecnico.getID()){
                     Maquina maquina= new Maquina();
                     maquina=Fichero.buscarMaquina(Integer.parseInt(datos[1]));
                     lista.add(maquina);
                 }
             }
         } 
         catch (IOException e) {
             e.printStackTrace();
         }
         return lista;
     }
    
    public static Boolean verificar_si_maquina_esta_asignado(Maquina t){
            try (BufferedReader br = new BufferedReader(new FileReader(pathOperas))) {
                String linea;
                while ((linea = br.readLine()) != null){
                    String[] datos = linea.split(DATA_SEPARATOR);
                    linea= br.readLine();
                    if(datos.length==7 && Integer.parseInt(datos[1])==t.getID()){
                        return true;
                    }
                        
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return false;
        }
    
    public static ArrayList<Tecnico> retornarTecnicosAsignados(int id){
         ArrayList<Tecnico> lista= new ArrayList<>();
         try (BufferedReader br = new BufferedReader(new FileReader(pathOperas))) {
             String linea;
             while ((linea = br.readLine()) != null){
                 String[] datos = linea.split(DATA_SEPARATOR);
                 if(datos.length==7 && Integer.parseInt(datos[1])==id){
                    Tecnico tecnico= new Tecnico();
                    tecnico= Fichero.buscarTecnico(Integer.parseInt(datos[2]));
                    lista.add(tecnico);
                 }
                 
             }
         } 
         catch (IOException e) {
             e.printStackTrace();
         }
         return lista;
     }
    
    public static ArrayList<Tecnico> retornarTecnicosAsignados(){
         ArrayList<Tecnico> lista= new ArrayList<>();
         ArrayList<Tecnico> lista_2= new ArrayList<>();
         try (BufferedReader br = new BufferedReader(new FileReader(pathOperas))) {
             String linea;
             while ((linea = br.readLine()) != null){
                 String[] datos = linea.split(DATA_SEPARATOR);
                 if(datos.length==7){
                    Tecnico tecnico= new Tecnico();
                    tecnico= Fichero.buscarTecnico(Integer.parseInt(datos[2]));
                    Boolean sel=false;
                    for(int i=0; i<lista_2.size(); i++){
                        if (lista_2.get(i).getID()==tecnico.getID())
                            sel=true;
                    }
                    if(sel==false){
                        System.out.print("entro\n");
                        lista.add(tecnico);
                        lista_2.add(tecnico);
                    }
                    
                 }
                 
             }
         } 
         catch (IOException e) {
             e.printStackTrace();
         }
         return lista;
     }

    //
    public static Boolean verificar_si_tecnico_esta_asignado(Tecnico t){
            try (BufferedReader br = new BufferedReader(new FileReader(pathOperas))) {
                String linea;
                while ((linea = br.readLine()) != null){
                    String[] datos = linea.split(DATA_SEPARATOR);
                    linea= br.readLine();
                    if(datos.length==7 && Integer.parseInt(datos[2])==t.getID()){
                        return true;
                    }
                        
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return false;
        }
    //
     public static ArrayList<Tecnico> retornarTecnicosNOAsignados(){
         ArrayList<Tecnico> lista_m= Fichero.leerTecnicos();
         ArrayList<Tecnico> lista_m_ya_asignadas= new ArrayList<>();
         
         try (BufferedReader br = new BufferedReader(new FileReader(pathOperas))) {
             String linea;
             while ((linea = br.readLine()) != null){
                 String[] datos = linea.split(DATA_SEPARATOR);
                 Tecnico tecnico= new Tecnico();
                 if(datos.length==7){
                    tecnico=Fichero.buscarTecnico(Integer.parseInt(datos[2]));
                    lista_m_ya_asignadas.add(tecnico);
                    System.out.print("entro tecnico\n");
                 }
                 
             }
         } 
         catch (IOException e) {
             e.printStackTrace();
         }
         ArrayList<Tecnico> lista_final = new ArrayList<>();
        for (Tecnico tecnico : lista_m) {
            boolean isAssigned = false;
            for (Tecnico assignedMaquina : lista_m_ya_asignadas) {
                if (tecnico.getID() == assignedMaquina.getID()) {
                    isAssigned = true;
                    break;
                }
            }
            if (!isAssigned) {
                lista_final.add(tecnico);
            }
        }
         return lista_final;
     }
    
    
    //-----------------------------------PLANTAS_MAQUINAS--------------------------------------------//
    
    public static void guardarPlantaMaquina(Planta planta, Maquina maquina){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(pathPlantasMaquinas, true))) {
            writer.write(planta.getId() + DATA_SEPARATOR + maquina.getID() + "\n");
        }
        catch (IOException e) {
            System.out.println("Error" + e.getMessage());
        }
    }
    
    public static ArrayList<Maquina> retornarMaquinasdePlanta(Planta planta){
        ArrayList<Maquina> lista_maquinas= new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(pathPlantasMaquinas))) {
            String linea;
            while ((linea = br.readLine()) != null){
                String[] datos = linea.split(DATA_SEPARATOR);
                if(Integer.parseInt(datos[0])==planta.getId()){
                    Maquina maquina= new Maquina();
                    maquina=Fichero.buscarMaquina(Integer.parseInt(datos[1]));
                    lista_maquinas.add(maquina);
                }
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        return lista_maquinas;
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
        Boolean sel=false;
            try (BufferedReader br = new BufferedReader(new FileReader(pathPlantasProcesos))) {
                String linea;
                while ((linea = br.readLine()) != null){
                    String[] datos = linea.split(DATA_SEPARATOR);
                    linea= br.readLine();
                    if(Integer.parseInt(datos[1])==p.getID()){
                        sel=true; 
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return sel;
        }
    
    public static ArrayList<Proceso> retornarProcesosdePlanta(Planta planta){
        ArrayList<Proceso> lista_procesos= new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(pathPlantasProcesos))) {
            String linea;
            while ((linea = br.readLine()) != null){
                String[] datos = linea.split(DATA_SEPARATOR);
                if(Integer.parseInt(datos[0])==planta.getId()){
                    Proceso proceso= new Proceso();
                    proceso=Fichero.buscarProceso(Integer.parseInt(datos[1]));
                    lista_procesos.add(proceso);
                }
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        return lista_procesos;
    }
    
    public static ArrayList<Planta> retornarPlantasdeProceso(Proceso proceso){
        ArrayList<Planta> lista_plantas= new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(pathPlantasProcesos))) {
            String linea;
            while ((linea = br.readLine()) != null){
                String[] datos = linea.split(DATA_SEPARATOR);
                if(Integer.parseInt(datos[1])==proceso.getID()){
                    Planta planta = new Planta();
                    planta=Fichero.buscarPlanta(Integer.parseInt(datos[0]));
                    lista_plantas.add(planta);
                }
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        return lista_plantas;
    }
    
}
     
    

/*
-correccion de operas
-controles en los gui
-arreglar el selccionar uno de editarmaquina-+
*/