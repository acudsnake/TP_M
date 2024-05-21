package GUI;

import clases.Fichero;
import clases.Proceso;
import clases.*;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CrearProceso extends javax.swing.JPanel {
    public CrearProceso() {
        initComponents();
        //cargarPlantasEnTabla();
    }

    /*public void cargarPlantasEnTabla() {
        tablaPlantas.setDefaultRenderer(Object.class, new Render());
        String [] columnas = new String[] {"Marca", "Modelo","Numero","Estado","Selecionado"};
        boolean [] editable = {false, false, false, false, true};
        Class[] types = new Class[] {
            java.lang.Object.class, 
            java.lang.Object.class, 
            java.lang.Object.class, 
            java.lang.Object.class,
            java.lang.Boolean.class
        };
        
        DefaultTableModel model_m = new DefaultTableModel(columnas, 0) {
            public Class getColumnClass(int i){
                return types[i];
            }
        
            public boolean isCellEditable(int row, int column){
                return editable[column];
            }
        };
        
        Object[] datos = new Object[columnas.length];    
        ArrayList<Planta> listaPlantas = Fichero.leerTodaslasPlantas();
        
        for (int i = 0; i < listaPlantas.size(); i++){
            Planta p = (Planta) listaPlantas.get(i);
            datos[0] = String.valueOf(p.getColor());
            datos[1] = String.valueOf(p.getSuperficie());
            datos[2] = false;
            model_m.addRow(datos);
        }
        tablaPlantas.setModel(model_m);
       }*/
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        Background = new javax.swing.JPanel();
        botonVolver = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombreField = new javax.swing.JTextField();
        complejidadField = new javax.swing.JTextField();

        jToggleButton1.setText("jToggleButton1");

        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("Complejidad");

        nombreField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreFieldActionPerformed(evt);
            }
        });

        complejidadField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                complejidadFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botonGuardar))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(botonVolver)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(23, 23, 23)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(complejidadField)
                    .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(464, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonVolver)
                .addGap(139, 139, 139)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(complejidadField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 260, Short.MAX_VALUE)
                .addComponent(botonGuardar)
                .addContainerGap())
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

    private void nombreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreFieldActionPerformed

    private void complejidadFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_complejidadFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_complejidadFieldActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        if (nombreField.getText().isEmpty() || complejidadField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Rellene todos los campos obligatorios", "Ok", JOptionPane.INFORMATION_MESSAGE);
        }
            
        Proceso pr = new Proceso(nombreField.getText(), complejidadField.getText());    
        
        //ArrayList<Planta> plantas = new ArrayList<>();

        //for(int i = 0; i < tablaPlantas.getRowCount(); i++) {
        //    Planta p = new Planta();
        //    if (String.valueOf(tablaPlantas.getValueAt(i, 3)).equals("true")) {
        //        p.setColor((String) tablaPlantas.getValueAt(i, 1));
        //        p.setSuperficie((int) tablaPlantas.getValueAt(i, 0));
        //        plantas.add(p);
        //    }
        //}
        
        // Todo: Falta ver como guardar las plantas
        //Fichero.guardar_plantas(plantas);
        Fichero.guardar_proceso(pr);
        JOptionPane.showMessageDialog(null, "Se realizó correctamente", "Ok", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        Menu_Proceso menu_proceso = new Menu_Proceso();
        menu_proceso.setSize(736,449);
        menu_proceso.setLocation(0,0);
        Background.setLayout(new BorderLayout());
        Background.removeAll();
        Background.add(menu_proceso, BorderLayout.CENTER);
        Background.revalidate();
        Background.repaint();
    }//GEN-LAST:event_botonVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonVolver;
    private javax.swing.JTextField complejidadField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField nombreField;
    // End of variables declaration//GEN-END:variables
}
