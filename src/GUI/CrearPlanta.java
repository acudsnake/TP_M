package GUI;
import clases.Fichero;
import clases.*;
import java.awt.BorderLayout;
import java.awt.Color;
//import javafx.scene.layout.Border;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;

public class CrearPlanta extends javax.swing.JPanel {
    public CrearPlanta() {
        initComponents();
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
        color = new javax.swing.JTextField();
        Superficie = new javax.swing.JTextField();

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

        color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorActionPerformed(evt);
            }
        });

        Superficie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuperficieActionPerformed(evt);
            }
        });
        Superficie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SuperficieKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(22, 22, 22))
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(23, 23, 23)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Superficie)
                            .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButton1)))
                .addContainerGap(275, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(135, 135, 135)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Superficie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(27, 27, 27))
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

    private void colorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_colorActionPerformed

    private void SuperficieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuperficieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SuperficieActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Color customColor= new Color(237, 59, 59);
        javax.swing.border.Border border = BorderFactory.createLineBorder(customColor, 2);
        if(color.getText().isEmpty() || Superficie.getText().isEmpty()){
            if(color.getText().isEmpty())
                color.setBorder(border);
//Color.setBackground(new Color (245, 165, 148 ));
            if(Superficie.getText().isEmpty())
                Superficie.setBorder(border);
            JOptionPane.showMessageDialog(null, "Rellene todos los campos obligatorios", "Ok", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            Planta p= new Planta();
            p.setColor(color.getText());
            p.setSuperficie(Integer.parseInt(Superficie.getText()));
            Fichero.guardar_planta(p);
            JOptionPane.showMessageDialog(null, "Se realizó correctamente", "Ok", JOptionPane.INFORMATION_MESSAGE);
            color.setText("");
            Superficie.setText("");
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

    private void SuperficieKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SuperficieKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
                evt.consume();
            }
    }//GEN-LAST:event_SuperficieKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JTextField Superficie;
    private javax.swing.JTextField color;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
