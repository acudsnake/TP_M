package GUI;
import clases.Fichero;
import clases.Maquina;
import clases.Tecnico;
import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class ConsultarMaquinaparaDesasignar extends javax.swing.JPanel {
    int sel = 0;
    Tecnico t= new Tecnico();

    public ConsultarMaquinaparaDesasignar(Tecnico tecnico) {
        initComponents();
        t=tecnico;
        imprimir_tabla();
    }
 
    private void imprimir_tabla() {
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        model.setRowCount(0);
        ArrayList<Maquina> maquinas = Fichero.retornarMaquinasAsignadas(t);
        for (Maquina m : maquinas) {
            model.addRow(new Object[] {
                m.getMarca(),
                m.getModelo(),
                m.getNumero(),
                m.getEstado(),
                m.getID(),
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
                "Marca", "Modelo", "Numero", "Estado", "ID", "Seleccion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class
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

        Seleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Marca", "Modelo", "Numero", "Estado", "ID" }));
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

        jButton2.setText("Desasignar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Seleccione las maquinas que desee desasignarle al tecnico y presione el boton de \"Desasignar\"");

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
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(38, 38, 38))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(114, 114, 114))))))
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
        ConsultarTecnicoparaDesasignar volver= new ConsultarTecnicoparaDesasignar();
        volver.setSize(736,449);
        volver.setLocation(0,0);
        Background.setLayout(new BorderLayout());
        Background.removeAll();
        Background.add(volver, BorderLayout.CENTER);
        Background.revalidate();
        Background.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ArrayList<Maquina> lista_maquinas = new ArrayList<>();
        int seleccion=0;
        for(int i=0; i<Table.getRowCount(); i++){
            if((Boolean) Table.getValueAt(i, 5)){
                seleccion++;
                Maquina maquina= new Maquina();
                maquina.setMarca((String) Table.getValueAt(i, 0));
                maquina.setModelo((String) Table.getValueAt(i, 1));
                maquina.setNumero((int) Table.getValueAt(i, 2));
                maquina.setEstado((String) Table.getValueAt(i, 3));
                maquina.setID((int) Table.getValueAt(i, 4));
                lista_maquinas.add(maquina);
                
            }
        }
        if(seleccion!=0){
            for(int i=0; i<lista_maquinas.size(); i++){
                Fichero.FinalizarOpera(Fichero.buscarOpera(t.getID(),lista_maquinas.get(i).getID()));
                imprimir_tabla();
            }
        }
        else
            JOptionPane.showMessageDialog(null, "Seleccione una planta", "Ok", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked

    }//GEN-LAST:event_TableMouseClicked

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

    private void SeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionActionPerformed
        String selected = (String) Seleccion.getSelectedItem();
        switch (selected) {
            case "Marca": sel = 0; break;
            case "Modelo": sel = 1; break;
            case "Numero": sel = 2; break;
            case "Estado": sel = 3; break;
            case "ID": sel = 4; break;
        }
    }//GEN-LAST:event_SeleccionActionPerformed


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
