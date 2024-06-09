package GUI;

import clases.Fichero;
import clases.*;
import java.awt.BorderLayout;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class EditarTecnico extends javax.swing.JPanel {
    Tecnico aux= new Tecnico();
    
    public EditarTecnico(Tecnico tecnico) {
        initComponents();
        aux=tecnico;
        Nombre.setText(tecnico.getNombre());
        Apellido.setText(tecnico.getApellido());
        Contacto.setText(tecnico.getContacto());
        DNI.setText(String.valueOf(tecnico.getDNI()));
        //Poner fecha de nacimiento
        
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
        Nombre = new javax.swing.JTextField();
        Apellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Contacto = new javax.swing.JTextField();
        DNI = new javax.swing.JTextField();
        Fecha = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();

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

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido");

        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });

        Apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoActionPerformed(evt);
            }
        });

        jLabel3.setText("Contacto");

        jLabel4.setText("DNI");

        DNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DNIKeyTyped(evt);
            }
        });

        jLabel5.setText("Fecha de nacimiento");

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(84, 84, 84)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(222, 222, 222))
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addGap(273, 273, 273)
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(79, 79, 79))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)))
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(DNI, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Contacto, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Fecha, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(57, 57, 57)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Contacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(DNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                .addComponent(jButton2)
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

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreActionPerformed

    private void ApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(Nombre.getText().isEmpty() || 
                Apellido.getText().isEmpty() ||
                Contacto.getText().isEmpty() ||
                DNI.getText().isEmpty() || Fecha.getDate()==null
                ){
            JOptionPane.showMessageDialog(null, "Rellene todos los campos obligatorios", "Ok", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            String dia = Integer.toString(Fecha.getCalendar().get(Calendar.DAY_OF_MONTH));
            String mes = Integer.toString(Fecha.getCalendar().get(Calendar.MONTH) + 1);
            String año = Integer.toString(Fecha.getCalendar().get(Calendar.YEAR));
            LocalDate fecha = LocalDate.of(Integer.parseInt(año), Integer.parseInt(mes), Integer.parseInt(dia));
            Tecnico tecnico= new Tecnico(Nombre.getText(),Apellido.getText(), Integer.parseInt(DNI.getText()), Contacto.getText(), fecha);
            Fichero.modificarTecnico(aux,tecnico);
            Nombre.setText("");
            Apellido.setText("");
            Contacto.setText("");
            DNI.setText("");
            JOptionPane.showMessageDialog(null, "Se realizó correctamente", "Ok", JOptionPane.INFORMATION_MESSAGE);
            
        }   
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu_Tecnico menu= new Menu_Tecnico();
        menu.setSize(736,449);
        menu.setLocation(0,0);
        Background.setLayout(new BorderLayout());
        Background.removeAll();
        Background.add(menu, BorderLayout.CENTER);
        Background.revalidate();
        Background.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void DNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DNIKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
                evt.consume();
            }
    }//GEN-LAST:event_DNIKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellido;
    private javax.swing.JPanel Background;
    private javax.swing.JTextField Contacto;
    private javax.swing.JTextField DNI;
    private com.toedter.calendar.JDateChooser Fecha;
    private javax.swing.JTextField Nombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
