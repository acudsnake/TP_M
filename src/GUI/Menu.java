package GUI;
import java.awt.BorderLayout;


public class Menu extends javax.swing.JPanel {
    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        boton_tecnico = new javax.swing.JButton();
        boton_planta = new javax.swing.JButton();
        boton_proceso = new javax.swing.JButton();
        boton_maquina = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        boton_tecnico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_tecnico1.png"))); // NOI18N
        boton_tecnico.setText("Gestionar Tecnico");
        boton_tecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_tecnicoActionPerformed(evt);
            }
        });

        boton_planta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_planta1.png"))); // NOI18N
        boton_planta.setText("Gestionar Planta");
        boton_planta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_plantaActionPerformed(evt);
            }
        });

        boton_proceso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_proceso1.png"))); // NOI18N
        boton_proceso.setText("Gestionar Proceso");
        boton_proceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_procesoActionPerformed(evt);
            }
        });

        boton_maquina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_maquina1.png"))); // NOI18N
        boton_maquina.setText("Gestionar Maquina");
        boton_maquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_maquinaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Menu principal");

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton_planta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_maquina, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(95, 95, 95)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boton_proceso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boton_tecnico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(119, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(281, 281, 281))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_planta, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_proceso, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_tecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_maquina, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(109, Short.MAX_VALUE))
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

    private void boton_tecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_tecnicoActionPerformed
        Menu_Tecnico menu_tecnico= new Menu_Tecnico();
        menu_tecnico.setSize(736,449);
        menu_tecnico.setLocation(0,0);
        Background.setLayout(new BorderLayout());
        Background.removeAll();
        Background.add(menu_tecnico, BorderLayout.CENTER);
        Background.revalidate();
        Background.repaint();
    }//GEN-LAST:event_boton_tecnicoActionPerformed

    private void boton_procesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_procesoActionPerformed
        Menu_Proceso menu_proceso= new Menu_Proceso();
        menu_proceso.setSize(736,449);
        menu_proceso.setLocation(0,0);
        Background.setLayout(new BorderLayout());
        Background.removeAll();
        Background.add(menu_proceso, BorderLayout.CENTER);
        Background.revalidate();
        Background.repaint();
    }//GEN-LAST:event_boton_procesoActionPerformed

    private void boton_maquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_maquinaActionPerformed
        Menu_Maquina menu_maquina = new Menu_Maquina();
        menu_maquina.setSize(736,449);
        menu_maquina.setLocation(0,0);
        Background.setLayout(new BorderLayout());
        Background.removeAll();
        Background.add(menu_maquina, BorderLayout.CENTER);
        Background.revalidate();
        Background.repaint();
    }//GEN-LAST:event_boton_maquinaActionPerformed

    private void boton_plantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_plantaActionPerformed
        Menu_Planta menu_planta= new Menu_Planta();
        menu_planta.setSize(736,449);
        menu_planta.setLocation(0,0);
        Background.setLayout(new BorderLayout());
        Background.removeAll();
        Background.add(menu_planta, BorderLayout.CENTER);
        Background.revalidate();
        Background.repaint();
    }//GEN-LAST:event_boton_plantaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton boton_maquina;
    private javax.swing.JButton boton_planta;
    private javax.swing.JButton boton_proceso;
    private javax.swing.JButton boton_tecnico;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
