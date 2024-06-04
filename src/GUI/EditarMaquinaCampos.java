package GUI;
import clases.*;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EditarMaquinaCampos extends javax.swing.JPanel {
    final int COLUMNA_ID = 0;
    final int COLUMNA_SELECCIONAR = 3;
    Maquina antigua;
    
    public EditarMaquinaCampos(Maquina m) {
        initComponents();
        cargarTablaPlantas();
        
        // Cargar maquina antigua a la clase para uso posterior.
        antigua = m;
        
        // Cargar campos antiguos
        fieldMarca.setText(m.getMarca());
        fieldModelo.setText(m.getModelo());
        fieldNumero.setText(Integer.toString(m.getNumero()));
        fieldEstado.setText(m.getEstado());
        
        // Tambien en la planta
        for (int i = 0; i < tablaPlantas.getRowCount(); i++) {
            int id = Integer.parseInt(tablaPlantas.getValueAt(i, COLUMNA_ID).toString());
            if (m.getPlanta() != null && id == m.getPlanta().getId()) {
                tablaPlantas.setValueAt(true, i, COLUMNA_SELECCIONAR);
            }
        }
        
    }

    private void cargarTablaPlantas() {
        DefaultTableModel model = (DefaultTableModel) tablaPlantas.getModel();
        ArrayList<Planta> plantas = Fichero.leerPlantas();
        for (Planta p : plantas) {
            model.addRow(new Object[] {
                p.getId(),
                p.getColor(),
                p.getSuperficie(),
                false
            });
        }
        tablaPlantas.setModel(model);
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        botonVolver = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fieldMarca = new javax.swing.JTextField();
        fieldNumero = new javax.swing.JTextField();
        fieldModelo = new javax.swing.JTextField();
        fieldEstado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPlantas = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

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

        jLabel1.setText("Marca");

        jLabel2.setText("Modelo");

        jLabel3.setText("Numero");

        jLabel4.setText("Estado");

        fieldMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldMarcaActionPerformed(evt);
            }
        });

        fieldNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNumeroActionPerformed(evt);
            }
        });

        fieldModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldModeloActionPerformed(evt);
            }
        });

        fieldEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldEstadoActionPerformed(evt);
            }
        });

        tablaPlantas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Color", "Superficie", "Seleccionar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaPlantas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaPlantasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaPlantas);

        jLabel5.setText("Plantas");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Editar maquina");

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(25, 25, 25)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addGap(0, 77, Short.MAX_VALUE)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                                .addComponent(botonGuardar)
                                .addGap(6, 6, 6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81))))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(botonVolver)
                        .addGap(232, 232, 232)
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(353, 353, 353)
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonVolver)
                    .addComponent(jLabel6))
                .addGap(36, 36, 36)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fieldModelo)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fieldNumero)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonGuardar)
                .addGap(54, 54, 54))
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

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        JPanel menu = new EditarMaquina();
        menu.setSize(736,449);
        menu.setLocation(0,0);
        Background.setLayout(new BorderLayout());
        Background.removeAll();
        Background.add(menu, BorderLayout.CENTER);
        Background.revalidate();
        Background.repaint();
    }//GEN-LAST:event_botonVolverActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        if (fieldEstado.getText().isEmpty() || fieldMarca.getText().isEmpty() || fieldNumero.getText().isEmpty() || fieldModelo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Rellene todos los campos obligatorios", "Ok", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Buscar planta seleccionado en la tabla para asignar a esta nueva maquina
        Planta p = new Planta();
        boolean found = false;
        for (int i = 0; i < tablaPlantas.getRowCount(); i++) {
            // Si esta planta ha sido seleccionada...
            if ((Boolean) tablaPlantas.getValueAt(i, 3)) {
                p.setId((int) tablaPlantas.getValueAt(i, 0));
                p.setColor((String) tablaPlantas.getValueAt(i, 1));
                p.setSuperficie((int) tablaPlantas.getValueAt(i, 2));
                found = true;
                break;
            }
        }
        
        // Por modelo de dominio, una maquina no puede quedar sin asignar a una planta.
        if (!found) {
            JOptionPane.showMessageDialog(null, "Seleccione una planta a la cual asignar la maquina", "Ok", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Maquina nueva = new Maquina(fieldMarca.getText(), fieldModelo.getText(), Integer.parseInt(fieldNumero.getText()), fieldEstado.getText());
        nueva.setPlanta(p);
        
        Fichero.modificarMaquina(antigua, nueva);
        
        // Volver al menu Editar
        JPanel menu = new EditarMaquina();
        menu.setSize(736,449);
        menu.setLocation(0,0);
        Background.setLayout(new BorderLayout());
        Background.removeAll();
        Background.add(menu, BorderLayout.CENTER);
        Background.revalidate();
        Background.repaint();
        
        JOptionPane.showMessageDialog(null, "Se realizó correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void fieldMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldMarcaActionPerformed

    private void fieldNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNumeroActionPerformed

    private void fieldModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldModeloActionPerformed

    private void fieldEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldEstadoActionPerformed

    private void tablaPlantasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPlantasMouseClicked
        /*int selectedRow = Table.getSelectedRow();
            if ((Boolean)Table.getValueAt(selectedRow , 3)) {
               for (int i = 0; i < Table.getRowCount(); i++) {
               if ( i != selectedRow) {
                  Table.setValueAt(false, i, 3);
               }
             }
        }*/
    }//GEN-LAST:event_tablaPlantasMouseClicked

    

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonVolver;
    private javax.swing.JTextField fieldEstado;
    private javax.swing.JTextField fieldMarca;
    private javax.swing.JTextField fieldModelo;
    private javax.swing.JTextField fieldNumero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPlantas;
    // End of variables declaration//GEN-END:variables
}
