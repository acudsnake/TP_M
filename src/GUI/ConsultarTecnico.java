package GUI;
import clases.Fichero;
import clases.Planta;
import clases.Proceso;
import clases.Tecnico;
import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class ConsultarTecnico extends javax.swing.JPanel {
    DefaultTableModel model = new DefaultTableModel();
    TableRowSorter trs;
    int sel=0;
    
    public ConsultarTecnico() {
        initComponents();
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("Contacto");
        model.addColumn("DNI");
        model.addColumn("Fecha nacimiento");
        model.addColumn("ID");
        model.addColumn("Cant. Maquinas");
        imprimir_tabla();
    }

   public void imprimir_tabla(){
        model.setRowCount(0);
        ArrayList<Tecnico> lista_tecnico= Fichero.leerTecnicos();
        int i=0;
        while (i < lista_tecnico.size()) {
            int cant_maquinas=Fichero.retornarMaquinasAsignadas(lista_tecnico.get(i)).size();
            
             model.addRow(new String[]{
                 lista_tecnico.get(i).getNombre(), 
                 lista_tecnico.get(i).getApellido(), 
                 lista_tecnico.get(i).getContacto(), 
                 String.valueOf(lista_tecnico.get(i).getDNI()) ,
                 lista_tecnico.get(i).getFechaNacimiento().getDayOfMonth() + "/" + 
                 lista_tecnico.get(i).getFechaNacimiento().getMonthValue()+ "/" +
                 lista_tecnico.get(i).getFechaNacimiento().getYear(),
                 String.valueOf(lista_tecnico.get(i).getID()),
                 String.valueOf(cant_maquinas)
                 });
             i++;
        }
        Table.setModel(model);
    }

   public void imprimir_tabla_sin(){
        model.setRowCount(0);
        ArrayList<Tecnico> lista_tecnico= Fichero.retornarTecnicosNOAsignados();
        int i=0;
        while (i < lista_tecnico.size()) {
            int cant_maquinas=Fichero.retornarMaquinasAsignadas(lista_tecnico.get(i)).size();
            
             model.addRow(new String[]{
                 lista_tecnico.get(i).getNombre(), 
                 lista_tecnico.get(i).getApellido(), 
                 lista_tecnico.get(i).getContacto(), 
                 String.valueOf(lista_tecnico.get(i).getDNI()) ,
                 lista_tecnico.get(i).getFechaNacimiento().getDayOfMonth() + "/" + 
                 lista_tecnico.get(i).getFechaNacimiento().getMonthValue()+ "/" +
                 lista_tecnico.get(i).getFechaNacimiento().getYear(),
                 String.valueOf(lista_tecnico.get(i).getID()),
                 String.valueOf(cant_maquinas)
                 });
             i++;
        }
        Table.setModel(model);
    }
   
   public void imprimir_tabla_con(){
        model.setRowCount(0);
        ArrayList<Tecnico> lista_tecnico= Fichero.retornarTecnicosAsignados();
        int i=0;
        while (i < lista_tecnico.size()) {
            int cant_maquinas=Fichero.retornarMaquinasAsignadas(lista_tecnico.get(i)).size();
            
             model.addRow(new String[]{
                 lista_tecnico.get(i).getNombre(), 
                 lista_tecnico.get(i).getApellido(), 
                 lista_tecnico.get(i).getContacto(), 
                 String.valueOf(lista_tecnico.get(i).getDNI()) ,
                 lista_tecnico.get(i).getFechaNacimiento().getDayOfMonth() + "/" + 
                 lista_tecnico.get(i).getFechaNacimiento().getMonthValue()+ "/" +
                 lista_tecnico.get(i).getFechaNacimiento().getYear(),
                 String.valueOf(lista_tecnico.get(i).getID()),
                 String.valueOf(cant_maquinas)
                 });
             i++;
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
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
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

        Seleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Apellido", "Contacto", "DNI", "Fecha nacimiento", "ID", "Cant. Maquinas" }));
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

        jRadioButton2.setText("Sin maquinas asignadas");
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseClicked(evt);
            }
        });

        jRadioButton1.setText("Con maquinas asignadas");
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton1MouseClicked(evt);
            }
        });
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addComponent(Buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Seleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)))
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton1))
                .addGap(63, 63, 63))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(8, 8, 8)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Buscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Seleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
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
        Menu_Tecnico volver= new Menu_Tecnico();
        volver.setSize(736,449);
        volver.setLocation(0,0);
        Background.setLayout(new BorderLayout());
        Background.removeAll();
        Background.add(volver, BorderLayout.CENTER);
        Background.revalidate();
        Background.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionActionPerformed
        String selected = (String) Seleccion.getSelectedItem();
        if (selected.equals("Nombre")) 
            sel=0;
        if (selected.equals("Apellido")) 
            sel=1;
        if (selected.equals("Contacto")) 
            sel=2;
        if (selected.equals("DNI")) 
            sel=3;
        if (selected.equals("Fecha de nacimiento")) 
            sel=4;
        if (selected.equals("ID")) 
            sel=5;
        if (selected.equals("Cant. Maquinas")) 
            sel=6;
    }//GEN-LAST:event_SeleccionActionPerformed

    private void BuscadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscadorKeyTyped
        Buscador.addKeyListener(new KeyAdapter(){
        @Override
        public void keyReleased(KeyEvent ke){
            trs.setRowFilter(RowFilter.regexFilter(Buscador.getText(), sel));
        }
        });
        trs= new TableRowSorter(model);
        Table.setRowSorter(trs);
    }//GEN-LAST:event_BuscadorKeyTyped

    private void jRadioButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2MouseClicked
        if(jRadioButton2.isSelected()){
            jRadioButton1.setSelected(false);
            imprimir_tabla_sin();
        }
        else
        imprimir_tabla();
    }//GEN-LAST:event_jRadioButton2MouseClicked

    private void jRadioButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton1MouseClicked
        if(jRadioButton1.isSelected()){
            jRadioButton2.setSelected(false);
            imprimir_tabla_con();
        }
        else
        imprimir_tabla();
    }//GEN-LAST:event_jRadioButton1MouseClicked

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed

    }//GEN-LAST:event_jRadioButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JTextField Buscador;
    private javax.swing.JComboBox<String> Seleccion;
    private javax.swing.JTable Table;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
