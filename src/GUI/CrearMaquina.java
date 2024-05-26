package GUI;
import clases.*;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CrearMaquina extends javax.swing.JPanel {
    public CrearMaquina() {
        initComponents();
        cargarTablaPlantas();
    }

    private void cargarTablaPlantas() {
        DefaultTableModel model = (DefaultTableModel) tablaPlantas.getModel();
        ArrayList<Planta> plantas = Fichero.leerTodaslasPlantas();
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
    
    /*
    public void imprimir_tabla(){
           Table.setDefaultRenderer(Object.class, new Render());
           String [] columnas= new String[]{"Color", "Superficie", "ID","Selecionado"};
           boolean [] editable= {false, false, false, true};
           Class[] types =new Class[]{java.lang.Object.class,java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class};
           DefaultTableModel model = new DefaultTableModel(columnas, 0){
           public Class getColumnClass(int i){
               return types[i];
           }
           public boolean isCellEditable(int row, int column){
               return editable[column];
           }
           };
           //limpiar(Table, model);
           Object[] datos= new Object[columnas.length];    
           ArrayList<Planta> lista_platas= Fichero.leerTodaslasPlantas();
           for(int i=0; i<lista_platas.size(); i++){
                Planta p= (Planta) lista_platas.get(i);
                datos[0]= String.valueOf(p.getColor());
                datos[1]= p.getSuperficie();
                datos[2]= p.getId();
                datos[3]=false;
                model.addRow(datos);
           }
           Table.setModel(model);
       }
     */
    
    /*public void limpiar(JTable tabla, DefaultTableModel modelo){
        if(modelo.getRowCount()>0){
            for(int i=0; i<tabla.getRowCount(); i++){
            modelo.removeRow(i);
            i-=1;
            }
        }
    }
    */
    
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
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class
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
        jScrollPane1.setViewportView(tablaPlantas);
        if (tablaPlantas.getColumnModel().getColumnCount() > 0) {
            tablaPlantas.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel5.setText("Plantas");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Cargar maquina");

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
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

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        Menu_Proceso menu_proceso= new Menu_Proceso();
        menu_proceso.setSize(736,449);
        menu_proceso.setLocation(0,0);
        Background.setLayout(new BorderLayout());
        Background.removeAll();
        Background.add(menu_proceso, BorderLayout.CENTER);
        Background.revalidate();
        Background.repaint();
    }//GEN-LAST:event_botonVolverActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        
        ArrayList<Planta> lista = new ArrayList<>();
        if (fieldEstado.getText().isEmpty() || fieldMarca.getText().isEmpty() || fieldNumero.getText().isEmpty() || fieldModelo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Rellene todos los campos obligatorios", "Ok", JOptionPane.INFORMATION_MESSAGE);
        }
        
        for (int i = 0; i < tablaPlantas.getRowCount(); i++) {
            if ((Boolean) tablaPlantas.getValueAt(i, 3)) {
                Planta p = new Planta(
                (String) tablaPlantas.getValueAt(i, 0),
                (int) tablaPlantas.getValueAt(i, 1));
                p.setId((int) tablaPlantas.getValueAt(i, 2));
                lista.add(p);
            }
        }
        Maquina m = new Maquina(fieldMarca.getText(), fieldModelo.getText(), Integer.parseInt(fieldNumero.getText()), fieldEstado.getText());
        //Fichero.guardarMaquina(m);
        //Fichero.guardarPlantasProcesos(lista, m);
        JOptionPane.showMessageDialog(null, "Se realizó correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        
        // Limpiar campos para poder añadir otro proceso.
        fieldMarca.setText("");
        fieldModelo.setText("");
        fieldNumero.setText("");
        fieldEstado.setText("");
        
        for (int i = 0; i < tablaPlantas.getRowCount(); i++) {
                  tablaPlantas.setValueAt(false, i, 3);
        }
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
