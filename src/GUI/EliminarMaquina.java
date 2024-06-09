package GUI;
import clases.*;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EliminarMaquina extends javax.swing.JPanel {
    public EliminarMaquina() {
        initComponents();
        cargarTablaMaquinas();
    }

    private void cargarTablaMaquinas() {
        DefaultTableModel model = (DefaultTableModel) tablaMaquinas.getModel();
        
        // Limpiar tabla antes de empezar a cargar.
        model.setRowCount(0);
        
        ArrayList<Maquina> maquinas = Fichero.leerMaquinas();
        for (Maquina m : maquinas) {
            model.addRow(new Object[] {
                m.getID(),
                m.getMarca(),
                m.getModelo(),
                m.getNumero(),
                m.getEstado(),
                false // Por defecto, todas las maquinas estan sin seleccionar.
            });
        }
        tablaMaquinas.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        botonVolver = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMaquinas = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        tablaMaquinas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Marca", "Modelo", "Numero", "Estado", "Seleccionar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaMaquinas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMaquinasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaMaquinas);

        jLabel5.setText("Maquinas");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Eliminar maquina");

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addGap(0, 77, Short.MAX_VALUE)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                                .addComponent(botonEliminar)
                                .addGap(6, 6, 6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81))))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(botonVolver)
                        .addGap(232, 232, 232)
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(334, 334, 334))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonVolver)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(botonEliminar)
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
        JPanel menu = new Menu_Maquina();
        menu.setSize(736,449);
        menu.setLocation(0,0);
        Background.setLayout(new BorderLayout());
        Background.removeAll();
        Background.add(menu, BorderLayout.CENTER);
        Background.revalidate();
        Background.repaint();
    }//GEN-LAST:event_botonVolverActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        
        boolean found = false;
        int idMaquina = -1;
        
        // Buscar maquina a eliminar en la tabla
        for (int i = 0; i < tablaMaquinas.getRowCount(); i++) {
            // Si esta planta ha sido seleccionada...
            if ((Boolean) tablaMaquinas.getValueAt(i, 5)) {
                idMaquina = (int) tablaMaquinas.getValueAt(i, 0);
                found = true;
                break;
            }
        }
        if (tablaMaquinas.getRowCount() == 0 || !found) {
            JOptionPane.showMessageDialog(null, "No hay maquinas seleccionadas para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // TODO: se muestran en ingles los botones de confirmacion
        int opcion = JOptionPane.showConfirmDialog(null, "¿Esta seguro de que quiere eliminar esta maquina?", 
                "Eliminar", JOptionPane.YES_NO_OPTION);
        
        if (opcion == JOptionPane.YES_OPTION) {
            Fichero.eliminarMaquina(idMaquina);
            
            //finalizar todos los opera de las maquinas que se finalizaron
            ArrayList<Tecnico> tenicos_asignados= new ArrayList<>();
            tenicos_asignados=Fichero.retornarTecnicosAsignados(idMaquina);
            
            if(!tenicos_asignados.isEmpty()){
                for(int i2=0; i2<tenicos_asignados.size(); i2++){
                    Opera op= new Opera();
                    Fichero.FinalizarOpera(Fichero.buscarOpera(tenicos_asignados.get(i2).getID(),idMaquina));
                    System.out.print("se finalizo opera \n");
                }
            }
            
            
            
            cargarTablaMaquinas(); // Actualizar la tabla con los nuevos cambios.
        }
        
        JOptionPane.showMessageDialog(null, "Se ha eliminado la maquina con exito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void tablaMaquinasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMaquinasMouseClicked
        /*int selectedRow = Table.getSelectedRow();
            if ((Boolean)Table.getValueAt(selectedRow , 3)) {
               for (int i = 0; i < Table.getRowCount(); i++) {
               if ( i != selectedRow) {
                  Table.setValueAt(false, i, 3);
               }
             }
        }*/
    }//GEN-LAST:event_tablaMaquinasMouseClicked

    

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonVolver;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaMaquinas;
    // End of variables declaration//GEN-END:variables
}
