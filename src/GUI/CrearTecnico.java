package GUI;

import clases.Fichero;
import clases.Proceso;
import clases.*;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;

public class CrearTecnico extends javax.swing.JPanel {
    public CrearTecnico() {
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
        fieldNombre = new javax.swing.JTextField();
        fieldApellido = new javax.swing.JTextField();
        fieldDni = new javax.swing.JTextField();
        fieldContacto = new javax.swing.JTextField();
        fechaNacField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

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

        jLabel2.setText("Apellido");

        fieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNombreActionPerformed(evt);
            }
        });

        fieldApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldApellidoActionPerformed(evt);
            }
        });

        fieldDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldDniActionPerformed(evt);
            }
        });

        fieldContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldContactoActionPerformed(evt);
            }
        });

        fechaNacField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaNacFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Fecha de nacimiento");

        jLabel4.setText("DNI");

        jLabel5.setText("Contacto");

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(botonGuardar))
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addComponent(botonVolver)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fieldDni, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(BackgroundLayout.createSequentialGroup()
                                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(23, 23, 23))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BackgroundLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fieldApellido)
                                    .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fieldContacto, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(fechaNacField))))
                        .addGap(0, 416, Short.MAX_VALUE)))
                .addContainerGap())
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonVolver)
                .addGap(139, 139, 139)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaNacField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
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

    private void fechaNacFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaNacFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaNacFieldActionPerformed

    private void fieldContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldContactoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldContactoActionPerformed

    private void fieldDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldDniActionPerformed

    private void fieldApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldApellidoActionPerformed

    private void fieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNombreActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        if (fieldNombre.getText().isEmpty() || fieldApellido.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Rellene todos los campos obligatorios", "Ok", JOptionPane.INFORMATION_MESSAGE);
        }
        
        Tecnico t = new Tecnico(fieldNombre.getText(), fieldApellido.getText(), Integer.parseInt(fieldDni.getText()), fieldContacto.getText(), LocalDate.of(2024, 1, 1), new Opera(LocalDate.of(2024, 1, 1), LocalDate.of(2024, 1, 1), 1));

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
        Fichero.guardar_tecnico(t);
        JOptionPane.showMessageDialog(null, "Se realizó correctamente", "Ok", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        Menu_Tecnico menu = new Menu_Tecnico();
        menu.setSize(736,449);
        menu.setLocation(0,0);
        Background.setLayout(new BorderLayout());
        Background.removeAll();
        Background.add(menu, BorderLayout.CENTER);
        Background.revalidate();
        Background.repaint();
    }//GEN-LAST:event_botonVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonVolver;
    private javax.swing.JTextField fechaNacField;
    private javax.swing.JTextField fieldApellido;
    private javax.swing.JTextField fieldContacto;
    private javax.swing.JTextField fieldDni;
    private javax.swing.JTextField fieldNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
