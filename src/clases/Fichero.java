package clases;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
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
    
    
    public static void crear_TODOS_TXT() {
        File file0 = new File(pathMaquinas);
        File file1 = new File(pathOperas);
        File file2 = new File(pathPlantas);
        File file3 = new File(pathProcesos);
        File file4 = new File(pathTecnicos);
        try {
            file0.createNewFile();
            file1.createNewFile();
            file2.createNewFile();
            file3.createNewFile();
            file4.createNewFile();
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
    }
    
    public static void guardar_planta(Planta planta){
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(pathPlantas, true))) {
                    writer.write(planta.getColor() + DATA_SEPARATOR + planta.getSuperficie()+ DATA_SEPARATOR + "\n");
                    if(!planta.getMaquina().isEmpty()){
                        for (Maquina maquina : planta.getMaquina()) {
                            writer.write(maquina.getMarca() + DATA_SEPARATOR + maquina.getModelo() + DATA_SEPARATOR + maquina.getNumero() + DATA_SEPARATOR + maquina.getEstado() + DATA_SEPARATOR);
                        }
                        writer.write("\n");
                    }
                    else
                        writer.write("-" + "\n");

                    if(!planta.getProceso().isEmpty()){
                        for (Proceso proceso : planta.getProceso()) {
                            writer.write(proceso.getNombre()+ DATA_SEPARATOR + proceso.getComplejidad()+ DATA_SEPARATOR);
                        }
                        writer.write("\n");
                    }
                    else
                        writer.write("-" + "\n");
            }
            catch (IOException e) {
                System.out.println("Error" + e.getMessage());
            }
        }

    public static void guardar_maquina(Maquina maquina){
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(pathMaquinas, true))) {
                    writer.write(maquina.getMarca()+ DATA_SEPARATOR + maquina.getModelo()+ DATA_SEPARATOR + maquina.getNumero() + DATA_SEPARATOR + maquina.getEstado()+ DATA_SEPARATOR +"\n");
                    writer.write(maquina.getPlanta().getColor() + DATA_SEPARATOR + maquina.getPlanta().getSuperficie() +DATA_SEPARATOR +"\n");
                    writer.write(DATA_SEPARATOR +"\n");
            }
            catch (IOException e) {
                System.out.println("Error" + e.getMessage());
            }
        }    
    
    public static void guardar_proceso(Proceso proceso){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(pathProcesos, true))) {
                writer.write(proceso.getNombre() + DATA_SEPARATOR + proceso.getComplejidad() + DATA_SEPARATOR + "\n");
                if(!proceso.getPlanta().isEmpty()){
                    for (Planta planta : proceso.getPlanta()) {
                        writer.write(planta.getColor() + DATA_SEPARATOR + planta.getSuperficie() + DATA_SEPARATOR);
                    }
                    writer.write("\n");
                }
                else
                    writer.write("-" + "\n");
            }
        catch (IOException e) {
            System.out.println("Error" + e.getMessage());
        }
    }
    
    public static void guardar_tecnico(Tecnico tecnico){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(pathTecnicos, true))) {
                writer.write(tecnico.getNombre() + DATA_SEPARATOR + tecnico.getApellido() + DATA_SEPARATOR + tecnico.getFechaNacimiento() + DATA_SEPARATOR + tecnico.getDNI() + DATA_SEPARATOR + tecnico.getContacto() + DATA_SEPARATOR + "\n");
                //Guardar los opera
        }
        catch (IOException e) {
            System.out.println("Error" + e.getMessage());
        }
    }

    public static void guardar_Opera(Opera opera){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(pathOperas, true))) {
                writer.write(
                        opera.getFechaInicio().getDayOfMonth() + DATA_SEPARATOR +
                        opera.getFechaInicio().getMonthValue() + DATA_SEPARATOR +
                        opera.getFechaInicio().getYear()+ DATA_SEPARATOR +
                        
                        opera.getFechaFinal().getDayOfMonth() + DATA_SEPARATOR +
                        opera.getFechaFinal().getMonthValue() + DATA_SEPARATOR +
                        opera.getFechaFinal().getYear()+ DATA_SEPARATOR +
                        
                                opera.getTurno() + DATA_SEPARATOR +
                        "\n");
                
                if(!opera.getMaquina().isEmpty()){
                    for (Maquina maquina : opera.getMaquina()) {
                                writer.write(maquina.getMarca() + DATA_SEPARATOR + maquina.getModelo() + DATA_SEPARATOR + maquina.getNumero() + DATA_SEPARATOR + maquina.getEstado() + DATA_SEPARATOR);
                            }
                    writer.write("\n");
                }
                else
                    writer.write("-" + "\n");
                   
                if(!opera.getTecnico().isEmpty()){
                    for (Tecnico tecnico : opera.getTecnico()) {
                                writer.write(tecnico.getNombre() + DATA_SEPARATOR + tecnico.getApellido() + DATA_SEPARATOR + tecnico.getNombre() + DATA_SEPARATOR + tecnico.getDNI() + DATA_SEPARATOR + tecnico.getContacto() + DATA_SEPARATOR + 
                                        tecnico.getFechaNacimiento().getDayOfMonth() + DATA_SEPARATOR +
                                        tecnico.getFechaNacimiento().getMonthValue() + DATA_SEPARATOR +
                                        tecnico.getFechaNacimiento().getYear()+ DATA_SEPARATOR
                                );
                            }
                    writer.write("\n");
                }
                else
                    writer.write("-" + "\n");
                    
            }
        catch (IOException e) {
            System.out.println("Error" + e.getMessage());
        }
    }
    
    public static ArrayList<Planta> leerTodaslasPlantas(){
        ArrayList<Planta> lista_plantas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(pathPlantas))) {
            String linea;
            ArrayList<Maquina> lista_maquinas = new ArrayList<>();
            ArrayList<Proceso> lista_procesos = new ArrayList<>();
            Proceso proceso = new Proceso();
            Maquina maquina = new Maquina();
            while ((linea = br.readLine()) != null){
                String[] datos = linea.split(DATA_SEPARATOR);
                linea= br.readLine();
                String[] maquinas = linea.split(DATA_SEPARATOR);
                if(!maquinas[0].equals("-")){
                    for (int i=0; i < maquinas.length; i=i+4){
                        maquina.setMarca(maquinas[i]);
                        maquina.setModelo(maquinas[i+1]);
                        maquina.setNumero(Integer.parseInt(maquinas[i+2]));
                        maquina.setEstado(maquinas[i+3]);
                        lista_maquinas.add(maquina);
                    }
                }
                linea= br.readLine();
                String[] procesos = linea.split(DATA_SEPARATOR);
                if(!"-".equals(procesos[0])){
                    for (int i=0; i < procesos.length; i=i+2){
                        proceso.setNombre(procesos[0]);
                        proceso.setComplejidad(procesos[1]);
                        lista_procesos.add(proceso);
                    }
                } 
                Planta planta= new Planta(datos[0],Integer.parseInt(datos[1]));
                planta.setMaquina(lista_maquinas);
                planta.setProceso(lista_procesos);
                lista_plantas.add(planta);
                lista_maquinas.clear();
                lista_procesos.clear();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lista_plantas;
    }
    
    public static ArrayList<Maquina> leerTodaslasMaquinas(){
        ArrayList<Maquina> lista_maquinas = new ArrayList<>();
        Maquina maquina= new Maquina();
        try (BufferedReader br = new BufferedReader(new FileReader(pathMaquinas))) {
            String linea;
            while ((linea = br.readLine()) != null){
                String[] datos = linea.split(DATA_SEPARATOR);
                maquina.setMarca(datos[0]);
                maquina.setModelo(datos[1]);
                maquina.setNumero(Integer.parseInt(datos[2]));
                maquina.setEstado(datos[3]);
                lista_maquinas.add(maquina);
                linea= br.readLine();
                linea= br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lista_maquinas;
    }
    
    public static ArrayList<Proceso> leerTodaslosProcesos(){
        ArrayList<Proceso> lista_procesos = new ArrayList<>();
        Proceso proceso= new Proceso();
        try (BufferedReader br = new BufferedReader(new FileReader(pathProcesos))) {
            String linea;
            while ((linea = br.readLine()) != null){
                String[] datos = linea.split(DATA_SEPARATOR);
                proceso.setNombre(datos[0]);
                proceso.setComplejidad(datos[1]);
                lista_procesos.add(proceso);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lista_procesos;
    }
    
    public static Planta buscar_planta(Planta planta){
        String linea;
        Planta p = new Planta();
        ArrayList<Maquina> lista_maquinas = new ArrayList<>();
        ArrayList<Proceso> lista_procesos = new ArrayList<>();
        Proceso proceso = new Proceso();
        Maquina maquina = new Maquina();
        
        try (BufferedReader br = new BufferedReader(new FileReader(pathPlantas))) {
           while((linea=br.readLine()) !=null){
               String[] datos = linea.split(DATA_SEPARATOR);
               linea= br.readLine();
               String[] maquinas = linea.split(DATA_SEPARATOR);
               linea= br.readLine();
               String[] procesos = linea.split(DATA_SEPARATOR);
               if(datos[0].equals(planta.getColor()) && Integer.parseInt(datos[1])==planta.getSuperficie()){
                   p.setColor(datos[0]);
                   p.setSuperficie(Integer.parseInt(datos[1]));
                   
                   if(!maquinas[0].equals("-")){
                        for (int i=0; i < maquinas.length; i=i+4){
                            maquina.setMarca(maquinas[i]);
                            maquina.setModelo(maquinas[i+1]);
                            maquina.setNumero(Integer.parseInt(maquinas[i+2]));
                            maquina.setEstado(maquinas[i+3]);
                            lista_maquinas.add(maquina);
                        }}
                    if(!"-".equals(procesos[0])){
                    for (int i=0; i < procesos.length; i=i+2){
                        proceso.setNombre(procesos[0]);
                        proceso.setComplejidad(procesos[1]);
                        lista_procesos.add(proceso);
                    }
                    } 
                planta.setMaquina(lista_maquinas);
                planta.setProceso(lista_procesos);
                return p;
               }
           }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    
   /* public static void leerTodaslasMaquinas2(){
        try (BufferedReader br = new BufferedReader(new FileReader(pathMaquinas))) {
            String linea;
            while ((linea = br.readLine()) != null){
                String[] datos = linea.split(DATA_SEPARATOR);
                System.out.println(
                "Marca: " + datos[0]+ "\n" +
                "Modelo: " + datos[1]+ "\n" +     
                "Numero: " + datos[2]+ "\n" + 
                "Estado: " + datos[3]+ "\n" +    
                        "\n");
                linea= br.readLine();
                linea= br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
    
//-----------------------------------------------------TESTEO-------------------------------------------------------------//
    public static void leerTodaslasPlantas_consola(){
        try (BufferedReader br = new BufferedReader(new FileReader(pathPlantas))) {
            String linea;
            ArrayList<Maquina> lista_maquinas = new ArrayList<>();
            ArrayList<Proceso> lista_procesos = new ArrayList<>();
            int n=1;
            Proceso proceso = new Proceso();
            Maquina maquina = new Maquina();
            while ((linea = br.readLine()) != null){
                String[] datos = linea.split(DATA_SEPARATOR);
                linea= br.readLine();
                String[] maquinas = linea.split(DATA_SEPARATOR);
                if(!maquinas[0].equals("-")){
                    //System.out.println(maquinas[0] + maquinas[1]);
                    for (int i=0; i < maquinas.length; i=i+4){
                        maquina.setMarca(maquinas[i]);
                        maquina.setModelo(maquinas[i+1]);
                        maquina.setNumero(Integer.parseInt(maquinas[i+2]));
                        maquina.setEstado(maquinas[i+3]);
                        lista_maquinas.add(maquina);
                    }
                }
                linea= br.readLine();
                String[] procesos = linea.split(DATA_SEPARATOR);
                if(!"-".equals(procesos[0])){
                    for (int i=0; i < procesos.length; i=i+2){
                        proceso.setNombre(procesos[0]);
                        proceso.setComplejidad(procesos[1]);
                        lista_procesos.add(proceso);
                    }
                } 

                Planta planta= new Planta(datos[0],Integer.parseInt(datos[1]));
                planta.setMaquina(lista_maquinas);
                planta.setProceso(lista_procesos);
                if(!lista_procesos.isEmpty() && !lista_maquinas.isEmpty()){
                    System.out.println("Planta: " + n +"\n" +"Color: "+ planta.getColor() +"\n" +"Superficie: "+ planta.getSuperficie() + "\nMaquinas: \nSi\n" + "Procesos: \nSi\n\n");
                }
                else{
                    if(!lista_procesos.isEmpty()){
                        System.out.println("Planta: " + n +"\n" +"Color: "+ planta.getColor() +"\n" +"Superficie: "+ planta.getSuperficie() + "\nMaquinas: \nNo\n" + "Procesos: \nSi\n\n");

                    }
                    if(!lista_maquinas.isEmpty()){
                        System.out.println("Planta: " + n +"\n" +"Color: "+ planta.getColor() +"\n" +"Superficie: "+ planta.getSuperficie() + "\nMaquinas: \nSi\n" + "Procesos: \nNo\n\n");

                    }
                }
                if(lista_procesos.isEmpty() && lista_maquinas.isEmpty()){
                    System.out.println("Planta: " + n +"\n" +"Color: "+ planta.getColor() +"\n" +"Superficie: "+ planta.getSuperficie() + "\nMaquinas: \nNo\n" + "Procesos: \nNo\n\n");
                }
                n++;
                lista_maquinas.clear();
                lista_procesos.clear();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static ArrayList<Tecnico> leerTecnicos(){
        ArrayList<Tecnico> tecnicos = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(pathTecnicos))) {
            String linea;
            while ((linea = br.readLine()) != null){
                String[] datos = linea.split(DATA_SEPARATOR);
                
                final int NUM_ATRIBUTOS_TECNICO = 5; // Nombre, apellido, fecha, dni, contacto...
                
                if (datos.length != NUM_ATRIBUTOS_TECNICO) {
                    throw new IllegalArgumentException("Error: La linea de este tecnico no contiene todos los atributos necesarios.");
                }
                
                Tecnico t = new Tecnico();
                
                // TODO: Faltaria una validacion de los tipos de los datos
                t.setNombre(datos[0]);
                t.setApellido(datos[1]);
                t.setFechaNacimiento(LocalDate.parse(datos[2]));
                t.setDNI(Integer.parseInt(datos[3]));
                t.setContacto(datos[4]);
                
                tecnicos.add(t);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tecnicos;
    }
}
