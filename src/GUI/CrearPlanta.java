package GUI;

import clases.Fichero;
import clases.Maquina;
import clases.*;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class CrearPlanta extends javax.swing.JPanel {
    public CrearPlanta() {
        initComponents();
        imprimir_tabla_maquinas();
        imprimir_tabla_procesos();
    }

    public void imprimir_tabla_maquinas(){
        Tabla_maquinas.setDefaultRenderer(Object.class, new Render());
        String [] columnas= new String[]{"Marca", "Modelo","Numero","Estado","Selecionado"};
        boolean [] editable= {false, false, false, false, true};
        Class[] types =new Class[]{
            java.lang.Object.class, 
            java.lang.Object.class, 
            java.lang.Object.class, 
            java.lang.Object.class,
            java.lang.Boolean.class};
        DefaultTableModel model_m = new DefaultTableModel(columnas, 0){
        public Class getColumnClass(int i){
            return types[i];
        }
        public boolean isCellEditable(int row, int column){
           return editable[column];
        }
        };
        Object[] datos= new Object[columnas.length];    
        ArrayList<Maquina> lista_maquinas= Fichero.leerTodaslasMaquinas();
        for(int i=0; i<lista_maquinas.size(); i++){
            Maquina m= (Maquina) lista_maquinas.get(i);
            datos[0]= String.valueOf(m.getMarca());
            datos[1]= String.valueOf(m.getModelo());
            datos[2]= m.getNumero();
            datos[3]= String.valueOf(m.getEstado());
            datos[4]= false;
            model_m.addRow(datos);
            }
        Tabla_maquinas.setModel(model_m);
       }
    
   public void imprimir_tabla_procesos(){
            Tabla_maquinas.setDefaultRenderer(Object.class, new Render());
            String [] columnas= new String[]{"Nombre","Complejidad","Selecionado"};
            boolean [] editable= {false, false, true};
            Class[] types =new Class[]{
                java.lang.Object.class, 
                java.lang.Object.class, 
                java.lang.Boolean.class};
            DefaultTableModel model_p = new DefaultTableModel(columnas, 0){
            public Class getColumnClass(int i){
                return types[i];
            }
            public boolean isCellEditable(int row, int column){
               return editable[column];
            }
            };
            Object[] datos= new Object[columnas.length];   
            ArrayList<Proceso> lista_procesos= Fichero.leerTodaslosProcesos();
            for(int i=0; i<lista_procesos.size(); i++){
                Proceso p= (Proceso) lista_procesos.get(i);
                datos[0]= String.valueOf(p.getNombre());
                datos[1]= String.valueOf(p.getComplejidad());
                datos[2]=false;
                model_p.addRow(datos);
           }
           Tabla_procesos.setModel(model_p);
       }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        Background = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Color = new javax.swing.JTextField();
        Superficie = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_procesos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_maquinas = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Color");

        jLabel2.setText("Superficie");

        Color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColorActionPerformed(evt);
            }
        });

        Superficie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuperficieActionPerformed(evt);
            }
        });

        Tabla_procesos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane1.setViewportView(Tabla_procesos);

        Tabla_maquinas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Tabla_maquinas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_maquinasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tabla_maquinas);

        jLabel3.setText("Maquinas");

        jLabel4.setText("Procesos");

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(23, 23, 23)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Superficie)
                    .addComponent(Color, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addContainerGap(323, Short.MAX_VALUE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(211, 211, 211))))
            .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                    .addContainerGap(326, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(41, 41, 41)))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(117, 117, 117)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Superficie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
            .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BackgroundLayout.createSequentialGroup()
                    .addGap(72, 72, 72)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(299, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ColorActionPerformed

    private void SuperficieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuperficieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SuperficieActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(Color.getText().isEmpty() || Superficie.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Rellene todos los campos obligatorios", "Ok", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
        Planta p= new Planta(Color.getText(), Integer.parseInt(Superficie.getText()));
        Maquina m = new Maquina();
        Proceso pr= new Proceso();
        ArrayList<Maquina> maquinas= new ArrayList<>();
        ArrayList<Proceso> procesos= new ArrayList<>();
        for(int i=0; i<Tabla_maquinas.getRowCount(); i++){
            if(String.valueOf(Tabla_maquinas.getValueAt(i, 4))=="true"){
                m.setMarca((String) Tabla_maquinas.getValueAt(i, 0));
                m.setModelo((String) Tabla_maquinas.getValueAt(i, 1));
                m.setNumero((int) Tabla_maquinas.getValueAt(i, 2));
                m.setEstado((String) Tabla_maquinas.getValueAt(i, 3));
                maquinas.add(m);
            }
        }
        for(int i=0; i<Tabla_procesos.getRowCount(); i++){
            if(String.valueOf(Tabla_procesos.getValueAt(i, 2))=="true"){
                pr.setNombre((String) Tabla_procesos.getValueAt(i, 0));
                pr.setComplejidad((String) Tabla_procesos.getValueAt(i, 1));
                procesos.add(pr);
            }
        }
        p.setMaquina(maquinas);
        p.setProceso(procesos);
        Fichero.guardar_planta(p);
        JOptionPane.showMessageDialog(null, "Se realizó correctamente", "Ok", JOptionPane.INFORMATION_MESSAGE);
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu_Planta menu_agregar= new Menu_Planta();
        menu_agregar.setSize(736,449);
        menu_agregar.setLocation(0,0);
        Background.setLayout(new BorderLayout());
        Background.removeAll();
        Background.add(menu_agregar, BorderLayout.CENTER);
        Background.revalidate();
        Background.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Tabla_maquinasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_maquinasMouseClicked
        int selectedRow = Tabla_maquinas.getSelectedRow();
        Object marca = Tabla_maquinas.getValueAt(selectedRow, 0);
        Object modelo = Tabla_maquinas.getValueAt(selectedRow, 1);
        Object numero = Tabla_maquinas.getValueAt(selectedRow, 2);
        Object estado = Tabla_maquinas.getValueAt(selectedRow, 3);
        
        //p.setColor(color.toString());
        //p.setSuperficie(Integer.parseInt((String)superficie));
    }//GEN-LAST:event_Tabla_maquinasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JTextField Color;
    private javax.swing.JTextField Superficie;
    private javax.swing.JTable Tabla_maquinas;
    private javax.swing.JTable Tabla_procesos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
