package GUI;

import clases.Fichero;
import clases.Proceso;
import clases.*;
import com.github.lgooddatepicker.components.DatePicker;
import com.github.lgooddatepicker.components.DatePickerSettings;
import com.github.lgooddatepicker.components.DatePickerSettings.DateArea;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;
import javax.swing.UIManager;

public class ConsultarTecnico extends javax.swing.JPanel {
    public ConsultarTecnico() {
        initComponents();
        cargarTecnicosTabla();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        Background = new javax.swing.JPanel();
        botonVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaConsultar = new javax.swing.JTable();

        jToggleButton1.setText("jToggleButton1");

        Background.setPreferredSize(new java.awt.Dimension(748, 519));
        Background.setRequestFocusEnabled(false);

        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        tablaConsultar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Fecha de nacimiento", "DNI", "Contacto"
            }
        ));
        jScrollPane1.setViewportView(tablaConsultar);

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonVolver)
                .addContainerGap(670, Short.MAX_VALUE))
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonVolver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
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

    private void cargarTecnicosTabla() {
        DefaultTableModel model = (DefaultTableModel) tablaConsultar.getModel();
        ArrayList<Tecnico> tecnicos = Fichero.leerTecnicos();
        for (Tecnico t : tecnicos) {
            model.addRow(new String[] {
                t.getNombre(),
                t.getApellido(),
                t.getFechaNacimiento().toString(),
                Integer.toString(t.getDNI()),
                t.getContacto()
            });
        }
        tablaConsultar.setModel(model);
    }
    
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
    private javax.swing.JButton botonVolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTable tablaConsultar;
    // End of variables declaration//GEN-END:variables
}
