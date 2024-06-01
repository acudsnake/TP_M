package GUI;
import clases.Fichero;
import clases.Maquina;
import clases.Planta;
import clases.Proceso;
import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class ConsultarMaquina extends javax.swing.JPanel {
    int sel = 0; // Contiene el filtro seleccionado para buscar en la tabla
    
    public ConsultarMaquina() {
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
                m.getEstado()
            });
        }
        tablaMaquinas.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campoBuscador = new javax.swing.JTextField();
        opcionesBuscador = new javax.swing.JComboBox<>();
        botonVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMaquinas = new javax.swing.JTable();

        jLabel1.setText("Buscar");

        campoBuscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoBuscadorActionPerformed(evt);
            }
        });
        campoBuscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoBuscadorKeyTyped(evt);
            }
        });

        opcionesBuscador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Marca", "Modelo", "Numero", "Estado" }));
        opcionesBuscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionesBuscadorActionPerformed(evt);
            }
        });

        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        tablaMaquinas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Marca", "Modelo", "Numero", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

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

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonVolver)
                        .addGap(131, 131, 131)
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addComponent(campoBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(opcionesBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(campoBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opcionesBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonVolver)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                .addGap(70, 70, 70))
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

    private void campoBuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoBuscadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoBuscadorActionPerformed

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

    private void opcionesBuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionesBuscadorActionPerformed
        String selected = (String) opcionesBuscador.getSelectedItem();
        switch (selected) {
            case "ID": sel = 0; break;
            case "Marca": sel = 1; break;
            case "Modelo": sel = 2; break;
            case "Numero": sel = 3; break;
            case "Estado": sel = 4; break;
        }
    }//GEN-LAST:event_opcionesBuscadorActionPerformed

    private void campoBuscadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoBuscadorKeyTyped
        DefaultTableModel model = (DefaultTableModel) tablaMaquinas.getModel();
        TableRowSorter trs = new TableRowSorter(model);
        
        campoBuscador.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent key) {
                trs.setRowFilter(RowFilter.regexFilter(campoBuscador.getText(), sel));
                tablaMaquinas.setRowSorter(trs);
            }
        });
    }//GEN-LAST:event_campoBuscadorKeyTyped

    private void tablaMaquinasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMaquinasMouseClicked
    }//GEN-LAST:event_tablaMaquinasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton botonVolver;
    private javax.swing.JTextField campoBuscador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> opcionesBuscador;
    private javax.swing.JTable tablaMaquinas;
    // End of variables declaration//GEN-END:variables
}
