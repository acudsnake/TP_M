package GUI;
import clases.Fichero;
import clases.Maquina;
import clases.Planta;
import clases.Proceso;
import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class EditarMaquina extends javax.swing.JPanel {
    int sel = 0; // Contiene el filtro seleccionado para buscar en la tabla
    final int COLUMNA_SELECCIONAR = 5; // En que nro. de columna de la tabla esta asignado
    
    public EditarMaquina() {
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
                false
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
        botonEditar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

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

        botonEditar.setText("Continuar");
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });

        jLabel2.setText("Seleccione una maquina para editar y presione el boton \"Continuar\"");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Editar maquina");

        jLabel3.setText("Filtro");

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addComponent(botonEditar)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(BackgroundLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(40, 40, 40))
                                    .addGroup(BackgroundLayout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addComponent(opcionesBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(165, 165, 165))))
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonVolver))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonVolver)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opcionesBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonEditar)
                .addGap(29, 29, 29))
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
        // Codigo para permitir seleccionar un solo elemento de la tabla.
        // NO CONFIABLE: se bugea cuando seleccionas otra cosa
        int selectedRow = tablaMaquinas.getSelectedRow();
        if (tablaMaquinas.getSelectedColumn() == COLUMNA_SELECCIONAR &&
                (Boolean) tablaMaquinas.getValueAt(selectedRow , COLUMNA_SELECCIONAR)) {
            for (int i = 0; i < tablaMaquinas.getRowCount(); i++) {
                if (i != selectedRow) {
                    tablaMaquinas.setValueAt(false, i, COLUMNA_SELECCIONAR);
                }
            }
        }
    }//GEN-LAST:event_tablaMaquinasMouseClicked

    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
        // Buscar maquina seleccionado en la tabla para poder editarla
        boolean found = false;
        int idMaquinaSeleccionada = -1;
        for (int i = 0; i < tablaMaquinas.getRowCount(); i++) {
            // Si esta maquina ha sido seleccionada...
            if ((Boolean) tablaMaquinas.getValueAt(i, COLUMNA_SELECCIONAR)) {
                idMaquinaSeleccionada = Integer.parseInt(tablaMaquinas.getValueAt(i, 0).toString());
                found = true;
                break;
            } 
        }
        
        if (tablaMaquinas.getRowCount() == 0 || !found) {
            JOptionPane.showMessageDialog(null, "No hay ninguna maquina seleccionada para editar.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // TODO: buscarMaquina(id)
        Maquina m = new Maquina();
        ArrayList<Maquina> maquinas = Fichero.leerMaquinas();
        
        for (Maquina maq : maquinas) {
            if (maq.getID() == idMaquinaSeleccionada) {
                m = maq;
            }
        }
        
        // Cambiar al menu "Editar campos" para esa maquina.
        JPanel menu = new EditarMaquinaCampos(m);
        menu.setSize(736,449);
        menu.setLocation(0,0);
        Background.setLayout(new BorderLayout());
        Background.removeAll();
        Background.add(menu, BorderLayout.CENTER);
        Background.revalidate();
        Background.repaint();
    }//GEN-LAST:event_botonEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonVolver;
    private javax.swing.JTextField campoBuscador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> opcionesBuscador;
    private javax.swing.JTable tablaMaquinas;
    // End of variables declaration//GEN-END:variables
}
