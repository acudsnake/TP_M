package GUI;
import clases.Fichero;
import clases.*;
import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class EliminarPlanta extends javax.swing.JPanel {
    int sel=0;
    
    public EliminarPlanta() {
        initComponents();
        imprimir_tabla();
    }
 
    private void imprimir_tabla() {
           DefaultTableModel model = (DefaultTableModel) Table.getModel();
           model.setRowCount(0);
           ArrayList<Planta> plantas = Fichero.leerPlantas();
           for (Planta p : plantas) {
               model.addRow(new Object[] {
                   p.getColor(),
                   p.getSuperficie(),
                   p.getMaquina().size(),
                   p.getProceso().size(),
                   p.getId(),
                   false
               });
           }
           Table.setModel(model);
       }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Buscador = new javax.swing.JTextField();
        Seleccion = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Color", "Superficie", "Cant. Maquinas", "Cant. Procesos", "ID", "Seleccion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Boolean.class
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
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table);

        jLabel1.setText("Buscar");

        Buscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscadorActionPerformed(evt);
            }
        });
        Buscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BuscadorKeyTyped(evt);
            }
        });

        Seleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Color", "Superficie", "Cant. Maquinas", "Cant. Procesos" }));
        Seleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionActionPerformed(evt);
            }
        });

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Seleccione una planta que quiera eliminar y presione el boton de \"Continuar\"");

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(131, 131, 131)
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addComponent(Buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Seleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(188, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(38, 38, 38))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Buscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Seleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(76, 76, 76))
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

    private void BuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscadorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu_Planta menu_planta= new Menu_Planta();
        menu_planta.setSize(736,449);
        menu_planta.setLocation(0,0);
        Background.setLayout(new BorderLayout());
        Background.removeAll();
        Background.add(menu_planta, BorderLayout.CENTER);
        Background.revalidate();
        Background.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ArrayList<Planta> lista= new ArrayList();
        int seleccion=0;
        for(int i=0; i<Table.getRowCount(); i++){
            if((Boolean) Table.getValueAt(i, 5)){
                seleccion++;
                Planta p= new Planta((String) Table.getValueAt(i, 0), (int) Table.getValueAt(i, 1));
                p.setId((int) Table.getValueAt(i, 4));
                lista.add(p);
            }
        }
        if(seleccion>0){
            for(int i=0; i<lista.size(); i++){
                Planta aux= new Planta();
                aux=Fichero.buscarPlanta(lista.get(i).getId());
                Fichero.eliminarPlanta(aux);
                for(int i2=0; i2<aux.getMaquina().size(); i2++){
                    Fichero.eliminarMaquina(aux.getMaquina().get(i2));
                }
                Fichero.eliminarPlantas_Procesos(aux);
                for(int i2=0; i2<aux.getProceso().size(); i2++){
                    if(!Fichero.verificar_si_proceso_esta_asignado(aux.getProceso().get(i2)))
                        Fichero.eliminarProceso(aux.getProceso().get(i2));
                }   
                    
                imprimir_tabla();
            }
            JOptionPane.showMessageDialog(null, "Se elimino correctamente", "Ok", JOptionPane.INFORMATION_MESSAGE);
            lista.clear();
        }
        else
            JOptionPane.showMessageDialog(null, "Seleccione una planta", "Ok", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
         int selectedRow = Table.getSelectedRow();
            if ((Boolean)Table.getValueAt(selectedRow , 5)) {
               for (int i = 0; i < Table.getRowCount(); i++) {
               if ( i != selectedRow) {
                  Table.setValueAt(false, i, 5);
               }
             }
        }
    }//GEN-LAST:event_TableMouseClicked

    private void SeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionActionPerformed
        String selected = (String) Seleccion.getSelectedItem();
        switch (selected) {
            case "Color": sel = 0; break;
            case "Superficie": sel = 1; break;
            case "Cant. Maquinas": sel = 2; break;
            case "Cant. Procesos": sel = 3; break;
            case "ID": sel = 4; break;
        }
    }//GEN-LAST:event_SeleccionActionPerformed

    private void BuscadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscadorKeyTyped
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        TableRowSorter trs = new TableRowSorter(model);
        Buscador.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent key) {
                trs.setRowFilter(RowFilter.regexFilter(Buscador.getText(), sel));
                Table.setRowSorter(trs);
            }
        });
    }//GEN-LAST:event_BuscadorKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JTextField Buscador;
    private javax.swing.JComboBox<String> Seleccion;
    private javax.swing.JTable Table;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
