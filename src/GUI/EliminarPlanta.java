package GUI;
import clases.Fichero;
import clases.*;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class EliminarPlanta extends javax.swing.JPanel {
    DefaultTableModel model = new DefaultTableModel();
    
    public EliminarPlanta() {
        initComponents();
        imprimir_tabla();
    }
 

    public void imprimir_tabla(){
           Table.setDefaultRenderer(Object.class, new Render());
           String [] columnas= new String[]{"Color", "Superficie", "ID","Selecionado"};
           boolean [] editable= {false, false, false, true};
           Class[] types =new Class[]{
               java.lang.Object.class, 
               java.lang.Object.class, 
               java.lang.Object.class, 
               java.lang.Boolean.class};
           DefaultTableModel model = new DefaultTableModel(columnas, 0){
           public Class getColumnClass(int i){
               return types[i];
           }
           public boolean isCellEditable(int row, int column){
               return editable[column];
           }
           };
           limpiar(Table, model);
           Object[] datos= new Object[columnas.length];    
           ArrayList<Planta> lista_platas= Fichero.leerPlantas();
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

    public void limpiar(JTable tabla, DefaultTableModel modelo){
        if(modelo.getRowCount()>0){
            for(int i=0; i<tabla.getRowCount(); i++){
            modelo.removeRow(i);
            i-=1;
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

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
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table);

        jLabel1.setText("Buscar");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Color", "Superficie", "Cant. Maquinas", "Cant. Procesos" }));

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
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            if((Boolean) Table.getValueAt(i, 3)){
                seleccion++;
                Planta p= new Planta((String) Table.getValueAt(i, 0), (int) Table.getValueAt(i, 1));
                p.setId((int) Table.getValueAt(i, 2));
                lista.add(p);
            }
        }
        if(seleccion>0){
            for(int i=0; i<lista.size(); i++){
                Fichero.eliminarPlanta(lista.get(i));
                
                //Eliminar maquinas que tenia asignadas
                ArrayList<Maquina> maquinas= Fichero.leerMaquinas();
                for(int i2=0; i2<maquinas.size(); i2++){
                    if(maquinas.get(i2).getPlantaId()==lista.get(i).getId())
                        Fichero.eliminarMaquina(maquinas.get(i2));
                }
                
                //eliminar o desasignar procesos que tenia asignado
                Fichero.eliminarPlantas_Procesos(lista.get(i));
                ArrayList<Proceso> procesos= new ArrayList();
                procesos= Fichero.leerProcesos();
                for(int i2=0; i2<procesos.size(); i2++){
                    if(!Fichero.verificar_si_proceso_esta_asignado(procesos.get(i2))){
                        Fichero.eliminarProceso(procesos.get(i2));
                    }    
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
        /*int selectedRow = Table.getSelectedRow();
            if ((Boolean)Table.getValueAt(selectedRow , 3)) {
               for (int i = 0; i < Table.getRowCount(); i++) {
               if ( i != selectedRow) {
                  Table.setValueAt(false, i, 3);
               }
             }
        }*/
    }//GEN-LAST:event_TableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JTable Table;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
